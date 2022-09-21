package typings.nodeJsonDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iadapterMod {
  
  trait IAdapter[T] extends StObject {
    
    /**
      * Read the data from the medium
      */
    def readAsync(): js.Promise[T | Null]
    
    /**
      * Write date into the medium
      * @param data
      */
    def writeAsync(data: T): js.Promise[Unit]
  }
  object IAdapter {
    
    inline def apply[T](readAsync: () => js.Promise[T | Null], writeAsync: T => js.Promise[Unit]): IAdapter[T] = {
      val __obj = js.Dynamic.literal(readAsync = js.Any.fromFunction0(readAsync), writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[IAdapter[T]]
    }
    
    extension [Self <: IAdapter[?], T](x: Self & IAdapter[T]) {
      
      inline def setReadAsync(value: () => js.Promise[T | Null]): Self = StObject.set(x, "readAsync", js.Any.fromFunction0(value))
      
      inline def setWriteAsync(value: T => js.Promise[Unit]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait IFileAdapter[T]
    extends StObject
       with IAdapter[T] {
    
    /**
      * Name of the file used by the file adapter
      */
    val filename: String
  }
  object IFileAdapter {
    
    inline def apply[T](filename: String, readAsync: () => js.Promise[T | Null], writeAsync: T => js.Promise[Unit]): IFileAdapter[T] = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], readAsync = js.Any.fromFunction0(readAsync), writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[IFileAdapter[T]]
    }
    
    extension [Self <: IFileAdapter[?], T](x: Self & IFileAdapter[T]) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}

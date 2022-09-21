package typings.nedbLogger

import typings.nedbLogger.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nedb-logger", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NeDBLoggerDataStore {
    def this(path: String) = this()
    def this(path: Filename) = this()
  }
  
  @js.native
  trait NeDBLoggerDataStore extends StObject {
    
    /**
      * Insert a new document
      * @param cb Optional callback, signature: err, insertedDoc
      */
    def insert[T](newDoc: T): Unit = js.native
    def insert[T](newDoc: T, cb: js.Function2[/* err */ js.Error, /* document */ T, Unit]): Unit = js.native
  }
}

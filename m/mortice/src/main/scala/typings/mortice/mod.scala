package typings.mortice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mortice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Mortice = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Mortice]
  inline def default(options: MorticeOptions): Mortice = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Mortice]
  
  trait Mortice extends StObject {
    
    def readLock(): js.Promise[Release]
    
    def writeLock(): js.Promise[Release]
  }
  object Mortice {
    
    inline def apply(readLock: () => js.Promise[Release], writeLock: () => js.Promise[Release]): Mortice = {
      val __obj = js.Dynamic.literal(readLock = js.Any.fromFunction0(readLock), writeLock = js.Any.fromFunction0(writeLock))
      __obj.asInstanceOf[Mortice]
    }
    
    extension [Self <: Mortice](x: Self) {
      
      inline def setReadLock(value: () => js.Promise[Release]): Self = StObject.set(x, "readLock", js.Any.fromFunction0(value))
      
      inline def setWriteLock(value: () => js.Promise[Release]): Self = StObject.set(x, "writeLock", js.Any.fromFunction0(value))
    }
  }
  
  trait MorticeImplementation extends StObject {
    
    var isWorker: Boolean
    
    def readLock(name: String, options: MorticeOptions): js.Function0[js.Promise[Release]]
    
    def writeLock(name: String, options: MorticeOptions): js.Function0[js.Promise[Release]]
  }
  object MorticeImplementation {
    
    inline def apply(
      isWorker: Boolean,
      readLock: (String, MorticeOptions) => js.Function0[js.Promise[Release]],
      writeLock: (String, MorticeOptions) => js.Function0[js.Promise[Release]]
    ): MorticeImplementation = {
      val __obj = js.Dynamic.literal(isWorker = isWorker.asInstanceOf[js.Any], readLock = js.Any.fromFunction2(readLock), writeLock = js.Any.fromFunction2(writeLock))
      __obj.asInstanceOf[MorticeImplementation]
    }
    
    extension [Self <: MorticeImplementation](x: Self) {
      
      inline def setIsWorker(value: Boolean): Self = StObject.set(x, "isWorker", value.asInstanceOf[js.Any])
      
      inline def setReadLock(value: (String, MorticeOptions) => js.Function0[js.Promise[Release]]): Self = StObject.set(x, "readLock", js.Any.fromFunction2(value))
      
      inline def setWriteLock(value: (String, MorticeOptions) => js.Function0[js.Promise[Release]]): Self = StObject.set(x, "writeLock", js.Any.fromFunction2(value))
    }
  }
  
  trait MorticeOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var singleProcess: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MorticeOptions {
    
    inline def apply(): MorticeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MorticeOptions]
    }
    
    extension [Self <: MorticeOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      inline def setSingleProcessUndefined: Self = StObject.set(x, "singleProcess", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type Release = js.Function0[Unit]
}

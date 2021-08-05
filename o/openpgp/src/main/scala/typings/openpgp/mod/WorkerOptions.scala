package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOptions extends StObject {
  
  /**
    * number of workers to initialize
    */
  var n: js.UndefOr[Double] = js.undefined
  
  /**
    * relative path to the worker scripts, default: 'openpgp.worker.js'
    */
  var path: String
  
  /**
    * alternative to path parameter: web workers initialized with 'openpgp.worker.js'
    */
  var workers: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object WorkerOptions {
  
  inline def apply(path: String): WorkerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  
  extension [Self <: WorkerOptions](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setWorkers(value: js.Array[js.Any]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    inline def setWorkersVarargs(value: js.Any*): Self = StObject.set(x, "workers", js.Array(value :_*))
  }
}

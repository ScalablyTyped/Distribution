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
  
  @scala.inline
  def apply(path: String): WorkerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit class WorkerOptionsMutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkers(value: js.Array[js.Any]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    @scala.inline
    def setWorkersVarargs(value: js.Any*): Self = StObject.set(x, "workers", js.Array(value :_*))
  }
}

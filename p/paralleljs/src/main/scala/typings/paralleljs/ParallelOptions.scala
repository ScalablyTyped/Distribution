package typings.paralleljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelOptions extends StObject {
  
  /**
    * This is the path to the file eval.js.  This is required when running in node, and required for some browsers (IE 10) in order to work around cross-domain restrictions for web workers.  Defaults to the same location as parallel.js in node environments, and null in the browser.
    **/
  var evalPath: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of permitted worker threads.  This will default to 4, or the number of cpus on your computer if you're running node.
    **/
  var maxWorkers: js.UndefOr[Double] = js.undefined
  
  /**
    * If webworkers are not available, whether or not to fall back to synchronous processing using setTimeout.  Defaults to true.
    **/
  var synchronous: js.UndefOr[Boolean] = js.undefined
}
object ParallelOptions {
  
  inline def apply(): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelOptions]
  }
  
  extension [Self <: ParallelOptions](x: Self) {
    
    inline def setEvalPath(value: String): Self = StObject.set(x, "evalPath", value.asInstanceOf[js.Any])
    
    inline def setEvalPathUndefined: Self = StObject.set(x, "evalPath", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}

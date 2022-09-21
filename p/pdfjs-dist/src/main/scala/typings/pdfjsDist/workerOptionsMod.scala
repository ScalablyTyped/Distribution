package typings.pdfjsDist

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerOptionsMod {
  
  @JSImport("pdfjs-dist/types/src/display/worker_options", "GlobalWorkerOptions")
  @js.native
  val GlobalWorkerOptions: GlobalWorkerOptionsType = js.native
  
  trait GlobalWorkerOptionsType extends StObject {
    
    /**
      * - Defines global port for worker
      * process. Overrides the `workerSrc` option.
      */
    var workerPort: Worker | Null
    
    /**
      * - A string containing the path and filename
      * of the worker file.
      *
      * NOTE: The `workerSrc` option should always be set, in order to prevent any
      * issues when using the PDF.js library.
      */
    var workerSrc: String
  }
  object GlobalWorkerOptionsType {
    
    inline def apply(workerSrc: String): GlobalWorkerOptionsType = {
      val __obj = js.Dynamic.literal(workerSrc = workerSrc.asInstanceOf[js.Any], workerPort = null)
      __obj.asInstanceOf[GlobalWorkerOptionsType]
    }
    
    extension [Self <: GlobalWorkerOptionsType](x: Self) {
      
      inline def setWorkerPort(value: Worker): Self = StObject.set(x, "workerPort", value.asInstanceOf[js.Any])
      
      inline def setWorkerPortNull: Self = StObject.set(x, "workerPort", null)
      
      inline def setWorkerSrc(value: String): Self = StObject.set(x, "workerSrc", value.asInstanceOf[js.Any])
    }
  }
}

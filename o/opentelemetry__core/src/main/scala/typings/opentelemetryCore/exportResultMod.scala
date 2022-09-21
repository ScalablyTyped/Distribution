package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportResultMod {
  
  @js.native
  sealed trait ExportResultCode extends StObject
  @JSImport("@opentelemetry/core/build/src/ExportResult", "ExportResultCode")
  @js.native
  object ExportResultCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExportResultCode & Double] = js.native
    
    @js.native
    sealed trait FAILED
      extends StObject
         with ExportResultCode
    /* 1 */ val FAILED: typings.opentelemetryCore.exportResultMod.ExportResultCode.FAILED & Double = js.native
    
    @js.native
    sealed trait SUCCESS
      extends StObject
         with ExportResultCode
    /* 0 */ val SUCCESS: typings.opentelemetryCore.exportResultMod.ExportResultCode.SUCCESS & Double = js.native
  }
  
  trait ExportResult extends StObject {
    
    var code: ExportResultCode
    
    var error: js.UndefOr[js.Error] = js.undefined
  }
  object ExportResult {
    
    inline def apply(code: ExportResultCode): ExportResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportResult]
    }
    
    extension [Self <: ExportResult](x: Self) {
      
      inline def setCode(value: ExportResultCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}

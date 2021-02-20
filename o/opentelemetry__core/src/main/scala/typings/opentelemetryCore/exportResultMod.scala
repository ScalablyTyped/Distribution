package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportResultMod {
  
  @js.native
  sealed trait ExportResult extends StObject
  @JSImport("@opentelemetry/core/build/src/ExportResult", "ExportResult")
  @js.native
  object ExportResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExportResult with Double] = js.native
    
    @js.native
    sealed trait FAILED_NOT_RETRYABLE extends ExportResult
    /* 1 */ val FAILED_NOT_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_NOT_RETRYABLE with Double = js.native
    
    @js.native
    sealed trait FAILED_RETRYABLE extends ExportResult
    /* 2 */ val FAILED_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_RETRYABLE with Double = js.native
    
    @js.native
    sealed trait SUCCESS extends ExportResult
    /* 0 */ val SUCCESS: typings.opentelemetryCore.exportResultMod.ExportResult.SUCCESS with Double = js.native
  }
}

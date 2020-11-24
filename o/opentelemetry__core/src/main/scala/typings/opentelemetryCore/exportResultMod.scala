package typings.opentelemetryCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/ExportResult", JSImport.Namespace)
@js.native
object exportResultMod extends js.Object {
  
  @js.native
  sealed trait ExportResult extends js.Object
  @js.native
  object ExportResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExportResult with Double] = js.native
    
    @js.native
    sealed trait FAILED_NOT_RETRYABLE extends ExportResult
    /* 1 */ @js.native
    object FAILED_NOT_RETRYABLE extends TopLevel[FAILED_NOT_RETRYABLE with Double]
    
    @js.native
    sealed trait FAILED_RETRYABLE extends ExportResult
    /* 2 */ @js.native
    object FAILED_RETRYABLE extends TopLevel[FAILED_RETRYABLE with Double]
    
    @js.native
    sealed trait SUCCESS extends ExportResult
    /* 0 */ @js.native
    object SUCCESS extends TopLevel[SUCCESS with Double]
  }
}

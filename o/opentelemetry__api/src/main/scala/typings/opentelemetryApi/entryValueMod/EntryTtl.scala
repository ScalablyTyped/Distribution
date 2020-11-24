package typings.opentelemetryApi.entryValueMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntryTtl extends js.Object
@JSImport("@opentelemetry/api/build/src/correlation_context/EntryValue", "EntryTtl")
@js.native
object EntryTtl extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntryTtl with Double] = js.native
  
  /**
    * NO_PROPAGATION is considered to have local context and is used within the
    * process it created.
    */
  @js.native
  sealed trait NO_PROPAGATION extends EntryTtl
  /* 0 */ @js.native
  object NO_PROPAGATION extends TopLevel[NO_PROPAGATION with Double]
  
  /** UNLIMITED_PROPAGATION can propagate unlimited hops. */
  @js.native
  sealed trait UNLIMITED_PROPAGATION extends EntryTtl
  /* -1 */ @js.native
  object UNLIMITED_PROPAGATION extends TopLevel[UNLIMITED_PROPAGATION with Double]
}

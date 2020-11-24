package typings.officeUiFabricReact.hoverCardTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpenCardMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "OpenCardMode")
@js.native
object OpenCardMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenCardMode with Double] = js.native
  
  /**
    * Open card by hot key
    */
  @js.native
  sealed trait hotKey extends OpenCardMode
  /* 1 */ @js.native
  object hotKey extends TopLevel[hotKey with Double]
  
  /**
    * Open card by hover
    */
  @js.native
  sealed trait hover extends OpenCardMode
  /* 0 */ @js.native
  object hover extends TopLevel[hover with Double]
}

package typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeytipTransitionModifier extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", "KeytipTransitionModifier")
@js.native
object KeytipTransitionModifier extends js.Object {
  @js.native
  sealed trait alt extends KeytipTransitionModifier
  
  @js.native
  sealed trait ctrl extends KeytipTransitionModifier
  
  @js.native
  sealed trait meta extends KeytipTransitionModifier
  
  @js.native
  sealed trait shift extends KeytipTransitionModifier
  
  /* 2 */ val alt: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.alt with Double = js.native
  /* 1 */ val ctrl: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.ctrl with Double = js.native
  /* 3 */ val meta: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.meta with Double = js.native
  /* 0 */ val shift: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.shift with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeytipTransitionModifier with Double] = js.native
}


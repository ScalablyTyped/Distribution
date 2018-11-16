package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeytipTransitionModifier extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", "KeytipTransitionModifier")
@js.native
object KeytipTransitionModifier extends js.Object {
  @js.native
  sealed trait alt
    extends officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier
  
  @js.native
  sealed trait ctrl
    extends officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier
  
  @js.native
  sealed trait meta
    extends officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier
  
  @js.native
  sealed trait shift
    extends officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier
  
  /* 18 */ val alt: alt with scala.Double = js.native
  /* 17 */ val ctrl: ctrl with scala.Double = js.native
  /* 91 */ val meta: meta with scala.Double = js.native
  /* 16 */ val shift: shift with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier with scala.Double
  ] = js.native
}


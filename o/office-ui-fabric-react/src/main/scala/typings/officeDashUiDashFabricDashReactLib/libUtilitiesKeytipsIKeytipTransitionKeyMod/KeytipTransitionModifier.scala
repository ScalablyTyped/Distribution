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
  
  val alt: alt with java.lang.String = js.native
  val ctrl: ctrl with java.lang.String = js.native
  val meta: meta with java.lang.String = js.native
  val shift: shift with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier with java.lang.String
  ] = js.native
}


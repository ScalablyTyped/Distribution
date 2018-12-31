package typings
package officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipTreeNode extends js.Object {
  /**
    * List of keytip IDs that should become visible when this keytip is pressed, can be empty
    */
  var children: js.Array[java.lang.String]
  /**
    * T/F if this keytip's component is currently disabled
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on keytip activation)
    * Common cases are keytips in a menu or modal
    */
  var hasDynamicChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * ID of the <Keytip> DOM element. Needed to locate the correct keytip in the KeytipLayer's 'keytip' state array
    */
  var id: java.lang.String
  /**
    * KeySequence that invokes this KeytipTreeNode's onExecute function
    */
  var keySequences: js.Array[java.lang.String]
  /**
    * Control's execute function for when keytip is invoked, passed from the component to the Manager in the IKeytipProps
    */
  var onExecute: js.UndefOr[
    js.Function2[
      /* executeTarget */ reactLib.HTMLElement | scala.Null, 
      /* target */ reactLib.HTMLElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Function to execute when we return to this keytip
    */
  var onReturn: js.UndefOr[
    js.Function2[
      /* executeTarget */ reactLib.HTMLElement | scala.Null, 
      /* target */ reactLib.HTMLElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Overflow set sequence for this keytip
    */
  var overflowSetSequence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Parent keytip ID
    */
  var parent: java.lang.String
  /**
    * T/F if this keytip is a persisted keytip
    */
  var persisted: js.UndefOr[scala.Boolean] = js.undefined
}


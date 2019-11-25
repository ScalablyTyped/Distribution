package typings.officeDashUiDashFabricDashReact.libComponentsKeytipLayerIKeytipTreeNodeMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipTreeNode extends js.Object {
  /**
    * List of keytip IDs that should become visible when this keytip is pressed, can be empty
    */
  var children: js.Array[String]
  /**
    * T/F if this keytip's component is currently disabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on keytip activation)
    * Common cases are keytips in a menu or modal
    */
  var hasDynamicChildren: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * ID of the <Keytip> DOM element. Needed to locate the correct keytip in the KeytipLayer's 'keytip' state array
    */
  var id: String
  /**
    * KeySequence that invokes this KeytipTreeNode's onExecute function
    */
  var keySequences: js.Array[String]
  /**
    * Control's execute function for when keytip is invoked, passed from the component to the Manager in the IKeytipProps
    */
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  /**
    * Function to execute when we return to this keytip
    */
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  /**
    * Overflow set sequence for this keytip
    */
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Parent keytip ID
    */
  var parent: String
  /**
    * T/F if this keytip is a persisted keytip
    */
  var persisted: js.UndefOr[Boolean] = js.undefined
}

object IKeytipTreeNode {
  @scala.inline
  def apply(
    children: js.Array[String],
    id: String,
    keySequences: js.Array[String],
    parent: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasDynamicChildren: js.UndefOr[Boolean] = js.undefined,
    hasMenu: js.UndefOr[Boolean] = js.undefined,
    onExecute: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit = null,
    onReturn: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit = null,
    overflowSetSequence: js.Array[String] = null,
    persisted: js.UndefOr[Boolean] = js.undefined
  ): IKeytipTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicChildren)) __obj.updateDynamic("hasDynamicChildren")(hasDynamicChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMenu)) __obj.updateDynamic("hasMenu")(hasMenu.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction2(onExecute))
    if (onReturn != null) __obj.updateDynamic("onReturn")(js.Any.fromFunction2(onReturn))
    if (overflowSetSequence != null) __obj.updateDynamic("overflowSetSequence")(overflowSetSequence.asInstanceOf[js.Any])
    if (!js.isUndefined(persisted)) __obj.updateDynamic("persisted")(persisted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipTreeNode]
  }
}


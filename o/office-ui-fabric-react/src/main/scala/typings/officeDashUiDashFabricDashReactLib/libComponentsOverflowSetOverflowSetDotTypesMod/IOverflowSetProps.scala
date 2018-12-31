package typings
package officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSetProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotBaseMod.OverflowSetBase
    ] {
  /**
    * Class name
    */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IOverflowSet]] = js.native
  /**
    * If true do not contain the OverflowSet inside of a FocusZone,
    * otherwise the OverflowSet will contain a FocusZone.
    * If this is set to true focusZoneProps will be ignored.
    * Use one or the other.
    */
  var doNotContainWithinFocusZone: js.UndefOr[scala.Boolean] = js.native
  /**
    * Custom properties for OverflowSet's FocusZone.
    * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
    * Use one or the other.
    */
  var focusZoneProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
  ] = js.native
  /**
    * Function that will take in an IOverflowSetItemProps and return the subMenu for that item.
    * If not provided, will use 'item.subMenuProps.items' by default.
    * This is only used if your overflow set has keytips.
    */
  var itemSubMenuProvider: js.UndefOr[js.Function1[/* item */ IOverflowSetItemProps, js.UndefOr[js.Array[_]]]] = js.native
  /**
    * An array of items to be rendered by your onRenderItem function in the primary content area
    */
  var items: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.native
  /**
    * Optional full keytip sequence for the overflow button, if it will have a keytip.
    */
  var keytipSequences: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  @JSName("onRenderOverflowButton")
  var onRenderOverflowButton_Original: atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[js.Array[_]] = js.native
  /**
    * An array of items to be passed to overflow contextual menu
    */
  var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.native
  /**
    * The role for the OverflowSet.
    * @defaultvalue 'menubar'
    */
  var role: js.UndefOr[java.lang.String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]
  ] = js.native
  /**
    * Change item layout direction to vertical/stacked.
    * @defaultvalue false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.native
  /**
    * Method to call when trying to render an item.
    */
  def onRenderItem(item: IOverflowSetItemProps): js.Any = js.native
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  def onRenderOverflowButton(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def onRenderOverflowButton(props: js.Array[_]): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def onRenderOverflowButton(
    props: js.Array[_],
    defaultRender: js.Function1[
      /* props */ js.UndefOr[js.Array[_]], 
      reactLib.reactMod.Global.JSXNs.Element | scala.Null
    ]
  ): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}


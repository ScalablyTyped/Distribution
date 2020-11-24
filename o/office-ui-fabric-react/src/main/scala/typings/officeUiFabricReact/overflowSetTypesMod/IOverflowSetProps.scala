package typings.officeUiFabricReact.overflowSetTypesMod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.officeUiFabricReact.overflowSetBaseMod.OverflowSetBase
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverflowSetProps extends ClassAttributes[OverflowSetBase] {
  
  /**
    * Class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverflowSet]] = js.native
  
  /**
    * If true do not contain the OverflowSet inside of a FocusZone,
    * otherwise the OverflowSet will contain a FocusZone.
    * If this is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom properties for OverflowSet's FocusZone.
    * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  
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
  var keytipSequences: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Method to call when trying to render an item.
    */
  def onRenderItem(item: IOverflowSetItemProps): js.Any = js.native
  
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  var onRenderOverflowButton: IRenderFunction[js.Array[_]] = js.native
  
  /**
    * An array of items to be passed to overflow contextual menu
    */
  var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.native
  
  /**
    * Controls wether or not the overflow button is placed at the start or end of the items.
    * This gives a reveresed visual behavior but maintains correct keyboard navigation.
    * @defaultValue 'end'
    */
  var overflowSide: js.UndefOr[start | end] = js.native
  
  /**
    * The role for the OverflowSet.
    * @defaultvalue 'group'
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]] = js.native
  
  /**
    * Change item layout direction to vertical/stacked.
    * If role is set to `menubar`, `vertical={true}` will also add proper `aria-orientation`.
    * @defaultvalue false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object IOverflowSetProps {
  
  @scala.inline
  def apply(
    onRenderItem: IOverflowSetItemProps => js.Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], Element | Null]]) => Element | Null
  ): IOverflowSetProps = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    __obj.asInstanceOf[IOverflowSetProps]
  }
  
  @scala.inline
  implicit class IOverflowSetPropsOps[Self <: IOverflowSetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnRenderItem(value: IOverflowSetItemProps => js.Any): Self = this.set("onRenderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRenderOverflowButton(
      value: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderOverflowButton", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IOverflowSet | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IOverflowSet]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDoNotContainWithinFocusZone(value: Boolean): Self = this.set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotContainWithinFocusZone: Self = this.set("doNotContainWithinFocusZone", js.undefined)
    
    @scala.inline
    def setFocusZoneProps(value: IFocusZoneProps): Self = this.set("focusZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusZoneProps: Self = this.set("focusZoneProps", js.undefined)
    
    @scala.inline
    def setItemSubMenuProvider(value: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[_]]): Self = this.set("itemSubMenuProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemSubMenuProvider: Self = this.set("itemSubMenuProvider", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IOverflowSetItemProps*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IOverflowSetItemProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKeytipSequencesVarargs(value: String*): Self = this.set("keytipSequences", js.Array(value :_*))
    
    @scala.inline
    def setKeytipSequences(value: js.Array[String]): Self = this.set("keytipSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipSequences: Self = this.set("keytipSequences", js.undefined)
    
    @scala.inline
    def setOverflowItemsVarargs(value: IOverflowSetItemProps*): Self = this.set("overflowItems", js.Array(value :_*))
    
    @scala.inline
    def setOverflowItems(value: js.Array[IOverflowSetItemProps]): Self = this.set("overflowItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowItems: Self = this.set("overflowItems", js.undefined)
    
    @scala.inline
    def setOverflowSide(value: start | end): Self = this.set("overflowSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowSide: Self = this.set("overflowSide", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IOverflowSetProps => DeepPartial[IOverflowSetStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}

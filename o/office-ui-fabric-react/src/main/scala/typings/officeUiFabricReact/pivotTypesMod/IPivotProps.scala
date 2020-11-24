package typings.officeUiFabricReact.pivotTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.pivotBaseMod.PivotBase
import typings.officeUiFabricReact.pivotItemMod.PivotItem
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPivotProps
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[PivotBase] {
  
  /**
    * Optional callback to access the IPivot interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPivot]] = js.native
  
  /**
    * Default selected index for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedKey`.
    *
    * @deprecated Use `defaultSelectedKey`
    */
  var defaultSelectedIndex: js.UndefOr[Double] = js.native
  
  /**
    * Default selected key for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedIndex`.
    */
  var defaultSelectedKey: js.UndefOr[String] = js.native
  
  /**
    * Callback to customize how IDs are generated for each tab header.
    * Useful if you're rendering content outside and need to connect aria-labelledby.
    */
  var getTabId: js.UndefOr[js.Function2[/* itemKey */ String, /* index */ Double, String]] = js.native
  
  /**
    * Whether to skip rendering the tabpanel with the content of the selected tab.
    * Use this prop if you plan to separately render the tab content
    * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
    */
  var headersOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Index of the pivot item initially selected. Mutually exclusive with `initialSelectedKey`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedKey`
    */
  var initialSelectedIndex: js.UndefOr[Double] = js.native
  
  /**
    * Key of the pivot item initially selected. Mutually exclusive with `initialSelectedIndex`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedKey`
    */
  var initialSelectedKey: js.UndefOr[String] = js.native
  
  /**
    * PivotLinkFormat to use (links, tabs)
    */
  var linkFormat: js.UndefOr[PivotLinkFormat] = js.native
  
  /**
    * PivotLinkSize to use (normal, large)
    */
  var linkSize: js.UndefOr[PivotLinkSize] = js.native
  
  /**
    * Callback for when the selected pivot item is changed.
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[PivotItem], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Key of the selected pivot item. Updating this will override the Pivot's selected item state.
    * Only provide this if the pivot is a controlled component where you are maintaining the
    * current state; otherwise, use `defaultSelectedKey`.
    */
  var selectedKey: js.UndefOr[String | Null] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IPivotProps {
  
  @scala.inline
  def apply(): IPivotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotProps]
  }
  
  @scala.inline
  implicit class IPivotPropsOps[Self <: IPivotProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ IPivot | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPivot]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDefaultSelectedIndex(value: Double): Self = this.set("defaultSelectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedIndex: Self = this.set("defaultSelectedIndex", js.undefined)
    
    @scala.inline
    def setDefaultSelectedKey(value: String): Self = this.set("defaultSelectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedKey: Self = this.set("defaultSelectedKey", js.undefined)
    
    @scala.inline
    def setGetTabId(value: (/* itemKey */ String, /* index */ Double) => String): Self = this.set("getTabId", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetTabId: Self = this.set("getTabId", js.undefined)
    
    @scala.inline
    def setHeadersOnly(value: Boolean): Self = this.set("headersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadersOnly: Self = this.set("headersOnly", js.undefined)
    
    @scala.inline
    def setInitialSelectedIndex(value: Double): Self = this.set("initialSelectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSelectedIndex: Self = this.set("initialSelectedIndex", js.undefined)
    
    @scala.inline
    def setInitialSelectedKey(value: String): Self = this.set("initialSelectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSelectedKey: Self = this.set("initialSelectedKey", js.undefined)
    
    @scala.inline
    def setLinkFormat(value: PivotLinkFormat): Self = this.set("linkFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkFormat: Self = this.set("linkFormat", js.undefined)
    
    @scala.inline
    def setLinkSize(value: PivotLinkSize): Self = this.set("linkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSize: Self = this.set("linkSize", js.undefined)
    
    @scala.inline
    def setOnLinkClick(
      value: (/* item */ js.UndefOr[PivotItem], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onLinkClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLinkClick: Self = this.set("onLinkClick", js.undefined)
    
    @scala.inline
    def setSelectedKey(value: String): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
    
    @scala.inline
    def setSelectedKeyNull: Self = this.set("selectedKey", null)
    
    @scala.inline
    def setStylesFunction1(value: IPivotStyleProps => DeepPartial[IPivotStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}

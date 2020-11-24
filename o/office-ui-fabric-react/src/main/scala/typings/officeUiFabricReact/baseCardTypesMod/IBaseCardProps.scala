package typings.officeUiFabricReact.baseCardTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseCardProps[TComponent, TStyles, TStyleProps] extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Custom overriding props to Callout
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * Optional callback to access the TComponent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.native
  
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.bottomLeftEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * Make callout content show on the set side
    * @defaultvalue true
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  
  /**
    * Focus on first element by default on card or not
    */
  var firstFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The gap between the card and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  
  /**
    * Callback upon focus or mouse enter event
    */
  var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * Callback upon blur or mouse leave event
    */
  var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    *  Item to be returned with onRender functions
    */
  var renderData: js.UndefOr[js.Any] = js.native
  
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[
      TStyleProps, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
    ]
  ] = js.native
  
  /**
    * Element to anchor the card to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Trap focus or not
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
}
object IBaseCardProps {
  
  @scala.inline
  def apply[TComponent, TStyles, TStyleProps](): IBaseCardProps[TComponent, TStyles, TStyleProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseCardProps[TComponent, TStyles, TStyleProps]]
  }
  
  @scala.inline
  implicit class IBaseCardPropsOps[Self <: IBaseCardProps[_, _, _], TComponent, TStyles, TStyleProps] (val x: Self with (IBaseCardProps[TComponent, TStyles, TStyleProps])) extends AnyVal {
    
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
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[TComponent]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDirectionalHint(value: DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintFixed: Self = this.set("directionalHintFixed", js.undefined)
    
    @scala.inline
    def setFirstFocus(value: Boolean): Self = this.set("firstFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFocus: Self = this.set("firstFocus", js.undefined)
    
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSpace: Self = this.set("gapSpace", js.undefined)
    
    @scala.inline
    def setOnEnter(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnLeave(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    
    @scala.inline
    def setRenderData(value: js.Any): Self = this.set("renderData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderData: Self = this.set("renderData", js.undefined)
    
    @scala.inline
    def setStylesFunction1(
      value: TStyleProps => DeepPartial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
      */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
        ]
    ): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(
      value: IStyleFunctionOrObject[
          TStyleProps, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
      */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
        ]
    ): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTargetElement(value: HTMLElement): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
  }
}

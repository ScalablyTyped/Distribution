package typings.officeUiFabricReact.personaTypesMod

import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaProps extends IPersonaSharedProps {
  
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.native
  
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.native
}
object IPersonaProps {
  
  @scala.inline
  def apply(): IPersonaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaProps]
  }
  
  @scala.inline
  implicit class IPersonaPropsOps[Self <: IPersonaProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ IPersona | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPersona]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setOnRenderOptionalText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderOptionalText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderOptionalText: Self = this.set("onRenderOptionalText", js.undefined)
    
    @scala.inline
    def setOnRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPrimaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderPrimaryText: Self = this.set("onRenderPrimaryText", js.undefined)
    
    @scala.inline
    def setOnRenderSecondaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderSecondaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderSecondaryText: Self = this.set("onRenderSecondaryText", js.undefined)
    
    @scala.inline
    def setOnRenderTertiaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderTertiaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderTertiaryText: Self = this.set("onRenderTertiaryText", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IPersonaStyleProps => DeepPartial[IPersonaStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}

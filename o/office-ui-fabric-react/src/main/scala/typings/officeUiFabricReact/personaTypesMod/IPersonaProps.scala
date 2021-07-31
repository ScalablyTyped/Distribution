package typings.officeUiFabricReact.personaTypesMod

import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaProps
  extends StObject
     with IPersonaSharedProps {
  
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.undefined
  
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.undefined
}
object IPersonaProps {
  
  @scala.inline
  def apply(): IPersonaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaProps]
  }
  
  @scala.inline
  implicit class IPersonaPropsMutableBuilder[Self <: IPersonaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPersona]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IPersona | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setOnRenderOptionalText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderOptionalText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderOptionalTextUndefined: Self = StObject.set(x, "onRenderOptionalText", js.undefined)
    
    @scala.inline
    def setOnRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderPrimaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderPrimaryTextUndefined: Self = StObject.set(x, "onRenderPrimaryText", js.undefined)
    
    @scala.inline
    def setOnRenderSecondaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderSecondaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderSecondaryTextUndefined: Self = StObject.set(x, "onRenderSecondaryText", js.undefined)
    
    @scala.inline
    def setOnRenderTertiaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderTertiaryText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderTertiaryTextUndefined: Self = StObject.set(x, "onRenderTertiaryText", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IPersonaStyleProps => DeepPartial[IPersonaStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}

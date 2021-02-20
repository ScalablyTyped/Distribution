package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.large
import typings.officeUiFabricReact.officeUiFabricReactStrings.medium
import typings.officeUiFabricReact.officeUiFabricReactStrings.mediumPlus
import typings.officeUiFabricReact.officeUiFabricReactStrings.mega
import typings.officeUiFabricReact.officeUiFabricReactStrings.small
import typings.officeUiFabricReact.officeUiFabricReactStrings.smallPlus
import typings.officeUiFabricReact.officeUiFabricReactStrings.superLarge
import typings.officeUiFabricReact.officeUiFabricReactStrings.tiny
import typings.officeUiFabricReact.officeUiFabricReactStrings.xLarge
import typings.officeUiFabricReact.officeUiFabricReactStrings.xLargePlus
import typings.officeUiFabricReact.officeUiFabricReactStrings.xSmall
import typings.officeUiFabricReact.officeUiFabricReactStrings.xxLarge
import typings.officeUiFabricReact.officeUiFabricReactStrings.xxLargePlus
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.ReturnType
import typings.uifabricFoundation.anon.Slots
import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typings.uifabricFoundation.libIcomponentMod.IComponent
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIslotsMod.ISlotProp
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textTypesMod {
  
  type ITextComponent = IComponent[ITextProps, ITextTokens, ITextStyles, ITextProps, js.Object]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined theme, tokens, styles */ @js.native
  trait ITextProps
    extends HTMLAttributes[HTMLElement]
       with ITextSlots
       with Slots[ITextSlots] {
    
    /**
      * Optionally render the component as another component type or primitive.
      */
    var as: js.UndefOr[ElementType[HTMLAttributes[HTMLElement]]] = js.native
    
    /**
      * Whether the text is displayed as a block element.
      *
      * Note that in order for ellipsis on overflow to work properly,
      * `block` and `nowrap` should be set to true.
      */
    var block: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the text is not wrapped.
      *
      * Note that in order for ellipsis on overflow to work properly,
      * `block` and `nowrap` should be set to true.
      */
    var nowrap: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[ITextProps, ITextTokens]] = js.native
    
    /**
      * Optional font type for Text.
      */
    var variant: js.UndefOr[
        tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
      ] = js.native
  }
  object ITextProps {
    
    @scala.inline
    def apply(): ITextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextProps]
    }
    
    @scala.inline
    implicit class ITextPropsMutableBuilder[Self <: ITextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ElementType[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (ITextProps, /* theme */ ITheme, ITextTokens) => ITextStyles): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[ITextProps, ITextTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      @scala.inline
      def setVariant(
        value: tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
      ): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type ITextSlot = ISlotProp[ITextProps, String]
  
  @js.native
  trait ITextSlots extends StObject {
    
    var root: js.UndefOr[IHTMLSlot] = js.native
  }
  object ITextSlots {
    
    @scala.inline
    def apply(): ITextSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextSlots]
    }
    
    @scala.inline
    implicit class ITextSlotsMutableBuilder[Self <: ITextSlots] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IHTMLSlot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Text/Text.types.ITextSlots> */
  @js.native
  trait ITextStyles extends StObject {
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object ITextStyles {
    
    @scala.inline
    def apply(): ITextStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextStyles]
    }
    
    @scala.inline
    implicit class ITextStylesMutableBuilder[Self <: ITextStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type ITextStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles], js.Function]
  ]
  
  type ITextTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[ITextProps, ITextTokens], js.Function]]
  
  @js.native
  trait ITextTokens extends StObject
}

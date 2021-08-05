package typings.officeUiFabricReact

import typings.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typings.react.mod.ClassAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipLayerTypesMod {
  
  trait IKeytipLayer extends StObject
  
  trait IKeytipLayerProps
    extends StObject
       with ClassAttributes[IKeytipLayer] {
    
    /**
      * Optional callback to access the KeytipLayer component. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IKeytipLayer]] = js.undefined
    
    /**
      * String to put inside the layer to be used for the aria-describedby for the component with the keytip
      * Should be one of the starting sequences
      */
    var content: String
    
    /**
      * List of key sequences that will exit keytips mode
      */
    var keytipExitSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
    
    /**
      * List of key sequences that execute the return functionality in keytips
      * (going back to the previous level of keytips)
      */
    var keytipReturnSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
    
    /**
      * List of key sequences that will start keytips mode
      */
    var keytipStartSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
    
    /**
      * Callback function triggered when keytip mode is entered
      */
    var onEnterKeytipMode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function triggered when keytip mode is exited.
      * ev is the Mouse or Keyboard Event that triggered the exit, if any.
      */
    var onExitKeytipMode: js.UndefOr[
        js.Function1[
          /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * (Optional) Call to provide customized styling.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]] = js.undefined
  }
  object IKeytipLayerProps {
    
    inline def apply(content: String): IKeytipLayerProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipLayerProps]
    }
    
    extension [Self <: IKeytipLayerProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[IKeytipLayer]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IKeytipLayer | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKeytipExitSequences(value: js.Array[IKeytipTransitionKey]): Self = StObject.set(x, "keytipExitSequences", value.asInstanceOf[js.Any])
      
      inline def setKeytipExitSequencesUndefined: Self = StObject.set(x, "keytipExitSequences", js.undefined)
      
      inline def setKeytipExitSequencesVarargs(value: IKeytipTransitionKey*): Self = StObject.set(x, "keytipExitSequences", js.Array(value :_*))
      
      inline def setKeytipReturnSequences(value: js.Array[IKeytipTransitionKey]): Self = StObject.set(x, "keytipReturnSequences", value.asInstanceOf[js.Any])
      
      inline def setKeytipReturnSequencesUndefined: Self = StObject.set(x, "keytipReturnSequences", js.undefined)
      
      inline def setKeytipReturnSequencesVarargs(value: IKeytipTransitionKey*): Self = StObject.set(x, "keytipReturnSequences", js.Array(value :_*))
      
      inline def setKeytipStartSequences(value: js.Array[IKeytipTransitionKey]): Self = StObject.set(x, "keytipStartSequences", value.asInstanceOf[js.Any])
      
      inline def setKeytipStartSequencesUndefined: Self = StObject.set(x, "keytipStartSequences", js.undefined)
      
      inline def setKeytipStartSequencesVarargs(value: IKeytipTransitionKey*): Self = StObject.set(x, "keytipStartSequences", js.Array(value :_*))
      
      inline def setOnEnterKeytipMode(value: () => Unit): Self = StObject.set(x, "onEnterKeytipMode", js.Any.fromFunction0(value))
      
      inline def setOnEnterKeytipModeUndefined: Self = StObject.set(x, "onEnterKeytipMode", js.undefined)
      
      inline def setOnExitKeytipMode(
        value: /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])] => Unit
      ): Self = StObject.set(x, "onExitKeytipMode", js.Any.fromFunction1(value))
      
      inline def setOnExitKeytipModeUndefined: Self = StObject.set(x, "onExitKeytipMode", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IKeytipLayerStyleProps => DeepPartial[IKeytipLayerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait IKeytipLayerStyleProps extends StObject
  
  trait IKeytipLayerStyles extends StObject {
    
    var innerContent: IStyle
  }
  object IKeytipLayerStyles {
    
    inline def apply(): IKeytipLayerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeytipLayerStyles]
    }
    
    extension [Self <: IKeytipLayerStyles](x: Self) {
      
      inline def setInnerContent(value: IStyle): Self = StObject.set(x, "innerContent", value.asInstanceOf[js.Any])
      
      inline def setInnerContentNull: Self = StObject.set(x, "innerContent", null)
      
      inline def setInnerContentUndefined: Self = StObject.set(x, "innerContent", js.undefined)
    }
  }
}

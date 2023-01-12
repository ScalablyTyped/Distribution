package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.polite
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnouncedAnnouncedDottypesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<AnnouncedBase> * / any */ trait IAnnouncedProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Priority with which the screen reader should treat updates to this region
      * @default 'polite'
      */
    @JSName("aria-live")
    var `aria-live_IAnnouncedProps`: js.UndefOr[off | polite | assertive] = js.undefined
    
    /**
      * Optionally render the root of this component as another component type or primitive.
      * The custom type **must** preserve any children or native props passed in.
      * @default 'div'
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * The status message provided as screen reader output
      */
    var message: js.UndefOr[String] = js.undefined
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[js.Object, IAnnouncedStyles]] = js.undefined
  }
  object IAnnouncedProps {
    
    inline def apply(): IAnnouncedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnnouncedProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-live`(value: off | polite | assertive): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[js.Object, IAnnouncedStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: js.Object => DeepPartial[IAnnouncedStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Announced/Announced.types.IAnnouncedProps, 'className'> */
  trait IAnnouncedStyleProps extends StObject {
    
    var className: js.UndefOr[Any] = js.undefined
  }
  object IAnnouncedStyleProps {
    
    inline def apply(): IAnnouncedStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnnouncedStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait IAnnouncedStyles extends StObject {
    
    /**
      * Style override for the root element.
      */
    var root: IStyle
    
    /**
      * Style override for the screen reader text.
      */
    var screenReaderText: IStyle
  }
  object IAnnouncedStyles {
    
    inline def apply(): IAnnouncedStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnnouncedStyles] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      inline def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
    }
  }
}

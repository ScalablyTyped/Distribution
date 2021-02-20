package typings.officeUiFabricReact

import typings.officeUiFabricReact.announcedBaseMod.AnnouncedBase
import typings.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.polite
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announcedTypesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
  trait IAnnouncedProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Priority with which the screen reader should treat updates to this region
      * @default 'polite'
      */
    @JSName("aria-live")
    var `aria-live_IAnnouncedProps`: js.UndefOr[off | polite | assertive] = js.native
    
    /**
      * Optionally render the root of this component as another component type or primitive.
      * The custom type **must** preserve any children or native props passed in.
      * @default 'div'
      */
    var as: js.UndefOr[ElementType[_]] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    /**
      * The status message provided as screen reader output
      */
    var message: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[LegacyRef[AnnouncedBase]] = js.native
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[js.Object, IAnnouncedStyles]] = js.native
  }
  object IAnnouncedProps {
    
    @scala.inline
    def apply(): IAnnouncedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedProps]
    }
    
    @scala.inline
    implicit class IAnnouncedPropsMutableBuilder[Self <: IAnnouncedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-live`(value: off | polite | assertive): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[AnnouncedBase]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ AnnouncedBase | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[js.Object, IAnnouncedStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: js.Object => DeepPartial[IAnnouncedStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Announced/Announced.types.IAnnouncedProps, 'className'> */
  @js.native
  trait IAnnouncedStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object IAnnouncedStyleProps {
    
    @scala.inline
    def apply(): IAnnouncedStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedStyleProps]
    }
    
    @scala.inline
    implicit class IAnnouncedStylePropsMutableBuilder[Self <: IAnnouncedStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait IAnnouncedStyles extends StObject {
    
    /**
      * Style override for the root element.
      */
    var root: IStyle = js.native
    
    /**
      * Style override for the screen reader text.
      */
    var screenReaderText: IStyle = js.native
  }
  object IAnnouncedStyles {
    
    @scala.inline
    def apply(): IAnnouncedStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnouncedStyles]
    }
    
    @scala.inline
    implicit class IAnnouncedStylesMutableBuilder[Self <: IAnnouncedStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      @scala.inline
      def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
    }
  }
}

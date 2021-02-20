package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.layerBaseMod.LayerBase
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerTypesMod {
  
  @js.native
  trait ILayer extends StObject
  
  @js.native
  trait ILayerProps extends HTMLAttributes[HTMLDivElement | LayerBase] {
    
    /**
      * Optional callback to access the ILayer interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ILayer]] = js.native
    
    /**
      * When enabled, Layer allows events to bubble up from Layer content.
      * Traditionally Layer has not had this behavior. This prop preserves backwards compatibility by
      * default while allowing users to opt in to the new event bubbling functionality.
      */
    var eventBubblingEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The optional id property provided on a LayerHost that this Layer should render within. The LayerHost does
      * not need to be immediately available but once has been rendered, and if missing, we'll avoid trying
      * to render the Layer content until the host is available. If an id is not provided, we will render the Layer
      * content in a fixed position element rendered at the end of the document.
      */
    var hostId: js.UndefOr[String] = js.native
    
    /**
      * Whether the layer should be added as the first child of the host.
      * If true, the layer will be inserted as the first child of the host
      * By default, the layer will be appended at the end to the host
      */
    var insertFirst: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback for when the layer is mounted.
      */
    var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback for when the layer is mounted.
      * @deprecated Use onLayerDidMount.
      */
    var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback for when the layer is unmounted.
      */
    var onLayerWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ILayerProps {
    
    @scala.inline
    def apply(): ILayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILayerProps]
    }
    
    @scala.inline
    implicit class ILayerPropsMutableBuilder[Self <: ILayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[ILayer]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ILayer | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setEventBubblingEnabled(value: Boolean): Self = StObject.set(x, "eventBubblingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBubblingEnabledUndefined: Self = StObject.set(x, "eventBubblingEnabled", js.undefined)
      
      @scala.inline
      def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      @scala.inline
      def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      @scala.inline
      def setOnLayerDidMount(value: () => Unit): Self = StObject.set(x, "onLayerDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerDidMountUndefined: Self = StObject.set(x, "onLayerDidMount", js.undefined)
      
      @scala.inline
      def setOnLayerMounted(value: () => Unit): Self = StObject.set(x, "onLayerMounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerMountedUndefined: Self = StObject.set(x, "onLayerMounted", js.undefined)
      
      @scala.inline
      def setOnLayerWillUnmount(value: () => Unit): Self = StObject.set(x, "onLayerWillUnmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerWillUnmountUndefined: Self = StObject.set(x, "onLayerWillUnmount", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ILayerStyleProps => DeepPartial[ILayerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ILayerStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Check if Host
      */
    var isNotHost: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object ILayerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ILayerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILayerStyleProps]
    }
    
    @scala.inline
    implicit class ILayerStylePropsMutableBuilder[Self <: ILayerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsNotHost(value: Boolean): Self = StObject.set(x, "isNotHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNotHostUndefined: Self = StObject.set(x, "isNotHost", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILayerStyles extends StObject {
    
    /**
      * Style for the Fabric component.
      */
    var content: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the root element when fixed.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object ILayerStyles {
    
    @scala.inline
    def apply(): ILayerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILayerStyles]
    }
    
    @scala.inline
    implicit class ILayerStylesMutableBuilder[Self <: ILayerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}

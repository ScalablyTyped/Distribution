package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IBar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBarInPageEnablerMod {
  
  @JSImport("sap/m/BarInPageEnabler", JSImport.Default)
  @js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    */
  open class default () extends BarInPageEnabler
  /* static members */
  object default {
    
    @JSImport("sap/m/BarInPageEnabler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Adds the sapMBarChildClass to a control.
      */
    inline def addChildClassTo(
      /**
      * The sap.ui.core.Control to which the sapMBarChildClass will be added
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChildClassTo")(oControl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a new subclass of class sap.m.BarInPageEnabler with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarInPageEnabler]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarInPageEnabler],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a metadata object for class sap.m.BarInPageEnabler.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Renders the tooltip for the given control
      */
    inline def renderTooltip(
      /**
      * the RenderManager that can be used for writing to the render output buffer.
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTooltip")(oRM.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait BarContext extends StObject {
    
    var contextClass: js.UndefOr[String] = js.undefined
    
    var internalAriaLabel: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object BarContext {
    
    inline def apply(): BarContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarContext] (val x: Self) extends AnyVal {
      
      inline def setContextClass(value: String): Self = StObject.set(x, "contextClass", value.asInstanceOf[js.Any])
      
      inline def setContextClassUndefined: Self = StObject.set(x, "contextClass", js.undefined)
      
      inline def setInternalAriaLabel(value: String): Self = StObject.set(x, "internalAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setInternalAriaLabelUndefined: Self = StObject.set(x, "internalAriaLabel", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait BarContexts extends StObject {
    
    var footer: js.UndefOr[BarContext] = js.undefined
    
    var header: js.UndefOr[BarContext] = js.undefined
    
    var subheader: js.UndefOr[BarContext] = js.undefined
  }
  object BarContexts {
    
    inline def apply(): BarContexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarContexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarContexts] (val x: Self) extends AnyVal {
      
      inline def setFooter(value: BarContext): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: BarContext): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSubheader(value: BarContext): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    }
  }
  
  @js.native
  trait BarInPageEnabler
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets classes and HTML tag according to the context of the page.
      *
      * Possible contexts are header, footer, subheader.
      *
      * @returns `this` for chaining
      */
    def applyTagAndContextClassFor(/**
      * allowed values are header, footer, subheader.
      */
    sContext: String): IBar = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      *
      * @returns with all available contexts.
      */
    def getContext(): BarContexts = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the HTML tag of the root domref.
      *
      * @returns the HTML-tag
      */
    def getHTMLTag(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines whether the bar is sensitive to the container context.
      *
      * Implementation of the IBar interface.
      *
      * @returns isContextSensitive
      */
    def isContextSensitive(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Renders the HTML for the given control, using the provided {@link sap.ui.core.RenderManager}.
      */
    def render(
      /**
      * the RenderManager that can be used for writing to the render output buffer.
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the HTML tag of the root element.
      *
      * @returns `this` to allow method chaining
      */
    def setHTMLTag(/**
      * The new root element
      */
    sNewTag: String): IBar = js.native
  }
}

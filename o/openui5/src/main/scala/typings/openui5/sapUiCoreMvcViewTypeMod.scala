package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcViewTypeMod {
  
  /**
    * Specifies possible view types.
    *
    * **Note:** Typed views do not rely on a `ViewType`, it must be omitted in the view settings.
    *
    * See the {@link https://ui5.sap.com/#/topic/91f27e3e6f4d1014b6dd926db0e91070 documentation} for more information
    * on the different view types.
    */
  @JSImport("sap/ui/core/mvc/ViewType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewType & String] = js.native
    
    /* "HTML" */ val HTML: typings.openui5.sapUiCoreMvcViewTypeMod.ViewType.HTML & String = js.native
    
    /* "JS" */ val JS: typings.openui5.sapUiCoreMvcViewTypeMod.ViewType.JS & String = js.native
    
    /* "JSON" */ val JSON: typings.openui5.sapUiCoreMvcViewTypeMod.ViewType.JSON & String = js.native
    
    /* "Template" */ val Template: typings.openui5.sapUiCoreMvcViewTypeMod.ViewType.Template & String = js.native
    
    /* "XML" */ val XML: typings.openui5.sapUiCoreMvcViewTypeMod.ViewType.XML & String = js.native
  }
  
  @js.native
  sealed trait ViewType extends StObject
  /**
    * Specifies possible view types.
    *
    * **Note:** Typed views do not rely on a `ViewType`, it must be omitted in the view settings.
    *
    * See the {@link https://ui5.sap.com/#/topic/91f27e3e6f4d1014b6dd926db0e91070 documentation} for more information
    * on the different view types.
    */
  @JSImport("sap/ui/core/mvc/ViewType", "ViewType")
  @js.native
  object ViewType extends StObject {
    
    /**
      * @deprecated (since 1.108) - Consider using {@link sap.ui.core.mvx.XMLView XMLViews} or "typed views"
      * (view classes written in JavaScript) instead.
      *
      * HTML view
      */
    @js.native
    sealed trait HTML
      extends StObject
         with ViewType
    
    /**
      * @deprecated (since 1.90)
      *
      * JS View
      */
    @js.native
    sealed trait JS
      extends StObject
         with ViewType
    
    /**
      * JSON View
      */
    @js.native
    sealed trait JSON
      extends StObject
         with ViewType
    
    /**
      * @deprecated (since 1.56)
      *
      * Template View
      */
    @js.native
    sealed trait Template
      extends StObject
         with ViewType
    
    /**
      * XML view
      */
    @js.native
    sealed trait XML
      extends StObject
         with ViewType
  }
}

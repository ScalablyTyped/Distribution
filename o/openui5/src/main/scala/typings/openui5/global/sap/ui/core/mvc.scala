package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mvc {
  
  @JSGlobal("sap.ui.core.mvc.Controller")
  @js.native
  class Controller protected ()
    extends typings.openui5.sap.ui.core.mvc.Controller {
    /**
      * Instantiates a (MVC-style) controller. Consumers should call the constructor only in thetyped
      * controller scenario. In the generic controller use case, they should use{@link sap.ui.controller}
      * instead.
      * @param sName The name of the controller to instantiate. If a controller is defined as real
      * sub-class,                                  the "arguments" of the sub-class constructor should be
      * given instead.
      */
    def this(sName: String) = this()
    def this(sName: js.Array[_]) = this()
  }
  
  @JSGlobal("sap.ui.core.mvc.HTMLView")
  @js.native
  class HTMLView protected ()
    extends typings.openui5.sap.ui.core.mvc.HTMLView {
    /**
      * Constructor for a new mvc/HTMLView.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.mvc.JSONView")
  @js.native
  class JSONView protected ()
    extends typings.openui5.sap.ui.core.mvc.JSONView {
    /**
      * Constructor for a new mvc/JSONView.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.mvc.JSView")
  @js.native
  class JSView protected ()
    extends typings.openui5.sap.ui.core.mvc.JSView {
    /**
      * Constructor for a new mvc/JSView.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.mvc.TemplateView")
  @js.native
  class TemplateView protected ()
    extends typings.openui5.sap.ui.core.mvc.TemplateView {
    /**
      * Constructor for a new mvc/TemplateView.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.mvc.View")
  @js.native
  class View protected ()
    extends typings.openui5.sap.ui.core.mvc.View {
    /**
      * Constructor for a new View.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  object View {
    
    /**
      * Specifies possible view types
      */
    object mvc {
      
      @JSGlobal("sap.ui.core.mvc.View.mvc.ViewType")
      @js.native
      object ViewType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.mvc.View.mvc.ViewType with Double] = js.native
        
        /* 0 */ val HTML: typings.openui5.sap.ui.core.mvc.View.mvc.ViewType.HTML with Double = js.native
        
        /* 1 */ val JS: typings.openui5.sap.ui.core.mvc.View.mvc.ViewType.JS with Double = js.native
        
        /* 2 */ val JSON: typings.openui5.sap.ui.core.mvc.View.mvc.ViewType.JSON with Double = js.native
        
        /* 3 */ val Template: typings.openui5.sap.ui.core.mvc.View.mvc.ViewType.Template with Double = js.native
        
        /* 4 */ val XML: typings.openui5.sap.ui.core.mvc.View.mvc.ViewType.XML with Double = js.native
      }
    }
  }
  
  @JSGlobal("sap.ui.core.mvc.XMLView")
  @js.native
  /**
    * Constructor for a new mvc/XMLView.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.This class does not have its own settings, but all settings applicable to the base type{@link
    * sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View} can be used.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  class XMLView ()
    extends typings.openui5.sap.ui.core.mvc.XMLView {
    def this(mSettings: js.Any) = this()
    /**
      * Constructor for a new mvc/XMLView.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.This class does not have its own settings, but all settings applicable to the base type{@link
      * sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View} can be used.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  object XMLView {
    
    /**
      * Specifies the available preprocessor types for XMLViews
      */
    @JSGlobal("sap.ui.core.mvc.XMLView.PreprocessorType")
    @js.native
    object PreprocessorType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.mvc.XMLView.PreprocessorType with Double] = js.native
      
      /* 0 */ val CONTROLS: typings.openui5.sap.ui.core.mvc.XMLView.PreprocessorType.CONTROLS with Double = js.native
      
      /* 1 */ val VIEWXML: typings.openui5.sap.ui.core.mvc.XMLView.PreprocessorType.VIEWXML with Double = js.native
      
      /* 2 */ val XML: typings.openui5.sap.ui.core.mvc.XMLView.PreprocessorType.XML with Double = js.native
    }
  }
}

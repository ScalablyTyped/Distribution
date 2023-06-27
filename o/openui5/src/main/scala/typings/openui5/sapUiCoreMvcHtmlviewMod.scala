package typings.openui5

import typings.openui5.anon.Controller
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreMvcViewMod.ViewSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcHtmlviewMod {
  
  @JSImport("sap/ui/core/mvc/HTMLView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `HTMLView`.
    *
    * **Note:** Application code shouldn't call the constructor directly, but rather use the factory {@link sap.ui.core.mvc.HTMLView.create HTMLView.create }
    * or {@link sap.ui.core.mvc.View.create View.create} with type {@link sap.ui.core.mvc.ViewType.HTML HTML}.
    * The factory simplifies asynchronous loading of a view and future features might be added to the factory
    * only.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View }
    * can be used.
    */
  open class default ()
    extends typings.openui5.sapUiCoreMvcViewMod.default {
    def this(/**
      * initial settings for the new control
      */
    mSettings: HTMLViewSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: HTMLViewSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: HTMLViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/mvc/HTMLView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @since 1.30
      *
      * Flag for feature detection of asynchronous loading/rendering
      */
    @JSImport("sap/ui/core/mvc/HTMLView", "default.asyncSupport")
    @js.native
    def asyncSupport: Boolean = js.native
    inline def asyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncSupport")(x.asInstanceOf[js.Any])
    
    /**
      * @since 1.56.0
      *
      * Creates an instance of a declarative HTML view.
      *
      * @returns A promise which resolves with the created `HTMLView` instance
      */
    inline def create(/**
      * An object containing the view configuration options.
      */
    oOptions: Controller): js.Promise[HTMLView] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLView]]
    
    /**
      * Creates a new subclass of class sap.ui.core.mvc.HTMLView with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.mvc.View.extend}.
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
    oClassInfo: ClassInfo[T, HTMLView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HTMLView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.mvc.HTMLView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  type HTMLView = typings.openui5.sapUiCoreMvcViewMod.default
  
  type HTMLViewSettings = ViewSettings
}

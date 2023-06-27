package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreTmplTemplateMod.TemplateSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreTmplHandlebarsTemplateMod {
  
  @JSImport("sap/ui/core/tmpl/HandlebarsTemplate", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new handlebars template with the given `sId` and settings.
    *
    * The set of allowed entries in the `mSettings` object depends on the concrete subclass and is described
    * there.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.core.tmpl.Template#constructor sap.ui.core.tmpl.Template }
    * can be used.
    */
  open class default ()
    extends typings.openui5.sapUiCoreTmplTemplateMod.default {
    def this(/**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: HandlebarsTemplateSettings) = this()
    def this(/**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: HandlebarsTemplateSettings
    ) = this()
    def this(
      /**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: HandlebarsTemplateSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/tmpl/HandlebarsTemplate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.tmpl.HandlebarsTemplate with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.tmpl.Template.extend}.
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
    oClassInfo: ClassInfo[T, HandlebarsTemplate]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HandlebarsTemplate],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.tmpl.HandlebarsTemplate.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  type HandlebarsTemplate = typings.openui5.sapUiCoreTmplTemplateMod.default
  
  type HandlebarsTemplateSettings = TemplateSettings
}

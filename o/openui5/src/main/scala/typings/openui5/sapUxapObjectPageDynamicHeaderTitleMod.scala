package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapFDynamicPageTitleMod.DynamicPageTitleSettings
import typings.openui5.sapUxapLibraryMod.IHeaderTitle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageDynamicHeaderTitleMod {
  
  @JSImport("sap/uxap/ObjectPageDynamicHeaderTitle", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageDynamicHeaderTitle`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.f.DynamicPageTitle#constructor
    * sap.f.DynamicPageTitle} can be used.
    * See:
    * 	{@link topic:6e340c119ddd4c778b315f65a0432420 Object Page Dynamic Header}
    * 	{@link topic:d2ef0099542d44dc868719d908e576d0 Object Page Headers}
    * 	{@link topic:9c9d94fd28284539a9a5a57e9caf82a8 Object Page Headers Comparison}
    */
  open class default () extends ObjectPageDynamicHeaderTitle {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageDynamicHeaderTitleSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageDynamicHeaderTitleSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageDynamicHeaderTitleSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_uxap_IHeaderTitle: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageDynamicHeaderTitle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageDynamicHeaderTitle with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.f.DynamicPageTitle.extend}.
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
    oClassInfo: ClassInfo[T, ObjectPageDynamicHeaderTitle]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageDynamicHeaderTitle],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageDynamicHeaderTitle.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageDynamicHeaderTitle
    extends typings.openui5.sapFDynamicPageTitleMod.default
       with IHeaderTitle
  
  type ObjectPageDynamicHeaderTitleSettings = DynamicPageTitleSettings
}

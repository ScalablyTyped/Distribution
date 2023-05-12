package typings.openui5

import typings.openui5.anon.DisplayFormat
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDateTimeMod {
  
  @JSImport("sap/ui/model/odata/type/DateTime", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.DateTime`.
    */
  open class default () extends DateTime {
    def this(/**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object,
      /**
      * constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue validateValue} throws an error
      * if any constraint is violated
      */
    oConstraints: DisplayFormat
    ) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue validateValue} throws an error
      * if any constraint is violated
      */
    oConstraints: DisplayFormat
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/DateTime", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.DateTime with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.DateTimeBase.extend}.
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
    oClassInfo: ClassInfo[T, DateTime]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTime],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.DateTime.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DateTime
    extends typings.openui5.sapUiModelOdataTypeDateTimeBaseMod.default {
    
    /**
      * @SINCE 1.111.0
      *
      * Gets the model value according to this type's constraints and format options for the given date object
      * which represents a timestamp in the configured time zone. Validates the resulting value against the constraints
      * of this type instance.
      * See:
      * 	{@link sap.ui.core.Configuration.getTimezone}
      *
      * @returns The model representation for the given Date
      */
    def getModelValue(): js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default | Null = js.native
    def getModelValue(
      /**
      * The date object considering the configured time zone. Must be created via {@link module:sap/ui/core/date/UI5Date.getInstance}
      */
    oDate: js.Date
    ): js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default | Null = js.native
    def getModelValue(
      /**
      * The date object considering the configured time zone. Must be created via {@link module:sap/ui/core/date/UI5Date.getInstance}
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default
    ): js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default | Null = js.native
  }
}

package typings.openui5

import typings.openui5.anon.DefaultOperatorName
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldDynamicDateRangeConditionsTypeMod {
  
  @JSImport("sap/ui/mdc/field/DynamicDateRangeConditionsType", JSImport.Default)
  @js.native
  /**
    * Constructor for a `ConditionsType` to be used in `DynamicDateRange` control.
    */
  open class default ()
    extends typings.openui5.sapUiMdcFieldConditionsTypeMod.default {
    def this(/**
      * Formatting options
      */
    oFormatOptions: DefaultOperatorName) = this()
    def this(
      /**
      * Formatting options
      */
    oFormatOptions: Unit,
      /**
      * Value constraints
      */
    oConstraints: js.Object
    ) = this()
    def this(
      /**
      * Formatting options
      */
    oFormatOptions: DefaultOperatorName,
      /**
      * Value constraints
      */
    oConstraints: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/DynamicDateRangeConditionsType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.field.DynamicDateRangeConditionsType with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.field.ConditionsType.extend}.
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
    oClassInfo: ClassInfo[T, DynamicDateRangeConditionsType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicDateRangeConditionsType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.field.DynamicDateRangeConditionsType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  type DynamicDateRangeConditionsType = typings.openui5.sapUiMdcFieldConditionsTypeMod.default
}

package typings.openui5

import typings.openui5.anon.AdditionalType
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldConditionsTypeMod {
  
  @JSImport("sap/ui/mdc/field/ConditionsType", JSImport.Default)
  @js.native
  /**
    * Constructor for a Conditions type.
    */
  open class default () extends ConditionsType {
    def this(/**
      * Formatting options
      */
    oFormatOptions: AdditionalType) = this()
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
    oFormatOptions: AdditionalType,
      /**
      * Value constraints
      */
    oConstraints: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/ConditionsType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.field.ConditionsType with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.SimpleType.extend}.
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
    oClassInfo: ClassInfo[T, ConditionsType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ConditionsType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.field.ConditionsType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ConditionsType
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    
    /**
      * Formats the given conditions to an output value of the given target type. These values are formatted
      * using the given data type. Depending on the operator and the configuration (set in `FormatOptions`),
      * a description will be determined by a given value help or delegate.
      *
      * @returns The formatted output value or a `Promise` resolving with the formatted value
      */
    def formatValue(
      /**
      * The conditions to be formatted
      */
    aConditions: js.Array[ConditionObject],
      /**
      * The target type; see {@link https://ui5.sap.com/#/topic/ac56d92162ed47ff858fdf1ce26c18c4 Allowed Property Types}.
      * In addition to the standard target types, `sap.ui.mdc.raw` can be used. In this case the value is not
      * formatted and just forwarded to the target. If the value is an array representing data for a `CompositeType`,
      * the index of the needed raw value can be added to the name (For example, if a unit should be forwarded
      * as raw value, `sap.ui.mdc.raw:1` can be used).
      */
    sTargetType: String
    ): Any | js.Promise[Any] = js.native
    
    /**
      * Validates a given array of conditions. The values of the conditions are validated using the given data
      * type.
      *
      * @returns `undefined` or a `Promise` resolving with an undefined value
      */
    def validateValue(/**
      * The conditions that is validated
      */
    aConditions: js.Array[ConditionObject]): Unit | js.Promise[Any] = js.native
  }
}

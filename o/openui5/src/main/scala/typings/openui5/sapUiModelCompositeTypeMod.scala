package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelCompositeTypeMod {
  
  @JSImport("sap/ui/model/CompositeType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CompositeType.
    */
  open class default () extends CompositeType {
    def this(/**
      * Format options as defined by concrete subclasses
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Format options as defined by concrete subclasses
      */
    oFormatOptions: js.Object,
      /**
      * Constraints as defined by concrete subclasses
      */
    oConstraints: js.Object
    ) = this()
    def this(
      /**
      * Format options as defined by concrete subclasses
      */
    oFormatOptions: Unit,
      /**
      * Constraints as defined by concrete subclasses
      */
    oConstraints: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/CompositeType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.CompositeType with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, CompositeType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CompositeType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.CompositeType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait CompositeType
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    
    /**
      * Formats the given raw values to an output value of the given target type. This happens according to the
      * format options if the target type is `string`. If `aValues` is not defined or `null`, `null` is returned.
      *
      * @returns The formatted output value
      */
    def formatValue(
      /**
      * The values to be formatted
      */
    aValues: js.Array[Any],
      /**
      * The target type; see {@link https://ui5.sap.com/#/topic/ac56d92162ed47ff858fdf1ce26c18c4 Allowed Property Types}
      */
    sTargetType: String
    ): Any = js.native
    
    /**
      * Returns whether the {@link #parseValue} method requires the current binding values as a third parameter.
      *
      * @returns Whether the {@link #parseValue} method requires the current binding values as a third parameter
      */
    def getParseWithValues(): Boolean = js.native
    
    /**
      * @since 1.82.0
      *
      * Gets an array of indices that determine which parts of this type shall not propagate their model messages
      * to the attached control. Prerequisite is that the corresponding binding supports this feature, see {@link sap.ui.model.Binding#supportsIgnoreMessages}.
      * See:
      * 	sap.ui.model.Binding#supportsIgnoreMessages
      *
      * @returns An array of indices that determine which parts of this type shall not propagate their model
      * messages to the attached control
      */
    def getPartsIgnoringMessages(): js.Array[Double] = js.native
    
    /**
      * Returns whether the {@link #formatValue} and {@link #parseValue} methods operate on the internal, related
      * native JavaScript values.
      *
      * @returns Whether the {@link #formatValue} and {@link #parseValue} methods operate on the internal, related
      * native JavaScript values
      */
    def getUseInternalValues(): Boolean = js.native
    
    /**
      * Returns whether the {@link #formatValue} and {@link #parseValue} methods operate on the raw model values
      * instead of formatted values.
      *
      * @returns Whether the {@link #formatValue} and {@link #parseValue} methods operate on the raw model values
      * instead of formatted values
      */
    def getUseRawValues(): Boolean = js.native
    
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Any,
      /**
      * The source type (the expected type of `vValue`); see {@link https://ui5.sap.com/#/topic/ac56d92162ed47ff858fdf1ce26c18c4 Allowed Property Types}
      */
    sSourceType: String,
      /**
      * The current values of all binding parts; required if {@link #getParseWithValues} returns `true`
      */
    aCurrentValues: js.Array[Any]
    ): js.Array[Any] | Any = js.native
    
    /**
      * @since 1.100.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Processes the types of the parts of this composite type. A concrete composite type may override this
      * method if it needs to derive information from the types of the parts.
      */
    def processPartTypes(
      /**
      * Types of the composite binding's parts
      */
    aPartTypes: js.Array[typings.openui5.sapUiModelSimpleTypeMod.default]
    ): Unit = js.native
    
    /**
      * Validates whether the given raw values meet the defined constraints. This method does nothing if no constraints
      * are defined.
      */
    def validateValue(/**
      * The set of values to be validated
      */
    aValues: js.Array[Any]): Unit = js.native
  }
}

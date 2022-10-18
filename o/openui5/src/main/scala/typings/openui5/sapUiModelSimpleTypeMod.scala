package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelSimpleTypeMod {
  
  @JSImport("sap/ui/model/SimpleType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SimpleType.
    */
  open class default () extends SimpleType {
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
    
    @JSImport("sap/ui/model/SimpleType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.SimpleType with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Type.extend}.
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
    oClassInfo: ClassInfo[T, SimpleType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SimpleType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.SimpleType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait SimpleType
    extends typings.openui5.sapUiModelTypeMod.default {
    
    /**
      * Formats the given raw value to an output value of the given target type. This happens according to the
      * format options if the target type is `string`. If `vValue` is not defined or `null`, `null` is returned.
      *
      * @returns The formatted output value or a `Promise` resolving with the formatted value
      */
    def formatValue(
      /**
      * The value to be formatted
      */
    vValue: Any,
      /**
      * The target type; see {@link topic:ac56d92162ed47ff858fdf1ce26c18c4 Allowed Property Types}
      */
    sTargetType: String
    ): Any | js.Promise[Any] = js.native
    
    /**
      * Returns an object with `format` and `parse` methods. `format` converts the internal value which has a
      * JavaScript primitive type or is a built-in object such as Date which can be used by a control to the
      * raw value, and `parse` converts the raw value to the internal value.
      *
      * You may return an instance of {@link sap.ui.core.format.DateFormat DateFormat} or {@link sap.ui.core.format.NumberFormat
      * NumberFormat}.
      *
      * The default implementation of the `format` and `parse` methods simply returns the given parameter. Subclasses
      * of {@link sap.ui.model.SimpleType#constructor SimpleType} should override this method if the raw value
      * isn't already a JavaScript primitive type. The overwritten method must return an object which has the
      * `format` and `parse` methods implemented.
      *
      * Example:
      *  If the type is related to a JavaScript `Date` object, but the raw value isn't, this method should return
      * an instance of {@link sap.ui.core.format.DateFormat DateFormat}, which is able to convert between the
      * raw value and a JavaScript `Date` object.
      *
      * @returns A conversion object
      */
    def getModelFormat(): js.Object = js.native
    
    /**
      * Parses an external value of the given source type to the corresponding value in model representation.
      *
      * @returns The raw value or a `Promise` resolving with the raw value
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Any,
      /**
      * The type of the given value; see {@link topic:ac56d92162ed47ff858fdf1ce26c18c4 Allowed Property Types}
      */
    sSourceType: String
    ): Any | js.Promise[Any] = js.native
    
    /**
      * Validates whether a given raw value meets the defined constraints. This method does nothing if no constraints
      * are defined.
      *
      * @returns `undefined` or a `Promise` resolving with an undefined value
      */
    def validateValue(/**
      * The value to be validated
      */
    vValue: Any): Unit | js.Promise[Unit] = js.native
  }
}

package typings.openui5

import typings.openui5.anon.Interval
import typings.openui5.anon.`14`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeDateIntervalMod {
  
  @JSImport("sap/ui/model/type/DateInterval", JSImport.Default)
  @js.native
  /**
    * Constructor for a date interval type.
    */
  open class default () extends DateInterval {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
      */
    oFormatOptions: Interval) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
      */
    oFormatOptions: Unit,
      /**
      * Value constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: `14`
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
      */
    oFormatOptions: Interval,
      /**
      * Value constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: `14`
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/DateInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.DateInterval with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.CompositeType.extend}.
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
    oClassInfo: ClassInfo[T, DateInterval]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateInterval],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.DateInterval.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DateInterval
    extends typings.openui5.sapUiModelCompositeTypeMod.default {
    
    /**
      * @experimental (since 1.114.0)
      *
      * Returns a language-dependent placeholder text such as "e.g. " where  is formatted
      * using this type.
      *
      * @returns The language-dependent placeholder text or `undefined` if the type does not offer a placeholder
      */
    def getPlaceholderText(): js.UndefOr[String] = js.native
    
    /**
      * Parses the given value to an array of two values representing the start date and the end date of the
      * interval, where the time part of the start date is 0 and the time part of end date is the end of day
      * (23:59:59.999). If the `singleIntervalValue` format option is used, the second entry is `null` if no
      * end date is given.
      *
      * @returns The start and the end date of the interval. The resulting values in the array are:
      * 	 - Two `Date` or `module:sap/ui/core/date/UI5Date` objects, or
      * 	 - Two strings as formatted start and end dates based on the `source` format option, or
      * 	 - Two numbers, representing the milliseconds of the timestamps based on the UNIX epoch if the `source`
      *     format option is used and `source.pattern` is `"timestamp"`.
      */
    def parseValue(
      /**
      * The value to be parsed; the empty string is parsed to `[null, null]`
      */
    sValue: String,
      /**
      * The source type (the expected type of `sValue`); it must be either "string" or a type with "string" as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): js.Array[js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default | int | String | Null] = js.native
  }
}

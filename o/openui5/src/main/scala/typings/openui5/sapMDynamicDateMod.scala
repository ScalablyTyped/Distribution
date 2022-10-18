package typings.openui5

import typings.openui5.anon.Int
import typings.openui5.anon.Maximum
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateMod {
  
  @JSImport("sap/m/DynamicDate", JSImport.Default)
  @js.native
  /**
    * Constructor for a dynamic date range type.
    */
  open class default () extends DynamicDate {
    def this(/**
      * Format options. There are format options for each of the supported types of value parameters.
      */
    oFormatOptions: Int) = this()
    def this(
      /**
      * Format options. There are format options for each of the supported types of value parameters.
      */
    oFormatOptions: Unit,
      /**
      * Value constraints
      */
    oConstraints: Maximum
    ) = this()
    def this(
      /**
      * Format options. There are format options for each of the supported types of value parameters.
      */
    oFormatOptions: Int,
      /**
      * Value constraints
      */
    oConstraints: Maximum
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DynamicDate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DynamicDate with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DynamicDate]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicDate],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DynamicDate.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DynamicDate
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    
    /**
      * Formats the given object value to a similar object. The whole value is in the following format { operator:
      * "KEY", values: [...array with dates or numbers to be formatted]}. Only formats the 'values' part of the
      * given object. The dates are expected as 'timestamp' numbers and are converted to Javascript Date objects.
      * The numbers and strings are left untouched.
      *
      * @returns A value object in a similar form
      */
    def formatValue(/**
      * The value to be formatted
      */
    oValue: js.Object): js.Object = js.native
    
    /**
      * Parses the given object value to a similar object. The whole value is in the following format { operator:
      * "KEY", values: [...array with JS dates or numbers to be parsed]}. Only parses the 'values' part of the
      * given object. The dates are expected as Javascript Dates and are converted to timestamps. The numbers
      * and strings are left untouched. Special values with operator: "PARSEERROR" generate a parse exception.
      *
      * @returns A value object in a similar form
      */
    def parseValue(/**
      * The value to be parsed
      */
    oValue: js.Object): js.Object = js.native
  }
}

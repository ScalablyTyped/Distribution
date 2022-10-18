package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatFileSizeFormatMod {
  
  @JSImport("sap/ui/core/format/FileSizeFormat", JSImport.Default)
  @js.native
  open class default () extends FileSizeFormat
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/format/FileSizeFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.format.FileSizeFormat with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, FileSizeFormat]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FileSizeFormat],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Get an instance of the FileSizeFormat, which can be used for formatting.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale
      * formatLocale} will be used.
      *
      * @returns instance of the FileSizeFormat
      */
    inline def getInstance(): FileSizeFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[FileSizeFormat]
    inline def getInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: js.Object): FileSizeFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[FileSizeFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: js.Object,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): FileSizeFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[FileSizeFormat]
    inline def getInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): FileSizeFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[FileSizeFormat]
    
    /**
      * Returns a metadata object for class sap.ui.core.format.FileSizeFormat.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait FileSizeFormat
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    def format(/**
      * the number (or hex string) to format
      */
    oValue: String): String = js.native
    /**
      * Format a filesize (in bytes) according to the given format options.
      *
      * @returns the formatted output value
      */
    def format(/**
      * the number (or hex string) to format
      */
    oValue: Double): String = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      *
      * @returns the parsed value in bytes
      */
    def parse(/**
      * the string containing a formatted filesize value
      */
    sValue: String): Double = js.native
  }
}

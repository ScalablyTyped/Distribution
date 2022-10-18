package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreLocaleMod {
  
  @JSImport("sap/ui/core/Locale", JSImport.Default)
  @js.native
  open class default protected () extends Locale {
    /**
      * Creates an instance of the Locale.
      */
    def this(/**
      * the locale identifier, in format en-US or en_US.
      */
    sLocaleId: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Locale with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Locale]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Locale],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Locale.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Locale
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Get the locale extension as a single string or `null`.
      *
      * The extension always consists of a singleton character (not 'x'), a dash '-' and one or more extension
      * token, each separated again with a dash.
      *
      * Use {@link #getExtensions} to get the individual extension tokens as an array.
      *
      * @returns the extension or `null`
      */
    def getExtension(): String | Null = js.native
    
    /**
      * Get the locale extensions as an array of tokens.
      *
      * The leading singleton and the separating dashes are not part of the result. If there is no extensions
      * section in the locale tag, an empty array is returned.
      *
      * @returns the individual extension sections
      */
    def getExtensionSubtags(): js.Array[String] = js.native
    
    /**
      * Get the locale language.
      *
      * Note that the case might differ from the original script tag (Lower case is enforced as recommended by
      * BCP47/ISO639).
      *
      * @returns the language code
      */
    def getLanguage(): String = js.native
    
    /**
      * Get the locale private use section or `null`.
      *
      * @returns the private use section
      */
    def getPrivateUse(): String = js.native
    
    /**
      * Get the locale private use section as an array of tokens.
      *
      * The leading singleton and the separating dashes are not part of the result. If there is no private use
      * section in the locale tag, an empty array is returned.
      *
      * @returns the tokens of the private use section
      */
    def getPrivateUseSubtags(): js.Array[String] = js.native
    
    /**
      * Get the locale region or `null` if none was specified.
      *
      * Note that the case might differ from the original script tag (Upper case is enforced as recommended by
      * BCP47/ISO3166-1).
      *
      * @returns the ISO3166-1 region code (2-letter or 3-digits)
      */
    def getRegion(): String = js.native
    
    /**
      * @SINCE 1.17.0
      * @deprecated (since 1.44) - use {@link sap.ui.core.Configuration#getSAPLogonLanguage} instead as that
      * class allows to configure an SAP Logon language.
      *
      * Best guess to get a proper SAP Logon Language for this locale.
      *
      * Conversions taken into account:
      * 	 - use the language part only
      * 	 - convert old ISO639 codes to newer ones (e.g. 'iw' to 'he')
      * 	 - for Chinese, map 'Traditional Chinese' or region 'TW' to SAP proprietary code 'zf'
      * 	 - map private extensions x-saptrc, x-sappsd and saprigi to SAP pseudo languages '1Q', '2Q' and '3Q'
      *
      * 	 - remove ext. language sub tags
      * 	 - convert to uppercase
      *
      * Note that the conversion also returns a result for languages that are not supported by the default set
      * of SAP languages. This method has no knowledge about the concrete languages of any given backend system.
      *
      * @returns a language code that should
      */
    def getSAPLogonLanguage(): String = js.native
    
    /**
      * Get the locale script or `null` if none was specified.
      *
      * Note that the case might differ from the original language tag (Upper case first letter and lower case
      * reminder enforced as recommended by BCP47/ISO15924)
      *
      * @returns the script code or `null`
      */
    def getScript(): String | Null = js.native
    
    /**
      * Get the locale variants as a single string or `null`.
      *
      * Multiple variants are separated by a dash '-'.
      *
      * @returns the variant or `null`
      */
    def getVariant(): String | Null = js.native
    
    /**
      * Get the locale variants as an array of individual variants.
      *
      * The separating dashes are not part of the result. If there is no variant section in the locale tag, an
      * empty array is returned.
      *
      * @returns the individual variant sections
      */
    def getVariantSubtags(): js.Array[String] = js.native
  }
}

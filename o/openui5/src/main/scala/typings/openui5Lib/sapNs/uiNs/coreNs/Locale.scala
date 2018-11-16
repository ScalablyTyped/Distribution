package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Locale")
@js.native
class Locale protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Creates an instance of the Locale.
           * @param sLocaleId the locale identifier, in format en-US or en_US.
          */
  def this(sLocaleId: java.lang.String) = this()
  /**
           * Get the locale extension as a single string or null.The extension always consists of a singleton
           * character (not 'x'),a dash '-' and one or more extension token, each separatedagain with a dash.Use
           * {@link #getExtensions} to get the individual extension tokens as an array.
           * @returns the extension
          */
  def getExtension(): java.lang.String = js.native
  /**
           * Get the locale extensions as an array of tokens.The leading singleton and the separating dashes are
           * not part of the result.If there is no extensions section in the locale tag, an empty array is
           * returned.
           * @returns the individual extension sections
          */
  def getExtensionSubtags(): js.Array[java.lang.String] = js.native
  /**
           * Get the locale language.Note that the case might differ from the original script tag(Lower case is
           * enforced as recommended by BCP47/ISO639).
           * @returns the language code
          */
  def getLanguage(): java.lang.String = js.native
  /**
           * Get the locale private use section or null.
           * @returns the private use section
          */
  def getPrivateUse(): java.lang.String = js.native
  /**
           * Get the locale private use section
           * @returns the private use section
          */
  def getPrivateUseSubtags(): java.lang.String = js.native
  /**
           * Get the locale region or null if none was specified.Note that the case might differ from the
           * original script tag(Upper case is enforced as recommended by BCP47/ISO3166-1).
           * @returns the ISO3166-1 region code (2-letter or 3-digits)
          */
  def getRegion(): java.lang.String = js.native
  /**
           * Best guess to get a proper SAP Logon Language for this locale.Conversions taken into
           * account:<ul><li>use the language part only</li><li>convert old ISO639 codes to newer ones (e.g. 'iw'
           * to 'he')</li><li>for Chinese, map 'Traditional Chinese' to SAP proprietary code 'zf'</li><li>map
           * private extensions x-sap1q and x-sap2q to SAP pseudo languages '1Q' and '2Q'</li><li>remove ext.
           * language sub tags</li><li>convert to uppercase</li></ul>Note that the conversion also returns a
           * result for languages that are notsupported by the default set of SAP languages. This method has no
           * knowledgeabout the concrete languages of any given backend system.
           * @since 1.17.0
           * @returns a language code that should
          */
  def getSAPLogonLanguage(): java.lang.String = js.native
  /**
           * Get the locale script or null if none was specified.Note that the case might differ from the
           * original language tag(Upper case first letter and lower case reminder enforced asrecommended by
           * BCP47/ISO15924)
           * @returns the script code or null
          */
  def getScript(): java.lang.String = js.native
  /**
           * Get the locale variants as a single string or null.Multiple variants are separated by a dash '-'.
           * @returns the variant or null
          */
  def getVariant(): java.lang.String = js.native
  /**
           * Get the locale variants as an array of individual variants.The separating dashes are not part of the
           * result.If there is no variant section in the locale tag, an empty array is returned.
           * @returns the individual variant sections
          */
  def getVariantSubtags(): js.Array[java.lang.String] = js.native
}


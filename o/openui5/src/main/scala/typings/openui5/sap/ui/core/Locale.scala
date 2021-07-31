package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale
  extends StObject
     with Object {
  
  /**
    * Get the locale extension as a single string or null.The extension always consists of a singleton
    * character (not 'x'),a dash '-' and one or more extension token, each separatedagain with a dash.Use
    * {@link #getExtensions} to get the individual extension tokens as an array.
    * @returns the extension
    */
  def getExtension(): String = js.native
  
  /**
    * Get the locale extensions as an array of tokens.The leading singleton and the separating dashes are
    * not part of the result.If there is no extensions section in the locale tag, an empty array is
    * returned.
    * @returns the individual extension sections
    */
  def getExtensionSubtags(): js.Array[String] = js.native
  
  /**
    * Get the locale language.Note that the case might differ from the original script tag(Lower case is
    * enforced as recommended by BCP47/ISO639).
    * @returns the language code
    */
  def getLanguage(): String = js.native
  
  /**
    * Get the locale private use section or null.
    * @returns the private use section
    */
  def getPrivateUse(): String = js.native
  
  /**
    * Get the locale private use section
    * @returns the private use section
    */
  def getPrivateUseSubtags(): String = js.native
  
  /**
    * Get the locale region or null if none was specified.Note that the case might differ from the
    * original script tag(Upper case is enforced as recommended by BCP47/ISO3166-1).
    * @returns the ISO3166-1 region code (2-letter or 3-digits)
    */
  def getRegion(): String = js.native
  
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
  def getSAPLogonLanguage(): String = js.native
  
  /**
    * Get the locale script or null if none was specified.Note that the case might differ from the
    * original language tag(Upper case first letter and lower case reminder enforced asrecommended by
    * BCP47/ISO15924)
    * @returns the script code or null
    */
  def getScript(): String = js.native
  
  /**
    * Get the locale variants as a single string or null.Multiple variants are separated by a dash '-'.
    * @returns the variant or null
    */
  def getVariant(): String = js.native
  
  /**
    * Get the locale variants as an array of individual variants.The separating dashes are not part of the
    * result.If there is no variant section in the locale tag, an empty array is returned.
    * @returns the individual variant sections
    */
  def getVariantSubtags(): js.Array[String] = js.native
}

package typings.oauthDotJs.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OAuth")
@js.native
object ^ extends js.Object {
  var SignatureMethod: SignatureMethodStatic = js.native
  /** The difference between the correct time and my clock. */
  var timeCorrectionMsec: Double = js.native
  /**
    * Add specified parameters into URL as query parameters.
    * @param url URL that parameters added into.
    * @param parameters Parameters added into URL.
    * @return New URL string.
    */
  def addToURL(url: String, parameters: ParameterListOrMap): String = js.native
  /**
    * Fill in parameters to help construct a request message.
    * This function doesn't fill in every parameter.
    * @param message Target request message.
    * @param accessor Accessor object. The accessorSecret property is optional.
    */
  def completeRequest(message: Message, accessor: Accessor): Unit = js.native
  /** Generate timestamps starting with the given value. */
  def correctTimestamp(timestamp: Double): Unit = js.native
  /** Correct the time using a parameter from the URL from which the last script was loaded. */
  def correctTimestampFromSrc(): Unit = js.native
  def correctTimestampFromSrc(parameterName: String): Unit = js.native
  def decodeForm(form: String): ParameterList = js.native
  /**
    * Decode percent-encoded value.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target percent-encoded value.
    */
  def decodePercent(s: String): String = js.native
  def formEncode(parameters: ParameterListOrMap): String = js.native
  def getAuthorizationHeader(realm: String, parameters: String): String = js.native
  /** Construct the value of the Authorization header for an HTTP request. */
  def getAuthorizationHeader(realm: String, parameters: ParameterListOrMap): String = js.native
  def getParameter(parameters: String, name: String): String = js.native
  def getParameter(parameters: ParameterListOrMap, name: String): String = js.native
  /**
    * Convert the given parameters to an Array of name-value pairs.
    */
  def getParameterList(parameters: String): ParameterList = js.native
  /**
    * Convert the given parameters to an Array of name-value pairs.
    */
  def getParameterList(parameters: ParameterListOrMap): ParameterList = js.native
  /**
    * Convert the given parameters to a map from name to value.
    */
  def getParameterMap(parameters: String): ParameterMap = js.native
  /**
    * Convert the given parameters to a map from name to value.
    */
  def getParameterMap(parameters: ParameterListOrMap): ParameterMap = js.native
  def nonce(length: Double): String = js.native
  /**
    * Encode text value according to OAuth Percent Encoding.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text value.
    */
  def percentEncode(s: String): String = js.native
  /**
    * Encode text values according to OAuth Percent Encoding.
    * Encoded values are joined with an ampersand character (&) in between them.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text values.
    */
  def percentEncode(s: js.Array[String]): String = js.native
  def setParameter(message: Message, name: String, value: String): Unit = js.native
  def setParameters(message: Message, parameters: String): Unit = js.native
  def setParameters(message: Message, parameters: ParameterListOrMap): Unit = js.native
  def setTimestampAndNonce(message: Message): Unit = js.native
  def timestamp(): Double = js.native
}


package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OAuth")
@js.native
object ^ extends js.Object {
  var SignatureMethod: oauthDotJsLib.OAuthNs.SignatureMethodStatic = js.native
  /** The difference between the correct time and my clock. */
  var timeCorrectionMsec: scala.Double = js.native
  /**
    * Add specified parameters into URL as query parameters.
    * @param url URL that parameters added into.
    * @param parameters Parameters added into URL.
    * @return New URL string.
    */
  def addToURL(url: java.lang.String, parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): java.lang.String = js.native
  /**
    * Fill in parameters to help construct a request message.
    * This function doesn't fill in every parameter.
    * @param message Target request message.
    * @param accessor Accessor object. The accessorSecret property is optional.
    */
  def completeRequest(message: oauthDotJsLib.OAuthNs.Message, accessor: oauthDotJsLib.OAuthNs.Accessor): scala.Unit = js.native
  /** Generate timestamps starting with the given value. */
  def correctTimestamp(timestamp: scala.Double): scala.Unit = js.native
  /** Correct the time using a parameter from the URL from which the last script was loaded. */
  def correctTimestampFromSrc(): scala.Unit = js.native
  def correctTimestampFromSrc(parameterName: java.lang.String): scala.Unit = js.native
  def decodeForm(form: java.lang.String): oauthDotJsLib.OAuthNs.ParameterList = js.native
  /**
    * Decode percent-encoded value.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target percent-encoded value.
    */
  def decodePercent(s: java.lang.String): java.lang.String = js.native
  def formEncode(parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): java.lang.String = js.native
  def getAuthorizationHeader(realm: java.lang.String, parameters: java.lang.String): java.lang.String = js.native
  /** Construct the value of the Authorization header for an HTTP request. */
  def getAuthorizationHeader(realm: java.lang.String, parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): java.lang.String = js.native
  def getParameter(parameters: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def getParameter(parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap, name: java.lang.String): java.lang.String = js.native
  /**
    * Convert the given parameters to an Array of name-value pairs.
    */
  def getParameterList(parameters: java.lang.String): oauthDotJsLib.OAuthNs.ParameterList = js.native
  /**
    * Convert the given parameters to an Array of name-value pairs.
    */
  def getParameterList(parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): oauthDotJsLib.OAuthNs.ParameterList = js.native
  /**
    * Convert the given parameters to a map from name to value.
    */
  def getParameterMap(parameters: java.lang.String): oauthDotJsLib.OAuthNs.ParameterMap = js.native
  /**
    * Convert the given parameters to a map from name to value.
    */
  def getParameterMap(parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): oauthDotJsLib.OAuthNs.ParameterMap = js.native
  def nonce(length: scala.Double): java.lang.String = js.native
  /**
    * Encode text value according to OAuth Percent Encoding.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text value.
    */
  def percentEncode(s: java.lang.String): java.lang.String = js.native
  /**
    * Encode text values according to OAuth Percent Encoding.
    * Encoded values are joined with an ampersand character (&) in between them.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text values.
    */
  def percentEncode(s: js.Array[java.lang.String]): java.lang.String = js.native
  def setParameter(message: oauthDotJsLib.OAuthNs.Message, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setParameters(message: oauthDotJsLib.OAuthNs.Message, parameters: java.lang.String): scala.Unit = js.native
  def setParameters(message: oauthDotJsLib.OAuthNs.Message, parameters: oauthDotJsLib.OAuthNs.ParameterListOrMap): scala.Unit = js.native
  def setTimestampAndNonce(message: oauthDotJsLib.OAuthNs.Message): scala.Unit = js.native
  def timestamp(): scala.Double = js.native
}


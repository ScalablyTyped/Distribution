package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureMethodStatic extends js.Object {
  /** A map from signature method name to constructor. */
  var REGISTERED: org.scalablytyped.runtime.StringDictionary[oauthDotJsLib.Anon_SignatureMethod]
  /**
    * Generate a signature base string from a Message object.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
    * @param message Source of the signature base string.
    */
  def getBaseString(message: Message): java.lang.String
  /**
    * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
    * @param getSignatureFunction
    */
  def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ java.lang.String, java.lang.String]): oauthDotJsLib.Anon_SignatureMethod
  /** Instantiate a SignatureMethod for the given method name. */
  def newMethod(name: java.lang.String, accessor: Accessor): SignatureMethod
  def normalizeParameters(parameters: ParameterListOrMap): java.lang.String
  def normalizeUrl(url: java.lang.String): java.lang.String
  def parseUri(str: java.lang.String): Uri
  /**
    * Subsequently, the given constructor will be used for the named methods.
    * The constructor will be called with no parameters.
    * The resulting object should usually implement getSignature(baseString).
    * You can easily define such a constructor by calling makeSubclass method.
    */
  def registerMethodClass(names: js.Array[java.lang.String], classConstructor: oauthDotJsLib.Anon_SignatureMethod): scala.Unit
  def sign(message: Message, accessor: Accessor): scala.Unit
}

object SignatureMethodStatic {
  @scala.inline
  def apply(
    REGISTERED: org.scalablytyped.runtime.StringDictionary[oauthDotJsLib.Anon_SignatureMethod],
    getBaseString: js.Function1[Message, java.lang.String],
    makeSubclass: js.Function1[
      js.Function1[/* baseString */ java.lang.String, java.lang.String], 
      oauthDotJsLib.Anon_SignatureMethod
    ],
    newMethod: js.Function2[java.lang.String, Accessor, SignatureMethod],
    normalizeParameters: js.Function1[ParameterListOrMap, java.lang.String],
    normalizeUrl: js.Function1[java.lang.String, java.lang.String],
    parseUri: js.Function1[java.lang.String, Uri],
    registerMethodClass: js.Function2[js.Array[java.lang.String], oauthDotJsLib.Anon_SignatureMethod, scala.Unit],
    sign: js.Function2[Message, Accessor, scala.Unit]
  ): SignatureMethodStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("REGISTERED")(REGISTERED)
    __obj.updateDynamic("getBaseString")(getBaseString)
    __obj.updateDynamic("makeSubclass")(makeSubclass)
    __obj.updateDynamic("newMethod")(newMethod)
    __obj.updateDynamic("normalizeParameters")(normalizeParameters)
    __obj.updateDynamic("normalizeUrl")(normalizeUrl)
    __obj.updateDynamic("parseUri")(parseUri)
    __obj.updateDynamic("registerMethodClass")(registerMethodClass)
    __obj.updateDynamic("sign")(sign)
    __obj.asInstanceOf[SignatureMethodStatic]
  }
}


package typings.oauthDotJs.OAuth

import org.scalablytyped.runtime.StringDictionary
import typings.oauthDotJs.Anon_SignatureMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureMethodStatic extends js.Object {
  /** A map from signature method name to constructor. */
  var REGISTERED: StringDictionary[Anon_SignatureMethod]
  /**
    * Generate a signature base string from a Message object.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
    * @param message Source of the signature base string.
    */
  def getBaseString(message: Message): String
  /**
    * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
    * @param getSignatureFunction
    */
  def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ String, String]): Anon_SignatureMethod
  /** Instantiate a SignatureMethod for the given method name. */
  def newMethod(name: String, accessor: Accessor): SignatureMethod
  def normalizeParameters(parameters: ParameterListOrMap): String
  def normalizeUrl(url: String): String
  def parseUri(str: String): Uri
  /**
    * Subsequently, the given constructor will be used for the named methods.
    * The constructor will be called with no parameters.
    * The resulting object should usually implement getSignature(baseString).
    * You can easily define such a constructor by calling makeSubclass method.
    */
  def registerMethodClass(names: js.Array[String], classConstructor: Anon_SignatureMethod): Unit
  def sign(message: Message, accessor: Accessor): Unit
}

object SignatureMethodStatic {
  @scala.inline
  def apply(
    REGISTERED: StringDictionary[Anon_SignatureMethod],
    getBaseString: Message => String,
    makeSubclass: js.Function1[/* baseString */ String, String] => Anon_SignatureMethod,
    newMethod: (String, Accessor) => SignatureMethod,
    normalizeParameters: ParameterListOrMap => String,
    normalizeUrl: String => String,
    parseUri: String => Uri,
    registerMethodClass: (js.Array[String], Anon_SignatureMethod) => Unit,
    sign: (Message, Accessor) => Unit
  ): SignatureMethodStatic = {
    val __obj = js.Dynamic.literal(REGISTERED = REGISTERED.asInstanceOf[js.Any], getBaseString = js.Any.fromFunction1(getBaseString), makeSubclass = js.Any.fromFunction1(makeSubclass), newMethod = js.Any.fromFunction2(newMethod), normalizeParameters = js.Any.fromFunction1(normalizeParameters), normalizeUrl = js.Any.fromFunction1(normalizeUrl), parseUri = js.Any.fromFunction1(parseUri), registerMethodClass = js.Any.fromFunction2(registerMethodClass), sign = js.Any.fromFunction2(sign))
  
    __obj.asInstanceOf[SignatureMethodStatic]
  }
}


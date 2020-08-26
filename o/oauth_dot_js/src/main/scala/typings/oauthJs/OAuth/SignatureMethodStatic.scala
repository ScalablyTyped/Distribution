package typings.oauthJs.OAuth

import org.scalablytyped.runtime.StringDictionary
import typings.oauthJs.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureMethodStatic extends js.Object {
  /** A map from signature method name to constructor. */
  var REGISTERED: StringDictionary[Instantiable] = js.native
  /**
    * Generate a signature base string from a Message object.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
    * @param message Source of the signature base string.
    */
  def getBaseString(message: Message): String = js.native
  /**
    * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
    * @param getSignatureFunction
    */
  def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ String, String]): Instantiable = js.native
  /** Instantiate a SignatureMethod for the given method name. */
  def newMethod(name: String, accessor: Accessor): SignatureMethod = js.native
  def normalizeParameters(parameters: ParameterListOrMap): String = js.native
  def normalizeUrl(url: String): String = js.native
  def parseUri(str: String): Uri = js.native
  /**
    * Subsequently, the given constructor will be used for the named methods.
    * The constructor will be called with no parameters.
    * The resulting object should usually implement getSignature(baseString).
    * You can easily define such a constructor by calling makeSubclass method.
    */
  def registerMethodClass(names: js.Array[String], classConstructor: Instantiable): Unit = js.native
  def sign(message: Message, accessor: Accessor): Unit = js.native
}

object SignatureMethodStatic {
  @scala.inline
  def apply(
    REGISTERED: StringDictionary[Instantiable],
    getBaseString: Message => String,
    makeSubclass: js.Function1[/* baseString */ String, String] => Instantiable,
    newMethod: (String, Accessor) => SignatureMethod,
    normalizeParameters: ParameterListOrMap => String,
    normalizeUrl: String => String,
    parseUri: String => Uri,
    registerMethodClass: (js.Array[String], Instantiable) => Unit,
    sign: (Message, Accessor) => Unit
  ): SignatureMethodStatic = {
    val __obj = js.Dynamic.literal(REGISTERED = REGISTERED.asInstanceOf[js.Any], getBaseString = js.Any.fromFunction1(getBaseString), makeSubclass = js.Any.fromFunction1(makeSubclass), newMethod = js.Any.fromFunction2(newMethod), normalizeParameters = js.Any.fromFunction1(normalizeParameters), normalizeUrl = js.Any.fromFunction1(normalizeUrl), parseUri = js.Any.fromFunction1(parseUri), registerMethodClass = js.Any.fromFunction2(registerMethodClass), sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[SignatureMethodStatic]
  }
  @scala.inline
  implicit class SignatureMethodStaticOps[Self <: SignatureMethodStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setREGISTERED(value: StringDictionary[Instantiable]): Self = this.set("REGISTERED", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBaseString(value: Message => String): Self = this.set("getBaseString", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeSubclass(value: js.Function1[/* baseString */ String, String] => Instantiable): Self = this.set("makeSubclass", js.Any.fromFunction1(value))
    @scala.inline
    def setNewMethod(value: (String, Accessor) => SignatureMethod): Self = this.set("newMethod", js.Any.fromFunction2(value))
    @scala.inline
    def setNormalizeParameters(value: ParameterListOrMap => String): Self = this.set("normalizeParameters", js.Any.fromFunction1(value))
    @scala.inline
    def setNormalizeUrl(value: String => String): Self = this.set("normalizeUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setParseUri(value: String => Uri): Self = this.set("parseUri", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterMethodClass(value: (js.Array[String], Instantiable) => Unit): Self = this.set("registerMethodClass", js.Any.fromFunction2(value))
    @scala.inline
    def setSign(value: (Message, Accessor) => Unit): Self = this.set("sign", js.Any.fromFunction2(value))
  }
  
}


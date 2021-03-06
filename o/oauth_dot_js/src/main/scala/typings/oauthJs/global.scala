package typings.oauthJs

import typings.oauthJs.OAuth.Accessor
import typings.oauthJs.OAuth.Message
import typings.oauthJs.OAuth.ParameterList
import typings.oauthJs.OAuth.ParameterListOrMap
import typings.oauthJs.OAuth.ParameterMap
import typings.oauthJs.OAuth.SignatureMethodStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OAuth {
    
    @JSGlobal("OAuth")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("OAuth.SignatureMethod")
    @js.native
    def SignatureMethod: SignatureMethodStatic = js.native
    @scala.inline
    def SignatureMethod_=(x: SignatureMethodStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SignatureMethod")(x.asInstanceOf[js.Any])
    
    /**
      * Add specified parameters into URL as query parameters.
      * @param url URL that parameters added into.
      * @param parameters Parameters added into URL.
      * @return New URL string.
      */
    @JSGlobal("OAuth.addToURL")
    @js.native
    def addToURL(url: String, parameters: ParameterListOrMap): String = js.native
    
    /**
      * Fill in parameters to help construct a request message.
      * This function doesn't fill in every parameter.
      * @param message Target request message.
      * @param accessor Accessor object. The accessorSecret property is optional.
      */
    @JSGlobal("OAuth.completeRequest")
    @js.native
    def completeRequest(message: Message, accessor: Accessor): Unit = js.native
    
    /** Generate timestamps starting with the given value. */
    @JSGlobal("OAuth.correctTimestamp")
    @js.native
    def correctTimestamp(timestamp: Double): Unit = js.native
    
    /** Correct the time using a parameter from the URL from which the last script was loaded. */
    @JSGlobal("OAuth.correctTimestampFromSrc")
    @js.native
    def correctTimestampFromSrc(): Unit = js.native
    @JSGlobal("OAuth.correctTimestampFromSrc")
    @js.native
    def correctTimestampFromSrc(parameterName: String): Unit = js.native
    
    @JSGlobal("OAuth.decodeForm")
    @js.native
    def decodeForm(form: String): ParameterList = js.native
    
    /**
      * Decode percent-encoded value.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target percent-encoded value.
      */
    @JSGlobal("OAuth.decodePercent")
    @js.native
    def decodePercent(s: String): String = js.native
    
    @JSGlobal("OAuth.formEncode")
    @js.native
    def formEncode(parameters: ParameterListOrMap): String = js.native
    
    @JSGlobal("OAuth.getAuthorizationHeader")
    @js.native
    def getAuthorizationHeader(realm: String, parameters: String): String = js.native
    /** Construct the value of the Authorization header for an HTTP request. */
    @JSGlobal("OAuth.getAuthorizationHeader")
    @js.native
    def getAuthorizationHeader(realm: String, parameters: ParameterListOrMap): String = js.native
    
    @JSGlobal("OAuth.getParameter")
    @js.native
    def getParameter(parameters: String, name: String): String = js.native
    @JSGlobal("OAuth.getParameter")
    @js.native
    def getParameter(parameters: ParameterListOrMap, name: String): String = js.native
    
    /**
      * Convert the given parameters to an Array of name-value pairs.
      */
    @JSGlobal("OAuth.getParameterList")
    @js.native
    def getParameterList(parameters: String): ParameterList = js.native
    /**
      * Convert the given parameters to an Array of name-value pairs.
      */
    @JSGlobal("OAuth.getParameterList")
    @js.native
    def getParameterList(parameters: ParameterListOrMap): ParameterList = js.native
    
    /**
      * Convert the given parameters to a map from name to value.
      */
    @JSGlobal("OAuth.getParameterMap")
    @js.native
    def getParameterMap(parameters: String): ParameterMap = js.native
    /**
      * Convert the given parameters to a map from name to value.
      */
    @JSGlobal("OAuth.getParameterMap")
    @js.native
    def getParameterMap(parameters: ParameterListOrMap): ParameterMap = js.native
    
    @JSGlobal("OAuth.nonce")
    @js.native
    def nonce(length: Double): String = js.native
    
    /**
      * Encode text value according to OAuth Percent Encoding.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target text value.
      */
    @JSGlobal("OAuth.percentEncode")
    @js.native
    def percentEncode(s: String): String = js.native
    /**
      * Encode text values according to OAuth Percent Encoding.
      * Encoded values are joined with an ampersand character (&) in between them.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target text values.
      */
    @JSGlobal("OAuth.percentEncode")
    @js.native
    def percentEncode(s: js.Array[String]): String = js.native
    
    @JSGlobal("OAuth.setParameter")
    @js.native
    def setParameter(message: Message, name: String, value: String): Unit = js.native
    
    @JSGlobal("OAuth.setParameters")
    @js.native
    def setParameters(message: Message, parameters: String): Unit = js.native
    @JSGlobal("OAuth.setParameters")
    @js.native
    def setParameters(message: Message, parameters: ParameterListOrMap): Unit = js.native
    
    @JSGlobal("OAuth.setTimestampAndNonce")
    @js.native
    def setTimestampAndNonce(message: Message): Unit = js.native
    
    /** The difference between the correct time and my clock. */
    @JSGlobal("OAuth.timeCorrectionMsec")
    @js.native
    def timeCorrectionMsec: Double = js.native
    @scala.inline
    def timeCorrectionMsec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeCorrectionMsec")(x.asInstanceOf[js.Any])
    
    @JSGlobal("OAuth.timestamp")
    @js.native
    def timestamp(): Double = js.native
  }
}

package typings.oauthJs

import typings.oauthJs.OAuth.Accessor
import typings.oauthJs.OAuth.Message
import typings.oauthJs.OAuth.ParameterList
import typings.oauthJs.OAuth.ParameterListOrMap
import typings.oauthJs.OAuth.ParameterMap
import typings.oauthJs.OAuth.SignatureMethodStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def addToURL(url: String, parameters: ParameterListOrMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addToURL")(url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Fill in parameters to help construct a request message.
      * This function doesn't fill in every parameter.
      * @param message Target request message.
      * @param accessor Accessor object. The accessorSecret property is optional.
      */
    @scala.inline
    def completeRequest(message: Message, accessor: Accessor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("completeRequest")(message.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Generate timestamps starting with the given value. */
    @scala.inline
    def correctTimestamp(timestamp: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("correctTimestamp")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Correct the time using a parameter from the URL from which the last script was loaded. */
    @scala.inline
    def correctTimestampFromSrc(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("correctTimestampFromSrc")().asInstanceOf[Unit]
    @scala.inline
    def correctTimestampFromSrc(parameterName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("correctTimestampFromSrc")(parameterName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def decodeForm(form: String): ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeForm")(form.asInstanceOf[js.Any]).asInstanceOf[ParameterList]
    
    /**
      * Decode percent-encoded value.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target percent-encoded value.
      */
    @scala.inline
    def decodePercent(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePercent")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def formEncode(parameters: ParameterListOrMap): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formEncode")(parameters.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getAuthorizationHeader(realm: String, parameters: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationHeader")(realm.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
    /** Construct the value of the Authorization header for an HTTP request. */
    @scala.inline
    def getAuthorizationHeader(realm: String, parameters: ParameterListOrMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationHeader")(realm.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getParameter(parameters: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(parameters.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getParameter(parameters: ParameterListOrMap, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(parameters.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert the given parameters to an Array of name-value pairs.
      */
    @scala.inline
    def getParameterList(parameters: String): ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterList")(parameters.asInstanceOf[js.Any]).asInstanceOf[ParameterList]
    /**
      * Convert the given parameters to an Array of name-value pairs.
      */
    @scala.inline
    def getParameterList(parameters: ParameterListOrMap): ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterList")(parameters.asInstanceOf[js.Any]).asInstanceOf[ParameterList]
    
    /**
      * Convert the given parameters to a map from name to value.
      */
    @scala.inline
    def getParameterMap(parameters: String): ParameterMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterMap")(parameters.asInstanceOf[js.Any]).asInstanceOf[ParameterMap]
    /**
      * Convert the given parameters to a map from name to value.
      */
    @scala.inline
    def getParameterMap(parameters: ParameterListOrMap): ParameterMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterMap")(parameters.asInstanceOf[js.Any]).asInstanceOf[ParameterMap]
    
    @scala.inline
    def nonce(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nonce")(length.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Encode text value according to OAuth Percent Encoding.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target text value.
      */
    @scala.inline
    def percentEncode(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("percentEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      * Encode text values according to OAuth Percent Encoding.
      * Encoded values are joined with an ampersand character (&) in between them.
      * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
      * @param s Target text values.
      */
    @scala.inline
    def percentEncode(s: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("percentEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def setParameter(message: Message, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParameter")(message.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setParameters(message: Message, parameters: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParameters")(message.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def setParameters(message: Message, parameters: ParameterListOrMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParameters")(message.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setTimestampAndNonce(message: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimestampAndNonce")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** The difference between the correct time and my clock. */
    @JSGlobal("OAuth.timeCorrectionMsec")
    @js.native
    def timeCorrectionMsec: Double = js.native
    @scala.inline
    def timeCorrectionMsec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeCorrectionMsec")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def timestamp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Double]
  }
}

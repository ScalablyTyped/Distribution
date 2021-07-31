package typings.openidClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.openidClient.mod.ClaimsParameterMember
import typings.openidClient.mod.DPoPInput
import typings.openidClient.openidClientStrings.DELETE
import typings.openidClient.openidClientStrings.GET
import typings.openidClient.openidClientStrings.HEAD
import typings.openidClient.openidClientStrings.OPTIONS
import typings.openidClient.openidClientStrings.POST
import typings.openidClient.openidClientStrings.PUT
import typings.openidClient.openidClientStrings.TRACE
import typings.openidClient.openidClientStrings.body
import typings.openidClient.openidClientStrings.header
import typings.openidClient.openidClientStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var DPoP: js.UndefOr[DPoPInput] = js.undefined
    
    var body: js.UndefOr[String | Buffer] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  trait DPoP extends StObject {
    
    var DPoP: js.UndefOr[DPoPInput] = js.undefined
    
    var method: js.UndefOr[GET | POST] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
    
    var via: js.UndefOr[header | body | query] = js.undefined
  }
  object DPoP {
    
    @scala.inline
    def apply(): DPoP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DPoP]
    }
    
    @scala.inline
    implicit class DPoPMutableBuilder[Self <: DPoP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      @scala.inline
      def setVia(value: header | body | query): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var country: js.UndefOr[String] = js.undefined
    
    var formatted: js.UndefOr[String] = js.undefined
    
    var locality: js.UndefOr[String] = js.undefined
    
    var postal_code: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var street_address: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
      
      @scala.inline
      def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setStreet_address(value: String): Self = StObject.set(x, "street_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet_addressUndefined: Self = StObject.set(x, "street_address", js.undefined)
    }
  }
  
  trait Idtoken extends StObject {
    
    var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
    
    var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
  }
  object Idtoken {
    
    @scala.inline
    def apply(): Idtoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Idtoken]
    }
    
    @scala.inline
    implicit class IdtokenMutableBuilder[Self <: Idtoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId_token(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      @scala.inline
      def setUserinfo(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    }
  }
  
  trait X5tS256
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.undefined
  }
  object X5tS256 {
    
    @scala.inline
    def apply(): X5tS256 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X5tS256]
    }
    
    @scala.inline
    implicit class X5tS256MutableBuilder[Self <: X5tS256] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    }
  }
}

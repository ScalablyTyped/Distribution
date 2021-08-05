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
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
      
      inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
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
    
    inline def apply(): DPoP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DPoP]
    }
    
    extension [Self <: DPoP](x: Self) {
      
      inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
      
      inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
      
      inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setVia(value: header | body | query): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
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
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStreet_address(value: String): Self = StObject.set(x, "street_address", value.asInstanceOf[js.Any])
      
      inline def setStreet_addressUndefined: Self = StObject.set(x, "street_address", js.undefined)
    }
  }
  
  trait Idtoken extends StObject {
    
    var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
    
    var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
  }
  object Idtoken {
    
    inline def apply(): Idtoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Idtoken]
    }
    
    extension [Self <: Idtoken](x: Self) {
      
      inline def setId_token(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setUserinfo(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    }
  }
  
  trait X5tS256
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.undefined
  }
  object X5tS256 {
    
    inline def apply(): X5tS256 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X5tS256]
    }
    
    extension [Self <: X5tS256](x: Self) {
      
      inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    }
  }
}

package typings.pemJwk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pem-jwk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwk2pem(rsa_jwk: RSA_JWK): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jwk2pem")(rsa_jwk.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pem2jwk[T /* <: Extras */](rsa_pem: String): JWK[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pem2jwk")(rsa_pem.asInstanceOf[js.Any]).asInstanceOf[JWK[T]]
  inline def pem2jwk[T /* <: Extras */](rsa_pem: String, extras: T): JWK[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pem2jwk")(rsa_pem.asInstanceOf[js.Any], extras.asInstanceOf[js.Any])).asInstanceOf[JWK[T]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Extras = {[key: string] : pem-jwk.pem-jwk.Extras | string | boolean | number}
  }}}
  to avoid circular code involving: 
  - pem-jwk.pem-jwk.Extras
  */
  trait Extras
    extends StObject
       with /* key */ StringDictionary[Extras | String | Boolean | Double]
  object Extras {
    
    inline def apply(): Extras = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extras]
    }
  }
  
  type JWK[T /* <: Extras */] = RSA_JWK & T
  
  trait RSA_JWK extends StObject {
    
    var d: js.UndefOr[String] = js.undefined
    
    var dp: js.UndefOr[String] = js.undefined
    
    var dq: js.UndefOr[String] = js.undefined
    
    var e: String
    
    var kty: String
    
    var n: String
    
    var p: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[String] = js.undefined
    
    var qi: js.UndefOr[String] = js.undefined
  }
  object RSA_JWK {
    
    inline def apply(e: String, kty: String, n: String): RSA_JWK = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSA_JWK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RSA_JWK] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
      
      inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    }
  }
}

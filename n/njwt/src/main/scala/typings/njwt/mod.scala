package typings.njwt

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("njwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("njwt", "Jwt")
  @js.native
  open class Jwt protected () extends StObject {
    def this(claims: JSONMap, enforceDefaultFields: Boolean) = this()
    
    var body: JwtBody = js.native
    
    def compact(): String = js.native
    
    var header: JwtHeader = js.native
    
    def isExpired(): Boolean = js.native
    
    def isNotBefore(): Boolean = js.native
    
    def isSupportedAlg(algName: String): Boolean = js.native
    def isSupportedAlg(algName: SupportedAlgorithms): Boolean = js.native
    @JSName("isSupportedAlg")
    var isSupportedAlg_Original: IsSupportedAlg = js.native
    
    def setClaim(claim: String, value: JSONValue): Jwt = js.native
    
    def setExpiration(exp: String): Jwt = js.native
    def setExpiration(exp: js.Date): Jwt = js.native
    def setExpiration(exp: Double): Jwt = js.native
    
    def setHeader(param: String, value: String): Jwt = js.native
    
    def setIssuedAt(iat: Double): Jwt = js.native
    
    def setIssuer(iss: String): Jwt = js.native
    
    def setJti(jti: String): Jwt = js.native
    
    def setNotBefore(nbf: String): Jwt = js.native
    def setNotBefore(nbf: js.Date): Jwt = js.native
    def setNotBefore(nbf: Double): Jwt = js.native
    
    def setSigningAlgorithm(alg: String): Jwt = js.native
    
    def setSigningKey(key: String): Jwt = js.native
    def setSigningKey(key: Buffer): Jwt = js.native
    
    def setSubject(sub: String): Jwt = js.native
    
    def sign(payload: String, algorithm: String, cryptoInput: String): String = js.native
    def sign(payload: String, algorithm: String, cryptoInput: Buffer): String = js.native
    def sign(payload: String, algorithm: String, cryptoInput: KeyObject): String = js.native
    def sign(payload: JSONMap, algorithm: String, cryptoInput: String): String = js.native
    def sign(payload: JSONMap, algorithm: String, cryptoInput: Buffer): String = js.native
    def sign(payload: JSONMap, algorithm: String, cryptoInput: KeyObject): String = js.native
    def sign(payload: Buffer, algorithm: String, cryptoInput: String): String = js.native
    def sign(payload: Buffer, algorithm: String, cryptoInput: Buffer): String = js.native
    def sign(payload: Buffer, algorithm: String, cryptoInput: KeyObject): String = js.native
    
    var signature: String = js.native
    
    var signingKey: String | Buffer = js.native
  }
  object Jwt {
    
    @JSImport("njwt", "Jwt")
    @js.native
    def apply(claims: JSONMap, enforceDefaultFields: Boolean): Jwt = js.native
  }
  
  @JSImport("njwt", "JwtBody")
  @js.native
  open class JwtBody protected () extends StObject {
    def this(claims: JSONMap) = this()
    
    def compact(): String = js.native
    
    def toJSON(): JSONMap = js.native
  }
  object JwtBody {
    
    @JSImport("njwt", "JwtBody")
    @js.native
    def apply(claims: JSONMap): JwtBody = js.native
  }
  
  @JSImport("njwt", "JwtHeader")
  @js.native
  open class JwtHeader protected () extends StObject {
    def this(header: JwtHeaderOptions) = this()
    
    var alg: String = js.native
    
    def compact(): String = js.native
    
    var reservedKeys: js.Array[String] = js.native
    
    var typ: String = js.native
  }
  object JwtHeader {
    
    @JSImport("njwt", "JwtHeader")
    @js.native
    def apply(header: JwtHeaderOptions): JwtHeader = js.native
  }
  
  @JSImport("njwt", "Verifier")
  @js.native
  open class Verifier () extends StObject {
    
    def isSupportedAlg(algName: String): Boolean = js.native
    def isSupportedAlg(algName: SupportedAlgorithms): Boolean = js.native
    @JSName("isSupportedAlg")
    var isSupportedAlg_Original: IsSupportedAlg = js.native
    
    def keyResolver(kid: String, cb: KeyResolverCallback): js.UndefOr[Jwt] = js.native
    @JSName("keyResolver")
    var keyResolver_Original: KeyResolver = js.native
    
    def setKeyResolver(keyResolver: KeyResolver): Unit = js.native
    
    def setSigningAlgorithm(alg: String): Verifier | scala.Nothing = js.native
    
    def setSigningKey(keyStr: String): Verifier = js.native
    def setSigningKey(keyStr: Buffer): Verifier = js.native
    
    var signingAlgorithm: SupportedAlgorithms = js.native
    
    var signingKey: String | Buffer = js.native
    
    /**
      * Synchronous mode.
      */
    def verify(jwtString: String): Jwt | scala.Nothing = js.native
    /**
      * Async mode.
      */
    def verify(jwtString: String, cb: js.Function2[/* err */ js.Error | Null, /* verifiedJwt */ Jwt, Unit]): Unit | scala.Nothing = js.native
    def verify(jwtString: Buffer): Jwt | scala.Nothing = js.native
    def verify(jwtString: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* verifiedJwt */ Jwt, Unit]): Unit | scala.Nothing = js.native
    
    def withKeyResolver(keyResolver: KeyResolver): Verifier = js.native
  }
  object Verifier {
    
    @JSImport("njwt", "Verifier")
    @js.native
    def apply(): Verifier = js.native
  }
  
  inline def base64urlEncode(number: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def base64urlEncode(number: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def base64urlUnescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlUnescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def create(claimsOrSecret: String, args: Any*): Jwt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(List(claimsOrSecret.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Jwt]
  inline def create(claimsOrSecret: JSONMap, args: Any*): Jwt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(List(claimsOrSecret.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Jwt]
  inline def create(claimsOrSecret: Buffer, args: Any*): Jwt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(List(claimsOrSecret.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Jwt]
  
  inline def createVerifier(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerifier")().asInstanceOf[Verifier]
  
  inline def verify(jwtTokenString: String): js.UndefOr[Jwt] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: String, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: String, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: String, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Unit, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Unit, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Unit, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Buffer): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Buffer, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Buffer, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: String, signingKey: Buffer, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer): js.UndefOr[Jwt] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: String, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: String, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: String, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Unit, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Unit, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Unit, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Buffer): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Buffer, alg: String): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Buffer, alg: String, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  inline def verify(jwtTokenString: Buffer, signingKey: Buffer, alg: Unit, callback: KeyResolver): js.UndefOr[Jwt] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwtTokenString.asInstanceOf[js.Any], signingKey.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Jwt]]
  
  type IsSupportedAlg = js.Function1[/* algName */ String | SupportedAlgorithms, Boolean]
  
  trait JSONMap
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONMap {
    
    inline def apply(): JSONMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONMap]
    }
  }
  
  type JSONValue = String | Double | Boolean | Null | js.Array[Any] | JSONMap
  
  trait JwtHeaderOptions extends StObject {
    
    var alg: String
    
    var jku: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
    
    var x5c: js.UndefOr[String] = js.undefined
    
    var x5t: js.UndefOr[String] = js.undefined
    
    @JSName("x5t#s256")
    var x5tNumbersigns256: js.UndefOr[String] = js.undefined
    
    var x5u: js.UndefOr[String] = js.undefined
  }
  object JwtHeaderOptions {
    
    inline def apply(alg: String): JwtHeaderOptions = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtHeaderOptions]
    }
    
    extension [Self <: JwtHeaderOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
      
      inline def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
      
      inline def setX5c(value: String): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
      
      inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersigns256(value: String): Self = StObject.set(x, "x5t#s256", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersigns256Undefined: Self = StObject.set(x, "x5t#s256", js.undefined)
      
      inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      inline def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    }
  }
  
  type KeyResolver = js.Function2[/* kid */ String, /* cb */ KeyResolverCallback, js.UndefOr[Jwt]]
  
  type KeyResolverCallback = js.Function2[/* err */ js.Error | Null, /* signingKey */ String | Buffer, js.UndefOr[Jwt]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.njwt.njwtStrings.HS256
    - typings.njwt.njwtStrings.HS384
    - typings.njwt.njwtStrings.HS512
    - typings.njwt.njwtStrings.RS256
    - typings.njwt.njwtStrings.RS512
    - typings.njwt.njwtStrings.ES256
    - typings.njwt.njwtStrings.ES384
    - typings.njwt.njwtStrings.ES512
    - typings.njwt.njwtStrings.none
  */
  trait SupportedAlgorithms extends StObject
  object SupportedAlgorithms {
    
    inline def ES256: typings.njwt.njwtStrings.ES256 = "ES256".asInstanceOf[typings.njwt.njwtStrings.ES256]
    
    inline def ES384: typings.njwt.njwtStrings.ES384 = "ES384".asInstanceOf[typings.njwt.njwtStrings.ES384]
    
    inline def ES512: typings.njwt.njwtStrings.ES512 = "ES512".asInstanceOf[typings.njwt.njwtStrings.ES512]
    
    inline def HS256: typings.njwt.njwtStrings.HS256 = "HS256".asInstanceOf[typings.njwt.njwtStrings.HS256]
    
    inline def HS384: typings.njwt.njwtStrings.HS384 = "HS384".asInstanceOf[typings.njwt.njwtStrings.HS384]
    
    inline def HS512: typings.njwt.njwtStrings.HS512 = "HS512".asInstanceOf[typings.njwt.njwtStrings.HS512]
    
    inline def RS256: typings.njwt.njwtStrings.RS256 = "RS256".asInstanceOf[typings.njwt.njwtStrings.RS256]
    
    inline def RS512: typings.njwt.njwtStrings.RS512 = "RS512".asInstanceOf[typings.njwt.njwtStrings.RS512]
    
    inline def none: typings.njwt.njwtStrings.none = "none".asInstanceOf[typings.njwt.njwtStrings.none]
  }
}

package typings.oktaJwtVerifier

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.AgentOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@okta/jwt-verifier", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OktaJwtVerifier {
    def this(options: VerifierOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS256
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS384
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS512
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS256
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS384
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS512
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES256
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES384
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES512
    - typings.oktaJwtVerifier.oktaJwtVerifierStrings.none
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ES256: typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES256 = "ES256".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES256]
    
    inline def ES384: typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES384 = "ES384".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES384]
    
    inline def ES512: typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES512 = "ES512".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.ES512]
    
    inline def HS256: typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS256 = "HS256".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS256]
    
    inline def HS384: typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS384 = "HS384".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS384]
    
    inline def HS512: typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS512 = "HS512".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.HS512]
    
    inline def RS256: typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS256 = "RS256".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS256]
    
    inline def RS384: typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS384 = "RS384".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS384]
    
    inline def RS512: typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS512 = "RS512".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.RS512]
    
    inline def none: typings.oktaJwtVerifier.oktaJwtVerifierStrings.none = "none".asInstanceOf[typings.oktaJwtVerifier.oktaJwtVerifierStrings.none]
  }
  
  trait Jwt extends StObject {
    
    var claims: JwtClaims
    
    var header: JwtHeader
    
    def isExpired(): Boolean
    
    def isNotBefore(): Boolean
  }
  object Jwt {
    
    inline def apply(claims: JwtClaims, header: JwtHeader, isExpired: () => Boolean, isNotBefore: () => Boolean): Jwt = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isExpired = js.Any.fromFunction0(isExpired), isNotBefore = js.Any.fromFunction0(isNotBefore))
      __obj.asInstanceOf[Jwt]
    }
    
    extension [Self <: Jwt](x: Self) {
      
      inline def setClaims(value: JwtClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
      
      inline def setIsNotBefore(value: () => Boolean): Self = StObject.set(x, "isNotBefore", js.Any.fromFunction0(value))
    }
  }
  
  trait JwtClaims
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var aud: String
    
    var exp: Double
    
    var iat: js.UndefOr[Double] = js.undefined
    
    var iss: String
    
    var jti: js.UndefOr[String] = js.undefined
    
    var nbf: js.UndefOr[Double] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var scp: js.UndefOr[js.Array[String]] = js.undefined
    
    var sub: String
  }
  object JwtClaims {
    
    inline def apply(aud: String, exp: Double, iss: String, sub: String): JwtClaims = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtClaims]
    }
    
    extension [Self <: JwtClaims](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setScp(value: js.Array[String]): Self = StObject.set(x, "scp", value.asInstanceOf[js.Any])
      
      inline def setScpUndefined: Self = StObject.set(x, "scp", js.undefined)
      
      inline def setScpVarargs(value: String*): Self = StObject.set(x, "scp", js.Array(value*))
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait JwtHeader extends StObject {
    
    var alg: Algorithm
    
    var jku: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var typ: String
    
    var x5t: js.UndefOr[String] = js.undefined
    
    var x5u: js.UndefOr[String] = js.undefined
  }
  object JwtHeader {
    
    inline def apply(alg: Algorithm, typ: String): JwtHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtHeader]
    }
    
    extension [Self <: JwtHeader](x: Self) {
      
      inline def setAlg(value: Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
      
      inline def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      inline def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    }
  }
  
  @js.native
  trait OktaJwtVerifier extends StObject {
    
    /**
      * Verify an access token
      *
      * The expected audience passed to verifyAccessToken() is required, and can be
      * either a string (direct match) or an array of strings (the actual aud claim
      * in the token must match one of the strings).
      */
    def verifyAccessToken(accessTokenString: String, expectedAudience: String): js.Promise[Jwt] = js.native
    def verifyAccessToken(accessTokenString: String, expectedAudience: js.Array[String]): js.Promise[Jwt] = js.native
    
    /* private */ def verifyAsPromise(tokenString: String): js.Promise[Jwt] = js.native
    
    /**
      * Verify ID Tokens
      *
      * The expected client ID passed to verifyIdToken() is required. Expected nonce
      * value is optional and required if the claim is present in the token body.
      */
    def verifyIdToken(idTokenString: String, expectedClientId: String): js.Promise[Jwt] = js.native
    def verifyIdToken(idTokenString: String, expectedClientId: String, expectedNonce: String): js.Promise[Jwt] = js.native
  }
  
  trait VerifierOptions extends StObject {
    
    /**
      * Custom claim assertions
      *
      * For basic use cases, you can ask the verifier to assert a custom set of
      * claims. For example, if you need to assert that this JWT was issued for a
      * given client id:
      *
      * @example
      * ```js
      * const verifier = new OktaJwtVerifier({
      *  issuer: 'https://{yourOktaDomain}/oauth2/default',
      *  clientId: '{clientId}'
      *  assertClaims: {
      *    cid: '{clientId}'
      *  }
      * });
      * ```
      * Validation fails and an error is returned if the token does not have the configured claim.
      *
      * Read more: https://github.com/okta/okta-jwt-verifier-js#custom-claims-assertions
      */
    var assertClaims: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Cache time in milliseconds
      *
      * By default, found keys are cached by key ID for one hour. This can be
      * configured with the cacheMaxAge option for cache entries.
      *
      * Read more: https://github.com/okta/okta-jwt-verifier-js#caching--rate-limiting
      */
    var cacheMaxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Client ID
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * Issuer/Authorization server URL
      *
      * @example
      * "https://{yourOktaDomain}/oauth2/default"
      */
    var issuer: String
    
    /**
      * Rate limit in requests per minute
      *
      * If a key ID is not found in the cache, the JWKs endpoint will be requested.
      * To prevent a DoS if many not-found keys are requested, a rate limit of 10
      * JWKs requests per minute is enforced. This is configurable with the
      * jwksRequestsPerMinute option.
      *
      * Read more: https://github.com/okta/okta-jwt-verifier-js#caching--rate-limiting
      */
    var jwksRequestsPerMinute: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom JWKS URI
      *
      * It's useful when JWKS URI cannot be based on Issuer URI
      * Defaults to `${issuer}/v1/keys`
      *
      * Read more: https://github.com/okta/okta-jwt-verifier-js#custom-jwks-uri
      */
    var jwksUri: js.UndefOr[String] = js.undefined
    
    /**
      * Additional options to pass to the jwks-rsa constructor
      *
      * Can be used to configure the underlying axios agent within the jwks-rsa library,
      * for example to add additional certificate authorities without having to set the
      * NODE_EXTRA_CA_CERTS environment variable.
      */
    var requestAgentOptions: js.UndefOr[AgentOptions | typings.node.httpsMod.AgentOptions] = js.undefined
  }
  object VerifierOptions {
    
    inline def apply(issuer: String): VerifierOptions = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifierOptions]
    }
    
    extension [Self <: VerifierOptions](x: Self) {
      
      inline def setAssertClaims(value: Record[String, Any]): Self = StObject.set(x, "assertClaims", value.asInstanceOf[js.Any])
      
      inline def setAssertClaimsUndefined: Self = StObject.set(x, "assertClaims", js.undefined)
      
      inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJwksRequestsPerMinute(value: Double): Self = StObject.set(x, "jwksRequestsPerMinute", value.asInstanceOf[js.Any])
      
      inline def setJwksRequestsPerMinuteUndefined: Self = StObject.set(x, "jwksRequestsPerMinute", js.undefined)
      
      inline def setJwksUri(value: String): Self = StObject.set(x, "jwksUri", value.asInstanceOf[js.Any])
      
      inline def setJwksUriUndefined: Self = StObject.set(x, "jwksUri", js.undefined)
      
      inline def setRequestAgentOptions(value: AgentOptions | typings.node.httpsMod.AgentOptions): Self = StObject.set(x, "requestAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestAgentOptionsUndefined: Self = StObject.set(x, "requestAgentOptions", js.undefined)
    }
  }
}

package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.anon.AccountId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdapterPayload
  extends StObject
     with AllClientMetadata {
  
  var accountId: js.UndefOr[String] = js.undefined
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var aud: js.UndefOr[js.Array[String]] = js.undefined
  
  var authTime: js.UndefOr[Double] = js.undefined
  
  var authorizations: js.UndefOr[StringDictionary[ClientAuthorizationState]] = js.undefined
  
  var claims: js.UndefOr[ClaimsParameter] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var codeChallenge: js.UndefOr[String] = js.undefined
  
  var codeChallengeMethod: js.UndefOr[String] = js.undefined
  
  var consumed: js.UndefOr[Any] = js.undefined
  
  var deviceInfo: js.UndefOr[UnknownObject] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var errorDescription: js.UndefOr[String] = js.undefined
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var expiresWithSession: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[UnknownObject] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var grantId: js.UndefOr[String] = js.undefined
  
  var gty: js.UndefOr[String] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var iiat: js.UndefOr[Double] = js.undefined
  
  var inFlight: js.UndefOr[Boolean] = js.undefined
  
  var jkt: js.UndefOr[String] = js.undefined
  
  var jti: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var lastSubmission: js.UndefOr[InteractionResults] = js.undefined
  
  var loginTs: js.UndefOr[Double] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[UnknownObject] = js.undefined
  
  var policies: js.UndefOr[js.Array[String]] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[InteractionResults] = js.undefined
  
  var returnTo: js.UndefOr[String] = js.undefined
  
  var rotations: js.UndefOr[Double] = js.undefined
  
  var session: js.UndefOr[AccountId] = js.undefined
  
  var sessionUid: js.UndefOr[String] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[UnknownObject] = js.undefined
  
  var transient: js.UndefOr[Boolean] = js.undefined
  
  var trusted: js.UndefOr[js.Array[String]] = js.undefined
  
  var uid: js.UndefOr[String] = js.undefined
  
  var userCode: js.UndefOr[String] = js.undefined
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}
object AdapterPayload {
  
  inline def apply(): AdapterPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterPayload]
  }
  
  extension [Self <: AdapterPayload](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setAud(value: js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setAuthTime(value: Double): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setAuthTimeUndefined: Self = StObject.set(x, "authTime", js.undefined)
    
    inline def setAuthorizations(value: StringDictionary[ClientAuthorizationState]): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationsUndefined: Self = StObject.set(x, "authorizations", js.undefined)
    
    inline def setClaims(value: ClaimsParameter): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
    
    inline def setCodeChallengeMethod(value: String): Self = StObject.set(x, "codeChallengeMethod", value.asInstanceOf[js.Any])
    
    inline def setCodeChallengeMethodUndefined: Self = StObject.set(x, "codeChallengeMethod", js.undefined)
    
    inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
    
    inline def setConsumed(value: Any): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setConsumedUndefined: Self = StObject.set(x, "consumed", js.undefined)
    
    inline def setDeviceInfo(value: UnknownObject): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorDescription(value: String): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    
    inline def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setExpiresWithSession(value: Boolean): Self = StObject.set(x, "expiresWithSession", value.asInstanceOf[js.Any])
    
    inline def setExpiresWithSessionUndefined: Self = StObject.set(x, "expiresWithSession", js.undefined)
    
    inline def setExtra(value: UnknownObject): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
    
    inline def setGty(value: String): Self = StObject.set(x, "gty", value.asInstanceOf[js.Any])
    
    inline def setGtyUndefined: Self = StObject.set(x, "gty", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIiat(value: Double): Self = StObject.set(x, "iiat", value.asInstanceOf[js.Any])
    
    inline def setIiatUndefined: Self = StObject.set(x, "iiat", js.undefined)
    
    inline def setInFlight(value: Boolean): Self = StObject.set(x, "inFlight", value.asInstanceOf[js.Any])
    
    inline def setInFlightUndefined: Self = StObject.set(x, "inFlight", js.undefined)
    
    inline def setJkt(value: String): Self = StObject.set(x, "jkt", value.asInstanceOf[js.Any])
    
    inline def setJktUndefined: Self = StObject.set(x, "jkt", js.undefined)
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastSubmission(value: InteractionResults): Self = StObject.set(x, "lastSubmission", value.asInstanceOf[js.Any])
    
    inline def setLastSubmissionUndefined: Self = StObject.set(x, "lastSubmission", js.undefined)
    
    inline def setLoginTs(value: Double): Self = StObject.set(x, "loginTs", value.asInstanceOf[js.Any])
    
    inline def setLoginTsUndefined: Self = StObject.set(x, "loginTs", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setParams(value: UnknownObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPolicies(value: js.Array[String]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: String*): Self = StObject.set(x, "policies", js.Array(value*))
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResult(value: InteractionResults): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
    
    inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
    
    inline def setRotations(value: Double): Self = StObject.set(x, "rotations", value.asInstanceOf[js.Any])
    
    inline def setRotationsUndefined: Self = StObject.set(x, "rotations", js.undefined)
    
    inline def setSession(value: AccountId): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUid(value: String): Self = StObject.set(x, "sessionUid", value.asInstanceOf[js.Any])
    
    inline def setSessionUidUndefined: Self = StObject.set(x, "sessionUid", js.undefined)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setState(value: UnknownObject): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    
    inline def setTrusted(value: js.Array[String]): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    
    inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    
    inline def setTrustedVarargs(value: String*): Self = StObject.set(x, "trusted", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    
    inline def setUserCodeUndefined: Self = StObject.set(x, "userCode", js.undefined)
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
  }
}

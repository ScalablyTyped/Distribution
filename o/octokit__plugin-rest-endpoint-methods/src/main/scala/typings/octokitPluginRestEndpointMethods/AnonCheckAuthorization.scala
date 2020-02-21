package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckAuthorization extends js.Object {
  var checkAuthorization: AnonDeprecated
  var createAuthorization: AnonDeprecatedMethodParams
  var deleteAuthorization: AnonDeprecatedMethodParamsUrl
  var deleteGrant: AnonDeprecatedMethodParamsUrlAnonGrantid
  var getAuthorization: AnonDeprecatedMethodParamsUrl
  var getGrant: AnonDeprecatedMethodParamsUrlAnonGrantid
  var getOrCreateAuthorizationForApp: AnonDeprecatedMethodParamsUrlAnonClientidClientsecret
  var getOrCreateAuthorizationForAppAndFingerprint: AnonDeprecatedMethodParamsUrlAnonClientidClientsecretFingerprint
  var getOrCreateAuthorizationForAppFingerprint: AnonDeprecatedMethodParamsUrlAnonClientidClientsecretFingerprint
  var listAuthorizations: AnonDeprecatedMethodParamsUrlAnonPagePerpage
  var listGrants: AnonDeprecatedMethodParamsUrlAnonPagePerpage
  var resetAuthorization: AnonDeprecated
  var revokeAuthorizationForApplication: AnonDeprecated
  var revokeGrantForApplication: AnonDeprecated
  var updateAuthorization: AnonDeprecatedMethodParamsUrlAnonAddscopes
}

object AnonCheckAuthorization {
  @scala.inline
  def apply(
    checkAuthorization: AnonDeprecated,
    createAuthorization: AnonDeprecatedMethodParams,
    deleteAuthorization: AnonDeprecatedMethodParamsUrl,
    deleteGrant: AnonDeprecatedMethodParamsUrlAnonGrantid,
    getAuthorization: AnonDeprecatedMethodParamsUrl,
    getGrant: AnonDeprecatedMethodParamsUrlAnonGrantid,
    getOrCreateAuthorizationForApp: AnonDeprecatedMethodParamsUrlAnonClientidClientsecret,
    getOrCreateAuthorizationForAppAndFingerprint: AnonDeprecatedMethodParamsUrlAnonClientidClientsecretFingerprint,
    getOrCreateAuthorizationForAppFingerprint: AnonDeprecatedMethodParamsUrlAnonClientidClientsecretFingerprint,
    listAuthorizations: AnonDeprecatedMethodParamsUrlAnonPagePerpage,
    listGrants: AnonDeprecatedMethodParamsUrlAnonPagePerpage,
    resetAuthorization: AnonDeprecated,
    revokeAuthorizationForApplication: AnonDeprecated,
    revokeGrantForApplication: AnonDeprecated,
    updateAuthorization: AnonDeprecatedMethodParamsUrlAnonAddscopes
  ): AnonCheckAuthorization = {
    val __obj = js.Dynamic.literal(checkAuthorization = checkAuthorization.asInstanceOf[js.Any], createAuthorization = createAuthorization.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteGrant = deleteGrant.asInstanceOf[js.Any], getAuthorization = getAuthorization.asInstanceOf[js.Any], getGrant = getGrant.asInstanceOf[js.Any], getOrCreateAuthorizationForApp = getOrCreateAuthorizationForApp.asInstanceOf[js.Any], getOrCreateAuthorizationForAppAndFingerprint = getOrCreateAuthorizationForAppAndFingerprint.asInstanceOf[js.Any], getOrCreateAuthorizationForAppFingerprint = getOrCreateAuthorizationForAppFingerprint.asInstanceOf[js.Any], listAuthorizations = listAuthorizations.asInstanceOf[js.Any], listGrants = listGrants.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], updateAuthorization = updateAuthorization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckAuthorization]
  }
}


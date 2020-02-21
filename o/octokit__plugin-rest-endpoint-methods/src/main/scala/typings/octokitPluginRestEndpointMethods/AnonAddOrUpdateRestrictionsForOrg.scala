package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddOrUpdateRestrictionsForOrg extends js.Object {
  var addOrUpdateRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonLimit
  var addOrUpdateRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonLimitOwner
  var getRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired
  var getRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var removeRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired
  var removeRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
}

object AnonAddOrUpdateRestrictionsForOrg {
  @scala.inline
  def apply(
    addOrUpdateRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonLimit,
    addOrUpdateRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonLimitOwner,
    getRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired,
    getRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    removeRestrictionsForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired,
    removeRestrictionsForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  ): AnonAddOrUpdateRestrictionsForOrg = {
    val __obj = js.Dynamic.literal(addOrUpdateRestrictionsForOrg = addOrUpdateRestrictionsForOrg.asInstanceOf[js.Any], addOrUpdateRestrictionsForRepo = addOrUpdateRestrictionsForRepo.asInstanceOf[js.Any], getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddOrUpdateRestrictionsForOrg]
  }
}


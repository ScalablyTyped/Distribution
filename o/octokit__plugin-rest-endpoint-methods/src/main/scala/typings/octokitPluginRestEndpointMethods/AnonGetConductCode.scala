package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetConductCode extends js.Object {
  var getConductCode: AnonHeadersMethodParamsUrlAnonAcceptAnonKey
  var getForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var listConductCodes: AnonHeadersMethodParamsUrlAnonAcceptString
}

object AnonGetConductCode {
  @scala.inline
  def apply(
    getConductCode: AnonHeadersMethodParamsUrlAnonAcceptAnonKey,
    getForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    listConductCodes: AnonHeadersMethodParamsUrlAnonAcceptString
  ): AnonGetConductCode = {
    val __obj = js.Dynamic.literal(getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], listConductCodes = listConductCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetConductCode]
  }
}


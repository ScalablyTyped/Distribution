package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetGetForRepo extends js.Object {
  var get: AnonMethodParamsUrlAnonLicense
  var getForRepo: AnonMethodParamsUrl
  var list: AnonDeprecatedMethod
  var listCommonlyUsed: AnonMethodParamsUrlString
}

object AnonGetGetForRepo {
  @scala.inline
  def apply(
    get: AnonMethodParamsUrlAnonLicense,
    getForRepo: AnonMethodParamsUrl,
    list: AnonDeprecatedMethod,
    listCommonlyUsed: AnonMethodParamsUrlString
  ): AnonGetGetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommonlyUsed = listCommonlyUsed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetGetForRepo]
  }
}


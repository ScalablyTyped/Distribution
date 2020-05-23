package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.Slashcodes_of_conduct
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetAllCodesOfConductRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: Slashcodes_of_conduct
}

object CodesOfConductGetAllCodesOfConductRequestOptions {
  @scala.inline
  def apply(headers: RequestHeaders, method: GET, request: RequestRequestOptions, url: Slashcodes_of_conduct): CodesOfConductGetAllCodesOfConductRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetAllCodesOfConductRequestOptions]
  }
}


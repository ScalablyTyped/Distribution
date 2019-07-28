package typings.atOctokitRequest.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OctokitResponse[T] extends js.Object {
  /**
    *  This is the data you would see in https://developer.Octokit.com/v3/
    */
  var data: T
  var headers: ResponseHeaders
  /**
    * http response code
    */
  var status: Double
  /**
    * URL of response after all redirects
    */
  var url: String
}

object OctokitResponse {
  @scala.inline
  def apply[T](data: T, headers: ResponseHeaders, status: Double, url: String): OctokitResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status, url = url)
  
    __obj.asInstanceOf[OctokitResponse[T]]
  }
}


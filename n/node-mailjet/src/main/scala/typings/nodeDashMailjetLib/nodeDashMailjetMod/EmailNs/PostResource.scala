package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// resources
@js.native
trait PostResource extends js.Object {
  def action(action: java.lang.String): PostResource = js.native
  def id(value: java.lang.String): PostResource = js.native
  def request(params: js.Object): js.Promise[Response] = js.native
  def request(
    params: js.Object,
    callback: js.Function2[/* error */ stdLib.Error, /* res */ Response, scala.Unit]
  ): js.Promise[Response] = js.native
  def request(params: SendParams): js.Promise[PostResponse] = js.native
}


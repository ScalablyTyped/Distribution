package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResource extends js.Object {
  def action(action: java.lang.String): GetResource = js.native
  def id(value: java.lang.String): GetResource = js.native
  def request(): js.Promise[GetResponse] = js.native
  def request(params: js.Object): js.Promise[GetResponse] = js.native
  def request(
    params: js.Object,
    callback: js.Function2[/* error */ stdLib.Error, /* res */ GetResponse, scala.Unit]
  ): js.Promise[GetResponse] = js.native
}


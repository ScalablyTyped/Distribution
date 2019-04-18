package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// resources
@js.native
trait GetResource extends js.Object {
  def action(action: java.lang.String): GetResourceAction = js.native
  def id(value: java.lang.String): GetResource = js.native
  def request(): js.Promise[GetResponse] = js.native
  def request(params: GetParams): js.Promise[GetResponse] = js.native
}


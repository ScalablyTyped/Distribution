package typings.nodeDashMailjet.nodeDashMailjetMod.Email

import typings.nodeDashMailjet.nodeDashMailjetMod.ConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def get(action: String): GetResource = js.native
  def post(action: String): PostResource = js.native
  def post(action: String, options: ConfigOptions): PostResource = js.native
  def put(action: String): PutResource = js.native
}


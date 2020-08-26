package typings.node.osMod

import typings.node.Buffer
import typings.node.anon.`2`
import typings.node.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "userInfo")
@js.native
object userInfo extends js.Object {
  def apply(): UserInfo_[String] = js.native
  def apply(options: `2`): UserInfo_[Buffer] = js.native
  def apply(options: `4`): UserInfo_[String] = js.native
}


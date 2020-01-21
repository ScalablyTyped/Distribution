package typings.node.osMod

import typings.node.AnonBufferEncoding
import typings.node.AnonEncodingString
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "userInfo")
@js.native
object userInfo extends js.Object {
  def apply(): UserInfo_[String] = js.native
  def apply(options: AnonBufferEncoding): UserInfo_[Buffer] = js.native
  def apply(options: AnonEncodingString): UserInfo_[String] = js.native
}


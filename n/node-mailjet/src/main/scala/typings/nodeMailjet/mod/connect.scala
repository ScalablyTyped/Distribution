package typings.nodeMailjet.mod

import typings.nodeMailjet.mod.Email.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mailjet", "connect")
@js.native
object connect extends js.Object {
  def apply(apiKey: String, apiSecret: String): Client = js.native
  def apply(apiKey: String, apiSecret: String, options: ConnectOptions): Client = js.native
  def apply(apiToken: String): typings.nodeMailjet.mod.SMS.Client = js.native
  def apply(apiToken: String, options: ConnectOptions): typings.nodeMailjet.mod.SMS.Client = js.native
}


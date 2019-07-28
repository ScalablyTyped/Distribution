package typings.nodeDashMailjet.nodeDashMailjetMod

import typings.nodeDashMailjet.nodeDashMailjetMod.EmailNs.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mailjet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(apiKey: String, apiSecret: String): Client = js.native
  def connect(apiKey: String, apiSecret: String, options: ConnectOptions): Client = js.native
  def connect(apiToken: String): typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs.Client = js.native
  def connect(apiToken: String, options: ConnectOptions): typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs.Client = js.native
}


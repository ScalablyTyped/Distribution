package typings
package nodeDashMailjetLib.nodeDashMailjetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mailjet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(apiKey: java.lang.String, apiSecret: java.lang.String): nodeDashMailjetLib.nodeDashMailjetMod.EmailNs.Client = js.native
  def connect(apiKey: java.lang.String, apiSecret: java.lang.String, options: ConnectOptions): nodeDashMailjetLib.nodeDashMailjetMod.EmailNs.Client = js.native
  def connect(apiToken: java.lang.String): nodeDashMailjetLib.nodeDashMailjetMod.SMSNs.Client = js.native
  def connect(apiToken: java.lang.String, options: ConnectOptions): nodeDashMailjetLib.nodeDashMailjetMod.SMSNs.Client = js.native
}


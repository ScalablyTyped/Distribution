package typings
package pinataDashSdkLib.pinataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinata-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(apiKey: java.lang.String, privateApiKey: java.lang.String): PinataConfig = js.native
  def configure(apiKey: java.lang.String, privateApiKey: java.lang.String, apiURL: java.lang.String): PinataConfig = js.native
  def pinHashToIPFS(config: PinataConfig, hash: java.lang.String): js.Promise[PinHashToIPFSResponseJS] = js.native
}


package typings.pinataDashSdk.pinataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinata-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(apiKey: String, privateApiKey: String): PinataConfig = js.native
  def configure(apiKey: String, privateApiKey: String, apiURL: String): PinataConfig = js.native
  def pinHashToIPFS(config: PinataConfig, hash: String): js.Promise[PinHashToIPFSResponseJS] = js.native
}


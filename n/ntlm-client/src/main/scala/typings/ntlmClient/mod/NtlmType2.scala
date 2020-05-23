package typings.ntlmClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NtlmType2 extends js.Object {
  var challenge: Buffer
  var encoding: String
  var flags: Double
  var targetInfo: typings.ntlmClient.anon.Buffer
  var targetName: String
  var version: Double
}

object NtlmType2 {
  @scala.inline
  def apply(
    challenge: Buffer,
    encoding: String,
    flags: Double,
    targetInfo: typings.ntlmClient.anon.Buffer,
    targetName: String,
    version: Double
  ): NtlmType2 = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], targetInfo = targetInfo.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NtlmType2]
  }
}


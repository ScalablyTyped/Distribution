package typings.ntlmClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NtlmType2 extends js.Object {
  
  var challenge: Buffer = js.native
  
  var encoding: String = js.native
  
  var flags: Double = js.native
  
  var targetInfo: typings.ntlmClient.anon.Buffer = js.native
  
  var targetName: String = js.native
  
  var version: Double = js.native
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
  
  @scala.inline
  implicit class NtlmType2Ops[Self <: NtlmType2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallenge(value: Buffer): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInfo(value: typings.ntlmClient.anon.Buffer): Self = this.set("targetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

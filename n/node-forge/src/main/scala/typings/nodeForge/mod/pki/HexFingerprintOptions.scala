package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexFingerprintOptions extends ByteBufferFingerprintOptions {
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: hex = js.native
}

object HexFingerprintOptions {
  @scala.inline
  def apply(encoding: hex): HexFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexFingerprintOptions]
  }
  @scala.inline
  implicit class HexFingerprintOptionsOps[Self <: HexFingerprintOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: hex): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
  
}


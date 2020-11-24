package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryFingerprintOptions extends ByteBufferFingerprintOptions {
  
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: binary = js.native
}
object BinaryFingerprintOptions {
  
  @scala.inline
  def apply(encoding: binary): BinaryFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFingerprintOptions]
  }
  
  @scala.inline
  implicit class BinaryFingerprintOptionsOps[Self <: BinaryFingerprintOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
}

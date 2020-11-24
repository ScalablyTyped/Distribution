package typings.peerId.mod

import typings.libp2pCrypto.mod.KeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for PeerId creation.
  */
@js.native
trait CreateOptions extends js.Object {
  
  /**
    * The number of bits to use.
    */
  var bits: js.UndefOr[Double] = js.native
  
  /**
    * The type of key to use.
    */
  var keyType: js.UndefOr[KeyType] = js.native
}
object CreateOptions {
  
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
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
    def setBits(value: Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    
    @scala.inline
    def setKeyType(value: KeyType): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
  }
}

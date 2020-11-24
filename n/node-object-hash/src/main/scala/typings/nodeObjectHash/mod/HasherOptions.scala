package typings.nodeObjectHash.mod

import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.nodeObjectHash.objectSorterMod.SorterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object hasher options
  */
@js.native
trait HasherOptions extends SorterOptions {
  
  /**
    * Hash algorithm to use
    * @default 'sha256'
    */
  var alg: js.UndefOr[String] = js.native
  
  /**
    * String encoding for hash
    * @default 'hex'
    */
  var enc: js.UndefOr[HexBase64Latin1Encoding] = js.native
}
object HasherOptions {
  
  @scala.inline
  def apply(): HasherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasherOptions]
  }
  
  @scala.inline
  implicit class HasherOptionsOps[Self <: HasherOptions] (val x: Self) extends AnyVal {
    
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setEnc(value: HexBase64Latin1Encoding): Self = this.set("enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnc: Self = this.set("enc", js.undefined)
  }
}

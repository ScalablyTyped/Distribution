package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptEncryptOptions extends js.Object {
  
  var aad: js.UndefOr[Buffer] = js.native
  
  var adata: js.UndefOr[Buffer] = js.native
  
   // algorithm to use in ec
  var alg: js.UndefOr[String] = js.native
  
   // variation of enc, probably oversight in lib code
  var apu: js.UndefOr[Buffer] = js.native
  
   // agreement party info used in ec
  var apv: js.UndefOr[Buffer] = js.native
  
   // ephemeral pub key used in ec
  var enc: js.UndefOr[String] = js.native
  
  var epk: js.UndefOr[Buffer] = js.native
  
   // Not used in encrypt
  var epu: js.UndefOr[Buffer] = js.native
  
   // encryption party info
  var epv: js.UndefOr[Buffer] = js.native
  
  var iv: js.UndefOr[Buffer] = js.native
  
   // encryption party info
  var kdata: js.UndefOr[Buffer] = js.native
  
   // Not used in encrypt
  var mac: js.UndefOr[Buffer] = js.native
  
   // used in pbes
  var p2c: js.UndefOr[Double] = js.native
  
   // agreement party info used in ec
  var p2s: js.UndefOr[Buffer] = js.native
  
  var tag: js.UndefOr[Buffer] = js.native
}
object DecryptEncryptOptions {
  
  @scala.inline
  def apply(): DecryptEncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptEncryptOptions]
  }
  
  @scala.inline
  implicit class DecryptEncryptOptionsOps[Self <: DecryptEncryptOptions] (val x: Self) extends AnyVal {
    
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
    def setAad(value: Buffer): Self = this.set("aad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAad: Self = this.set("aad", js.undefined)
    
    @scala.inline
    def setAdata(value: Buffer): Self = this.set("adata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdata: Self = this.set("adata", js.undefined)
    
    @scala.inline
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setApu(value: Buffer): Self = this.set("apu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApu: Self = this.set("apu", js.undefined)
    
    @scala.inline
    def setApv(value: Buffer): Self = this.set("apv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApv: Self = this.set("apv", js.undefined)
    
    @scala.inline
    def setEnc(value: String): Self = this.set("enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnc: Self = this.set("enc", js.undefined)
    
    @scala.inline
    def setEpk(value: Buffer): Self = this.set("epk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpk: Self = this.set("epk", js.undefined)
    
    @scala.inline
    def setEpu(value: Buffer): Self = this.set("epu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpu: Self = this.set("epu", js.undefined)
    
    @scala.inline
    def setEpv(value: Buffer): Self = this.set("epv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpv: Self = this.set("epv", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setKdata(value: Buffer): Self = this.set("kdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKdata: Self = this.set("kdata", js.undefined)
    
    @scala.inline
    def setMac(value: Buffer): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setP2c(value: Double): Self = this.set("p2c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP2c: Self = this.set("p2c", js.undefined)
    
    @scala.inline
    def setP2s(value: Buffer): Self = this.set("p2s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP2s: Self = this.set("p2s", js.undefined)
    
    @scala.inline
    def setTag(value: Buffer): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}

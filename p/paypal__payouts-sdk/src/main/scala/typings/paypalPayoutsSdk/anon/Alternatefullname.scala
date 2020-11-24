package typings.paypalPayoutsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternatefullname extends js.Object {
  
  var alternate_full_name: js.UndefOr[String] = js.native
  
  var full_name: js.UndefOr[String] = js.native
  
  var given_name: js.UndefOr[String] = js.native
  
  var middle_name: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var surname: js.UndefOr[String] = js.native
}
object Alternatefullname {
  
  @scala.inline
  def apply(): Alternatefullname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alternatefullname]
  }
  
  @scala.inline
  implicit class AlternatefullnameOps[Self <: Alternatefullname] (val x: Self) extends AnyVal {
    
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
    def setAlternate_full_name(value: String): Self = this.set("alternate_full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate_full_name: Self = this.set("alternate_full_name", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_name: Self = this.set("full_name", js.undefined)
    
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    
    @scala.inline
    def setMiddle_name(value: String): Self = this.set("middle_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle_name: Self = this.set("middle_name", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
  }
}

package typings.nssm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NssmOptions extends js.Object {
  
  var nssmExe: js.UndefOr[String] = js.native
}
object NssmOptions {
  
  @scala.inline
  def apply(): NssmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NssmOptions]
  }
  
  @scala.inline
  implicit class NssmOptionsOps[Self <: NssmOptions] (val x: Self) extends AnyVal {
    
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
    def setNssmExe(value: String): Self = this.set("nssmExe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNssmExe: Self = this.set("nssmExe", js.undefined)
  }
}

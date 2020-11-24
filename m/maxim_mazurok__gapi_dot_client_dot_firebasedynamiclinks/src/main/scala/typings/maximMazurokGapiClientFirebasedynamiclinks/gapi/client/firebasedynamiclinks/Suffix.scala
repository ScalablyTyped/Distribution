package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suffix extends js.Object {
  
  /** Only applies to Option.CUSTOM. */
  var customSuffix: js.UndefOr[String] = js.native
  
  /** Suffix option. */
  var option: js.UndefOr[String] = js.native
}
object Suffix {
  
  @scala.inline
  def apply(): Suffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suffix]
  }
  
  @scala.inline
  implicit class SuffixOps[Self <: Suffix] (val x: Self) extends AnyVal {
    
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
    def setCustomSuffix(value: String): Self = this.set("customSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSuffix: Self = this.set("customSuffix", js.undefined)
    
    @scala.inline
    def setOption(value: String): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
  }
}

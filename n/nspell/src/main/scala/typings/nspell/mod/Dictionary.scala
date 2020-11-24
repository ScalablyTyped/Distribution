package typings.nspell.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionary extends js.Object {
  
  var aff: Buffer | String = js.native
  
  var dic: js.UndefOr[Buffer | String] = js.native
}
object Dictionary {
  
  @scala.inline
  def apply(aff: Buffer | String): Dictionary = {
    val __obj = js.Dynamic.literal(aff = aff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionary]
  }
  
  @scala.inline
  implicit class DictionaryOps[Self <: Dictionary] (val x: Self) extends AnyVal {
    
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
    def setAff(value: Buffer | String): Self = this.set("aff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDic(value: Buffer | String): Self = this.set("dic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDic: Self = this.set("dic", js.undefined)
  }
}

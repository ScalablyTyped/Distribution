package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacterMaskConfig extends js.Object {
  
  /** Character to mask the sensitive values. If not supplied, defaults to "*". */
  var maskingCharacter: js.UndefOr[String] = js.native
}
object CharacterMaskConfig {
  
  @scala.inline
  def apply(): CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterMaskConfig]
  }
  
  @scala.inline
  implicit class CharacterMaskConfigOps[Self <: CharacterMaskConfig] (val x: Self) extends AnyVal {
    
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
    def setMaskingCharacter(value: String): Self = this.set("maskingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskingCharacter: Self = this.set("maskingCharacter", js.undefined)
  }
}

package typings.parse.anon

import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iso
  extends _Encode[js.Any] {
  
  var __type: Date = js.native
  
  var iso: String = js.native
}
object Iso {
  
  @scala.inline
  def apply(__type: Date, iso: String): Iso = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso]
  }
  
  @scala.inline
  implicit class IsoOps[Self <: Iso] (val x: Self) extends AnyVal {
    
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
    def set__type(value: Date): Self = this.set("__type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso(value: String): Self = this.set("iso", value.asInstanceOf[js.Any])
  }
}

package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormats extends js.Object {
  
  var ini: IFormat = js.native
  
  var json: IFormat = js.native
}
object IFormats {
  
  @scala.inline
  def apply(ini: IFormat, json: IFormat): IFormats = {
    val __obj = js.Dynamic.literal(ini = ini.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormats]
  }
  
  @scala.inline
  implicit class IFormatsOps[Self <: IFormats] (val x: Self) extends AnyVal {
    
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
    def setIni(value: IFormat): Self = this.set("ini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: IFormat): Self = this.set("json", value.asInstanceOf[js.Any])
  }
}

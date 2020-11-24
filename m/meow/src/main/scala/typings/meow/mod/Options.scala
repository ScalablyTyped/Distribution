package typings.meow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var argv: js.UndefOr[js.Array[String]] = js.native
  
  var autoHelp: js.UndefOr[Boolean] = js.native
  
  var autoVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * Caution: Explicitly specifying undefined for booleanDefault
    * has different meaning from omitting key itself.
    */
  var booleanDefault: js.UndefOr[Boolean | Null] = js.native
  
  var description: js.UndefOr[String | Boolean] = js.native
  
  var flags: js.UndefOr[typings.minimistOptions.mod.Options] = js.native
  
  var help: js.UndefOr[String | Boolean] = js.native
  
  var inferType: js.UndefOr[Boolean] = js.native
  
  var pkg: js.UndefOr[js.Any] = js.native
  
  var version: js.UndefOr[String | Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgv: Self = this.set("argv", js.undefined)
    
    @scala.inline
    def setAutoHelp(value: Boolean): Self = this.set("autoHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHelp: Self = this.set("autoHelp", js.undefined)
    
    @scala.inline
    def setAutoVersion(value: Boolean): Self = this.set("autoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoVersion: Self = this.set("autoVersion", js.undefined)
    
    @scala.inline
    def setBooleanDefault(value: Boolean): Self = this.set("booleanDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanDefault: Self = this.set("booleanDefault", js.undefined)
    
    @scala.inline
    def setBooleanDefaultNull: Self = this.set("booleanDefault", null)
    
    @scala.inline
    def setDescription(value: String | Boolean): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFlags(value: typings.minimistOptions.mod.Options): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setHelp(value: String | Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setInferType(value: Boolean): Self = this.set("inferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferType: Self = this.set("inferType", js.undefined)
    
    @scala.inline
    def setPkg(value: js.Any): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setVersion(value: String | Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

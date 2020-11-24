package typings.nodePgMigrate.migrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOptionsTemplate extends js.Object {
  
  var templateFileName: String = js.native
}
object CreateOptionsTemplate {
  
  @scala.inline
  def apply(templateFileName: String): CreateOptionsTemplate = {
    val __obj = js.Dynamic.literal(templateFileName = templateFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionsTemplate]
  }
  
  @scala.inline
  implicit class CreateOptionsTemplateOps[Self <: CreateOptionsTemplate] (val x: Self) extends AnyVal {
    
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
    def setTemplateFileName(value: String): Self = this.set("templateFileName", value.asInstanceOf[js.Any])
  }
}

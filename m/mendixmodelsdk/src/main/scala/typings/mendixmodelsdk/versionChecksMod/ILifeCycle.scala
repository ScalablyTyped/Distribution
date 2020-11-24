package typings.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILifeCycle extends js.Object {
  
  var deleted: js.UndefOr[String] = js.native
  
  var deletionMessage: js.UndefOr[String | Null] = js.native
  
  var deprecated: js.UndefOr[String] = js.native
  
  var deprecationMessage: js.UndefOr[String | Null] = js.native
  
  var introduced: js.UndefOr[String] = js.native
}
object ILifeCycle {
  
  @scala.inline
  def apply(): ILifeCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILifeCycle]
  }
  
  @scala.inline
  implicit class ILifeCycleOps[Self <: ILifeCycle] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: String): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDeletionMessage(value: String): Self = this.set("deletionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionMessage: Self = this.set("deletionMessage", js.undefined)
    
    @scala.inline
    def setDeletionMessageNull: Self = this.set("deletionMessage", null)
    
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDeprecationMessage(value: String): Self = this.set("deprecationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationMessage: Self = this.set("deprecationMessage", js.undefined)
    
    @scala.inline
    def setDeprecationMessageNull: Self = this.set("deprecationMessage", null)
    
    @scala.inline
    def setIntroduced(value: String): Self = this.set("introduced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroduced: Self = this.set("introduced", js.undefined)
  }
}

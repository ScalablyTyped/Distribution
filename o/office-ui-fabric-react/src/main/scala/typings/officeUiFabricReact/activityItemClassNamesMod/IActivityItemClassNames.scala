package typings.officeUiFabricReact.activityItemClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActivityItemClassNames extends js.Object {
  
  var activityContent: js.UndefOr[String] = js.native
  
  var activityPersona: js.UndefOr[String] = js.native
  
  var activityText: js.UndefOr[String] = js.native
  
  var activityTypeIcon: js.UndefOr[String] = js.native
  
  var commentText: js.UndefOr[String] = js.native
  
  var personaContainer: js.UndefOr[String] = js.native
  
  var pulsingBeacon: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var timeStamp: js.UndefOr[String] = js.native
}
object IActivityItemClassNames {
  
  @scala.inline
  def apply(): IActivityItemClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActivityItemClassNames]
  }
  
  @scala.inline
  implicit class IActivityItemClassNamesOps[Self <: IActivityItemClassNames] (val x: Self) extends AnyVal {
    
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
    def setActivityContent(value: String): Self = this.set("activityContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityContent: Self = this.set("activityContent", js.undefined)
    
    @scala.inline
    def setActivityPersona(value: String): Self = this.set("activityPersona", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityPersona: Self = this.set("activityPersona", js.undefined)
    
    @scala.inline
    def setActivityText(value: String): Self = this.set("activityText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityText: Self = this.set("activityText", js.undefined)
    
    @scala.inline
    def setActivityTypeIcon(value: String): Self = this.set("activityTypeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTypeIcon: Self = this.set("activityTypeIcon", js.undefined)
    
    @scala.inline
    def setCommentText(value: String): Self = this.set("commentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    
    @scala.inline
    def setPersonaContainer(value: String): Self = this.set("personaContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonaContainer: Self = this.set("personaContainer", js.undefined)
    
    @scala.inline
    def setPulsingBeacon(value: String): Self = this.set("pulsingBeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulsingBeacon: Self = this.set("pulsingBeacon", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
}

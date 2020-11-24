package typings.officeUiFabricReact.activityItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActivityItemStyles extends js.Object {
  
  /**
    * Styles applied to the main container of the activity's description.
    */
  var activityContent: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the persona of the user that did this activity.
    */
  var activityPersona: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the activity's description.
    */
  var activityText: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the icon indicating the type of the activity. Only shown when personas are unavailable.
    */
  var activityTypeIcon: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the text of comments.
    */
  var commentText: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to personas when two users are involved in a single activity.
    */
  var doublePersona: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to main text container in the compact variant.
    */
  var isCompactContent: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to personas and icons in the compact variant.
    */
  var isCompactIcon: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to personas in the compact variant.
    */
  var isCompactPersona: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to a wrapper around personas in the compact variant.
    */
  var isCompactPersonaContainer: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to root in the compact variant.
    */
  var isCompactRoot: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the timestamp in compact mode.
    * This can occur if a host overrides the render behavior to force the timestamp to render.
    */
  var isCompactTimeStamp: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the container of the persona image or activity type icon.
    */
  var personaContainer: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the root activity item container.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the root activity item container.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * Styles applied to the timestamp at the end of each activity item.
    */
  var timeStamp: js.UndefOr[IStyle] = js.native
}
object IActivityItemStyles {
  
  @scala.inline
  def apply(): IActivityItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActivityItemStyles]
  }
  
  @scala.inline
  implicit class IActivityItemStylesOps[Self <: IActivityItemStyles] (val x: Self) extends AnyVal {
    
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
    def setActivityContent(value: IStyle): Self = this.set("activityContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityContent: Self = this.set("activityContent", js.undefined)
    
    @scala.inline
    def setActivityContentNull: Self = this.set("activityContent", null)
    
    @scala.inline
    def setActivityPersona(value: IStyle): Self = this.set("activityPersona", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityPersona: Self = this.set("activityPersona", js.undefined)
    
    @scala.inline
    def setActivityPersonaNull: Self = this.set("activityPersona", null)
    
    @scala.inline
    def setActivityText(value: IStyle): Self = this.set("activityText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityText: Self = this.set("activityText", js.undefined)
    
    @scala.inline
    def setActivityTextNull: Self = this.set("activityText", null)
    
    @scala.inline
    def setActivityTypeIcon(value: IStyle): Self = this.set("activityTypeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTypeIcon: Self = this.set("activityTypeIcon", js.undefined)
    
    @scala.inline
    def setActivityTypeIconNull: Self = this.set("activityTypeIcon", null)
    
    @scala.inline
    def setCommentText(value: IStyle): Self = this.set("commentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    
    @scala.inline
    def setCommentTextNull: Self = this.set("commentText", null)
    
    @scala.inline
    def setDoublePersona(value: IStyle): Self = this.set("doublePersona", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoublePersona: Self = this.set("doublePersona", js.undefined)
    
    @scala.inline
    def setDoublePersonaNull: Self = this.set("doublePersona", null)
    
    @scala.inline
    def setIsCompactContent(value: IStyle): Self = this.set("isCompactContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactContent: Self = this.set("isCompactContent", js.undefined)
    
    @scala.inline
    def setIsCompactContentNull: Self = this.set("isCompactContent", null)
    
    @scala.inline
    def setIsCompactIcon(value: IStyle): Self = this.set("isCompactIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactIcon: Self = this.set("isCompactIcon", js.undefined)
    
    @scala.inline
    def setIsCompactIconNull: Self = this.set("isCompactIcon", null)
    
    @scala.inline
    def setIsCompactPersona(value: IStyle): Self = this.set("isCompactPersona", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactPersona: Self = this.set("isCompactPersona", js.undefined)
    
    @scala.inline
    def setIsCompactPersonaNull: Self = this.set("isCompactPersona", null)
    
    @scala.inline
    def setIsCompactPersonaContainer(value: IStyle): Self = this.set("isCompactPersonaContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactPersonaContainer: Self = this.set("isCompactPersonaContainer", js.undefined)
    
    @scala.inline
    def setIsCompactPersonaContainerNull: Self = this.set("isCompactPersonaContainer", null)
    
    @scala.inline
    def setIsCompactRoot(value: IStyle): Self = this.set("isCompactRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactRoot: Self = this.set("isCompactRoot", js.undefined)
    
    @scala.inline
    def setIsCompactRootNull: Self = this.set("isCompactRoot", null)
    
    @scala.inline
    def setIsCompactTimeStamp(value: IStyle): Self = this.set("isCompactTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompactTimeStamp: Self = this.set("isCompactTimeStamp", js.undefined)
    
    @scala.inline
    def setIsCompactTimeStampNull: Self = this.set("isCompactTimeStamp", null)
    
    @scala.inline
    def setPersonaContainer(value: IStyle): Self = this.set("personaContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonaContainer: Self = this.set("personaContainer", js.undefined)
    
    @scala.inline
    def setPersonaContainerNull: Self = this.set("personaContainer", null)
    
    @scala.inline
    def setPulsingBeacon(value: IStyle): Self = this.set("pulsingBeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulsingBeacon: Self = this.set("pulsingBeacon", js.undefined)
    
    @scala.inline
    def setPulsingBeaconNull: Self = this.set("pulsingBeacon", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setTimeStamp(value: IStyle): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
    
    @scala.inline
    def setTimeStampNull: Self = this.set("timeStamp", null)
  }
}

package typings.officeUiFabricReact

import typings.officeUiFabricReact.activityItemTypesMod.IActivityItemStyles
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityItemClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ActivityItem/ActivityItem.classNames", "getClassNames")
  @js.native
  def getClassNames(
    styles: IActivityItemStyles,
    className: String,
    activityPersonas: js.Array[IPersonaProps],
    isCompact: Boolean
  ): IActivityItemClassNames = js.native
  
  @js.native
  trait IActivityItemClassNames extends StObject {
    
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
    implicit class IActivityItemClassNamesMutableBuilder[Self <: IActivityItemClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityContent(value: String): Self = StObject.set(x, "activityContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityContentUndefined: Self = StObject.set(x, "activityContent", js.undefined)
      
      @scala.inline
      def setActivityPersona(value: String): Self = StObject.set(x, "activityPersona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityPersonaUndefined: Self = StObject.set(x, "activityPersona", js.undefined)
      
      @scala.inline
      def setActivityText(value: String): Self = StObject.set(x, "activityText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTextUndefined: Self = StObject.set(x, "activityText", js.undefined)
      
      @scala.inline
      def setActivityTypeIcon(value: String): Self = StObject.set(x, "activityTypeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTypeIconUndefined: Self = StObject.set(x, "activityTypeIcon", js.undefined)
      
      @scala.inline
      def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      @scala.inline
      def setPersonaContainer(value: String): Self = StObject.set(x, "personaContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaContainerUndefined: Self = StObject.set(x, "personaContainer", js.undefined)
      
      @scala.inline
      def setPulsingBeacon(value: String): Self = StObject.set(x, "pulsingBeacon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulsingBeaconUndefined: Self = StObject.set(x, "pulsingBeacon", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}

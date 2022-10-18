package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsActivityItemActivityItemDottypesMod.IActivityItemStyles
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsActivityItemActivityItemDotclassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ActivityItem/ActivityItem.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClassNames(
    styles: IActivityItemStyles,
    className: String,
    activityPersonas: js.Array[IPersonaProps],
    isCompact: Boolean
  ): IActivityItemClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], className.asInstanceOf[js.Any], activityPersonas.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemClassNames]
  
  trait IActivityItemClassNames extends StObject {
    
    var activityContent: js.UndefOr[String] = js.undefined
    
    var activityPersona: js.UndefOr[String] = js.undefined
    
    var activityText: js.UndefOr[String] = js.undefined
    
    var activityTypeIcon: js.UndefOr[String] = js.undefined
    
    var commentText: js.UndefOr[String] = js.undefined
    
    var personaContainer: js.UndefOr[String] = js.undefined
    
    var pulsingBeacon: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var timeStamp: js.UndefOr[String] = js.undefined
  }
  object IActivityItemClassNames {
    
    inline def apply(): IActivityItemClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityItemClassNames]
    }
    
    extension [Self <: IActivityItemClassNames](x: Self) {
      
      inline def setActivityContent(value: String): Self = StObject.set(x, "activityContent", value.asInstanceOf[js.Any])
      
      inline def setActivityContentUndefined: Self = StObject.set(x, "activityContent", js.undefined)
      
      inline def setActivityPersona(value: String): Self = StObject.set(x, "activityPersona", value.asInstanceOf[js.Any])
      
      inline def setActivityPersonaUndefined: Self = StObject.set(x, "activityPersona", js.undefined)
      
      inline def setActivityText(value: String): Self = StObject.set(x, "activityText", value.asInstanceOf[js.Any])
      
      inline def setActivityTextUndefined: Self = StObject.set(x, "activityText", js.undefined)
      
      inline def setActivityTypeIcon(value: String): Self = StObject.set(x, "activityTypeIcon", value.asInstanceOf[js.Any])
      
      inline def setActivityTypeIconUndefined: Self = StObject.set(x, "activityTypeIcon", js.undefined)
      
      inline def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      inline def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      inline def setPersonaContainer(value: String): Self = StObject.set(x, "personaContainer", value.asInstanceOf[js.Any])
      
      inline def setPersonaContainerUndefined: Self = StObject.set(x, "personaContainer", js.undefined)
      
      inline def setPulsingBeacon(value: String): Self = StObject.set(x, "pulsingBeacon", value.asInstanceOf[js.Any])
      
      inline def setPulsingBeaconUndefined: Self = StObject.set(x, "pulsingBeacon", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}

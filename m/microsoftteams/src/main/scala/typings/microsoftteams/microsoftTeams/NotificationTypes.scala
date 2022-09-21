package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationTypes extends StObject
@JSGlobal("microsoftTeams.NotificationTypes")
@js.native
object NotificationTypes extends StObject {
  
  @js.native
  sealed trait fileDownloadComplete
    extends StObject
       with NotificationTypes
  
  @js.native
  sealed trait fileDownloadStart
    extends StObject
       with NotificationTypes
}

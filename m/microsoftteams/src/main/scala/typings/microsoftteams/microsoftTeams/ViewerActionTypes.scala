package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewerActionTypes extends StObject
/**
  * Hide from docs.
  * ------
  */
@JSGlobal("microsoftTeams.ViewerActionTypes")
@js.native
object ViewerActionTypes extends StObject {
  
  @js.native
  sealed trait edit
    extends StObject
       with ViewerActionTypes
  
  @js.native
  sealed trait editNew
    extends StObject
       with ViewerActionTypes
  
  @js.native
  sealed trait view
    extends StObject
       with ViewerActionTypes
}

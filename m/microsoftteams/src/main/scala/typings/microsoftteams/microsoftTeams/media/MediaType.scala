package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaType extends StObject
/**
  * Specifies the type of Media
  */
@JSGlobal("microsoftTeams.media.MediaType")
@js.native
object MediaType extends StObject {
  
  @js.native
  sealed trait Audio
    extends StObject
       with MediaType
  
  @js.native
  sealed trait Image
    extends StObject
       with MediaType
}

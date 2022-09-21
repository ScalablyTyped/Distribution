package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageUriType extends StObject
/**
  * ID contains a mapping for content uri on platform's side, URL is generic
  */
@JSGlobal("microsoftTeams.media.ImageUriType")
@js.native
object ImageUriType extends StObject {
  
  @js.native
  sealed trait ID
    extends StObject
       with ImageUriType
  
  @js.native
  sealed trait URL
    extends StObject
       with ImageUriType
}

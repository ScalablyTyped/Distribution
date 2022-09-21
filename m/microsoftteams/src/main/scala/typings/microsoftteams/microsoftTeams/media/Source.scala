package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Source extends StObject
/**
  * Specifies the image source
  */
@JSGlobal("microsoftTeams.media.Source")
@js.native
object Source extends StObject {
  
  @js.native
  sealed trait Camera
    extends StObject
       with Source
  
  @js.native
  sealed trait Gallery
    extends StObject
       with Source
}

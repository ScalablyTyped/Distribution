package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileFormat extends StObject
/**
  * Enum for file formats supported
  */
@JSGlobal("microsoftTeams.media.FileFormat")
@js.native
object FileFormat extends StObject {
  
  @js.native
  sealed trait Base64
    extends StObject
       with FileFormat
  
  @js.native
  sealed trait ID
    extends StObject
       with FileFormat
}

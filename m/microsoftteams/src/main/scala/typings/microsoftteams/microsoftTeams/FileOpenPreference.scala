package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOpenPreference extends StObject
/**
  * Allowed user file open preferences
  */
@JSGlobal("microsoftTeams.FileOpenPreference")
@js.native
object FileOpenPreference extends StObject {
  
  @js.native
  sealed trait Desktop
    extends StObject
       with FileOpenPreference
  
  @js.native
  sealed trait Inline
    extends StObject
       with FileOpenPreference
  
  @js.native
  sealed trait Web
    extends StObject
       with FileOpenPreference
}

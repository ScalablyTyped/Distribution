package typings.microsoftteams.global.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed user file open preferences
  */
@JSGlobal("microsoftTeams.FileOpenPreference")
@js.native
object FileOpenPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.FileOpenPreference & String] = js.native
  
  /* "desktop" */ val Desktop: typings.microsoftteams.microsoftTeams.FileOpenPreference.Desktop & String = js.native
  
  /* "inline" */ val Inline: typings.microsoftteams.microsoftTeams.FileOpenPreference.Inline & String = js.native
  
  /* "web" */ val Web: typings.microsoftteams.microsoftTeams.FileOpenPreference.Web & String = js.native
}

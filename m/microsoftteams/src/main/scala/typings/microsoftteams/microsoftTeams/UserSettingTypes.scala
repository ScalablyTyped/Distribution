package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserSettingTypes extends StObject
/**
  * Hide from docs.
  * ------
  * User setting changes that can be subscribed to,
  */
@JSGlobal("microsoftTeams.UserSettingTypes")
@js.native
object UserSettingTypes extends StObject {
  
  /**
    * Use this key to subscribe to changes in user's file open preference
    */
  @js.native
  sealed trait fileOpenPreference
    extends StObject
       with UserSettingTypes
  
  /**
    * Use this key to subscribe to theme changes
    */
  @js.native
  sealed trait theme
    extends StObject
       with UserSettingTypes
}

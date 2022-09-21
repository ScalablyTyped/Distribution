package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostClientType extends StObject
@JSGlobal("microsoftTeams.HostClientType")
@js.native
object HostClientType extends StObject {
  
  @js.native
  sealed trait android
    extends StObject
       with HostClientType
  
  @js.native
  sealed trait desktop
    extends StObject
       with HostClientType
  
  @js.native
  sealed trait ios
    extends StObject
       with HostClientType
  
  @js.native
  sealed trait rigel
    extends StObject
       with HostClientType
  
  @js.native
  sealed trait surfaceHub
    extends StObject
       with HostClientType
  
  @js.native
  sealed trait web
    extends StObject
       with HostClientType
}

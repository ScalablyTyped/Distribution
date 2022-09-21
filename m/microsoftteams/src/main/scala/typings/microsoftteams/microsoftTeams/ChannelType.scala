package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChannelType extends StObject
/**
  * The type of the channel with which the content is associated.
  */
@JSGlobal("microsoftTeams.ChannelType")
@js.native
object ChannelType extends StObject {
  
  @js.native
  sealed trait Private
    extends StObject
       with ChannelType
  
  @js.native
  sealed trait Regular
    extends StObject
       with ChannelType
  
  @js.native
  sealed trait Shared
    extends StObject
       with ChannelType
}

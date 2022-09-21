package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraStartMode extends StObject
/**
  * The modes in which camera can be launched in select Media API
  */
@JSGlobal("microsoftTeams.media.CameraStartMode")
@js.native
object CameraStartMode extends StObject {
  
  @js.native
  sealed trait BusinessCard
    extends StObject
       with CameraStartMode
  
  @js.native
  sealed trait Document
    extends StObject
       with CameraStartMode
  
  @js.native
  sealed trait Photo
    extends StObject
       with CameraStartMode
  
  @js.native
  sealed trait Whiteboard
    extends StObject
       with CameraStartMode
}

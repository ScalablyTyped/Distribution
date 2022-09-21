package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskModuleDimension extends StObject
/**
  * Task module dimension enum
  */
@JSGlobal("microsoftTeams.TaskModuleDimension")
@js.native
object TaskModuleDimension extends StObject {
  
  @js.native
  sealed trait Large
    extends StObject
       with TaskModuleDimension
  
  @js.native
  sealed trait Medium
    extends StObject
       with TaskModuleDimension
  
  @js.native
  sealed trait Small
    extends StObject
       with TaskModuleDimension
}

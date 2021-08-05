package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.completed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.inProgress
  - typings.microsoftGraph.microsoftGraphStrings.completed_
  - typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers
  - typings.microsoftGraph.microsoftGraphStrings.deferred
*/
trait TaskStatus extends StObject
object TaskStatus {
  
  inline def completed: completed_ = "completed".asInstanceOf[completed_]
  
  inline def deferred: typings.microsoftGraph.microsoftGraphStrings.deferred = "deferred".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deferred]
  
  inline def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inProgress]
  
  inline def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  inline def waitingOnOthers: typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers = "waitingOnOthers".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers]
}

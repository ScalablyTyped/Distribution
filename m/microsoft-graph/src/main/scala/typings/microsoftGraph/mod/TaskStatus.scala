package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.completed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.inProgress
  - typings.microsoftGraph.microsoftGraphStrings.completed_
  - typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers
  - typings.microsoftGraph.microsoftGraphStrings.deferred
*/
trait TaskStatus extends js.Object
object TaskStatus {
  
  @scala.inline
  def completed: completed_ = "completed".asInstanceOf[completed_]
  
  @scala.inline
  def deferred: typings.microsoftGraph.microsoftGraphStrings.deferred = "deferred".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deferred]
  
  @scala.inline
  def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inProgress]
  
  @scala.inline
  def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  @scala.inline
  def waitingOnOthers: typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers = "waitingOnOthers".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.waitingOnOthers]
}

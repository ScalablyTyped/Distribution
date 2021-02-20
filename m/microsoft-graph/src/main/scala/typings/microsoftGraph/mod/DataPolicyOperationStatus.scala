package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import typings.microsoftGraph.microsoftGraphStrings.running_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.complete
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait DataPolicyOperationStatus extends StObject
object DataPolicyOperationStatus {
  
  @scala.inline
  def complete: typings.microsoftGraph.microsoftGraphStrings.complete = "complete".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.complete]
  
  @scala.inline
  def failed: failed_ = "failed".asInstanceOf[failed_]
  
  @scala.inline
  def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  @scala.inline
  def running: running_ = "running".asInstanceOf[running_]
  
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

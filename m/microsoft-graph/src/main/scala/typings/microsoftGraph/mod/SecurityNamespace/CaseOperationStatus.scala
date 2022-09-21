package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import typings.microsoftGraph.microsoftGraphStrings.running_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.submissionFailed
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.succeeded
  - typings.microsoftGraph.microsoftGraphStrings.partiallySucceeded
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait CaseOperationStatus extends StObject
object CaseOperationStatus {
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  inline def partiallySucceeded: typings.microsoftGraph.microsoftGraphStrings.partiallySucceeded = "partiallySucceeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.partiallySucceeded]
  
  inline def running: running_ = "running".asInstanceOf[running_]
  
  inline def submissionFailed: typings.microsoftGraph.microsoftGraphStrings.submissionFailed = "submissionFailed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.submissionFailed]
  
  inline def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.succeeded]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import typings.microsoftGraph.microsoftGraphStrings.running_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.succeeded
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait LongRunningOperationStatus extends StObject
object LongRunningOperationStatus {
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  inline def running: running_ = "running".asInstanceOf[running_]
  
  inline def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.succeeded]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

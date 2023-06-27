package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.running_
import typings.microsoftGraph.microsoftGraphStrings.succeeded_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.succeeded_
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.skipped
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait SimulationAutomationRunStatus extends StObject
object SimulationAutomationRunStatus {
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def running: running_ = "running".asInstanceOf[running_]
  
  inline def skipped: typings.microsoftGraph.microsoftGraphStrings.skipped = "skipped".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.skipped]
  
  inline def succeeded: succeeded_ = "succeeded".asInstanceOf[succeeded_]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

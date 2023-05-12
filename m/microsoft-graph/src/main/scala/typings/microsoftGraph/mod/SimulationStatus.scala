package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.running_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.draft
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.scheduled
  - typings.microsoftGraph.microsoftGraphStrings.succeeded
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.cancelled
  - typings.microsoftGraph.microsoftGraphStrings.excluded
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait SimulationStatus extends StObject
object SimulationStatus {
  
  inline def cancelled: typings.microsoftGraph.microsoftGraphStrings.cancelled = "cancelled".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.cancelled]
  
  inline def draft: typings.microsoftGraph.microsoftGraphStrings.draft = "draft".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.draft]
  
  inline def excluded: typings.microsoftGraph.microsoftGraphStrings.excluded = "excluded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.excluded]
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def running: running_ = "running".asInstanceOf[running_]
  
  inline def scheduled: typings.microsoftGraph.microsoftGraphStrings.scheduled = "scheduled".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.scheduled]
  
  inline def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.succeeded]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

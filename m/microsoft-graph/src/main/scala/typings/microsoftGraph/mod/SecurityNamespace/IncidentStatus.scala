package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.microsoftGraphStrings.active_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.active_
  - typings.microsoftGraph.microsoftGraphStrings.resolved
  - typings.microsoftGraph.microsoftGraphStrings.inProgress
  - typings.microsoftGraph.microsoftGraphStrings.redirected
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
  - typings.microsoftGraph.microsoftGraphStrings.awaitingAction
*/
trait IncidentStatus extends StObject
object IncidentStatus {
  
  inline def active: active_ = "active".asInstanceOf[active_]
  
  inline def awaitingAction: typings.microsoftGraph.microsoftGraphStrings.awaitingAction = "awaitingAction".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.awaitingAction]
  
  inline def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inProgress]
  
  inline def redirected: typings.microsoftGraph.microsoftGraphStrings.redirected = "redirected".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.redirected]
  
  inline def resolved: typings.microsoftGraph.microsoftGraphStrings.resolved = "resolved".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.resolved]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

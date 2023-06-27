package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.active_
import typings.microsoftGraph.microsoftGraphStrings.error_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.pending
  - typings.microsoftGraph.microsoftGraphStrings.active_
  - typings.microsoftGraph.microsoftGraphStrings.deleting
  - typings.microsoftGraph.microsoftGraphStrings.deleted
  - typings.microsoftGraph.microsoftGraphStrings.error_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait DelegatedAdminAccessAssignmentStatus extends StObject
object DelegatedAdminAccessAssignmentStatus {
  
  inline def active: active_ = "active".asInstanceOf[active_]
  
  inline def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = "deleted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deleted]
  
  inline def deleting: typings.microsoftGraph.microsoftGraphStrings.deleting = "deleting".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deleting]
  
  inline def error: error_ = "error".asInstanceOf[error_]
  
  inline def pending: typings.microsoftGraph.microsoftGraphStrings.pending = "pending".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.pending]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

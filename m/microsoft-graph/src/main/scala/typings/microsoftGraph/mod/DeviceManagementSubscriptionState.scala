package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.active_
import typings.microsoftGraph.microsoftGraphStrings.disabled_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.pending
  - typings.microsoftGraph.microsoftGraphStrings.active_
  - typings.microsoftGraph.microsoftGraphStrings.warning
  - typings.microsoftGraph.microsoftGraphStrings.disabled_
  - typings.microsoftGraph.microsoftGraphStrings.deleted
  - typings.microsoftGraph.microsoftGraphStrings.blocked
  - typings.microsoftGraph.microsoftGraphStrings.lockedOut
*/
trait DeviceManagementSubscriptionState extends StObject
object DeviceManagementSubscriptionState {
  
  inline def active: active_ = "active".asInstanceOf[active_]
  
  inline def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = "blocked".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.blocked]
  
  inline def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = "deleted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.deleted]
  
  inline def disabled: disabled_ = "disabled".asInstanceOf[disabled_]
  
  inline def lockedOut: typings.microsoftGraph.microsoftGraphStrings.lockedOut = "lockedOut".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.lockedOut]
  
  inline def pending: typings.microsoftGraph.microsoftGraphStrings.pending = "pending".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.pending]
  
  inline def warning: typings.microsoftGraph.microsoftGraphStrings.warning = "warning".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.warning]
}

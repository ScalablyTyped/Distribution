package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.succeeded_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.attempted
  - typings.microsoftGraph.microsoftGraphStrings.succeeded_
  - typings.microsoftGraph.microsoftGraphStrings.blocked
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  inline def attempted: typings.microsoftGraph.microsoftGraphStrings.attempted = "attempted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.attempted]
  
  inline def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = "blocked".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.blocked]
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def succeeded: succeeded_ = "succeeded".asInstanceOf[succeeded_]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

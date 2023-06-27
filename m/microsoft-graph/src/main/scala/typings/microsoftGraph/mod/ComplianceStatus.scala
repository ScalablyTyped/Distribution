package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.error_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.notApplicable
  - typings.microsoftGraph.microsoftGraphStrings.compliant
  - typings.microsoftGraph.microsoftGraphStrings.remediated
  - typings.microsoftGraph.microsoftGraphStrings.nonCompliant
  - typings.microsoftGraph.microsoftGraphStrings.error_
  - typings.microsoftGraph.microsoftGraphStrings.conflict
  - typings.microsoftGraph.microsoftGraphStrings.notAssigned
*/
trait ComplianceStatus extends StObject
object ComplianceStatus {
  
  inline def compliant: typings.microsoftGraph.microsoftGraphStrings.compliant = "compliant".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.compliant]
  
  inline def conflict: typings.microsoftGraph.microsoftGraphStrings.conflict = "conflict".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.conflict]
  
  inline def error: error_ = "error".asInstanceOf[error_]
  
  inline def nonCompliant: typings.microsoftGraph.microsoftGraphStrings.nonCompliant = "nonCompliant".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.nonCompliant]
  
  inline def notApplicable: typings.microsoftGraph.microsoftGraphStrings.notApplicable = "notApplicable".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.notApplicable]
  
  inline def notAssigned: typings.microsoftGraph.microsoftGraphStrings.notAssigned = "notAssigned".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.notAssigned]
  
  inline def remediated: typings.microsoftGraph.microsoftGraphStrings.remediated = "remediated".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.remediated]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
}

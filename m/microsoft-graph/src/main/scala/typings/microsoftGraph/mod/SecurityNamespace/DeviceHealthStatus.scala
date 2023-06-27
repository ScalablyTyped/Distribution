package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.microsoftGraphStrings.active_
import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.active_
  - typings.microsoftGraph.microsoftGraphStrings.inactive
  - typings.microsoftGraph.microsoftGraphStrings.impairedCommunication
  - typings.microsoftGraph.microsoftGraphStrings.noSensorData
  - typings.microsoftGraph.microsoftGraphStrings.noSensorDataImpairedCommunication
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait DeviceHealthStatus extends StObject
object DeviceHealthStatus {
  
  inline def active: active_ = "active".asInstanceOf[active_]
  
  inline def impairedCommunication: typings.microsoftGraph.microsoftGraphStrings.impairedCommunication = "impairedCommunication".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.impairedCommunication]
  
  inline def inactive: typings.microsoftGraph.microsoftGraphStrings.inactive = "inactive".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inactive]
  
  inline def noSensorData: typings.microsoftGraph.microsoftGraphStrings.noSensorData = "noSensorData".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.noSensorData]
  
  inline def noSensorDataImpairedCommunication: typings.microsoftGraph.microsoftGraphStrings.noSensorDataImpairedCommunication = "noSensorDataImpairedCommunication".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.noSensorDataImpairedCommunication]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}

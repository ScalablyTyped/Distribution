package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectorType extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends StObject {
  
  @js.native
  sealed trait curve
    extends StObject
       with ConnectorType
  
  @js.native
  sealed trait elbow
    extends StObject
       with ConnectorType
  
  @js.native
  sealed trait straight
    extends StObject
       with ConnectorType
}

package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderWeight extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends StObject {
  
  @js.native
  sealed trait hairline
    extends StObject
       with BorderWeight
  
  @js.native
  sealed trait medium
    extends StObject
       with BorderWeight
  
  @js.native
  sealed trait thick
    extends StObject
       with BorderWeight
  
  @js.native
  sealed trait thin
    extends StObject
       with BorderWeight
}

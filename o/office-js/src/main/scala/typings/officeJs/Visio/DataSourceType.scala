package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
/**
  *
  * Represents the type of source for the data connection.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  /**
    *
    * Microsoft Excel workbook
    *
    */
  @js.native
  sealed trait excel
    extends StObject
       with DataSourceType
  
  /**
    *
    * Unknown Data Source
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DataSourceType
}

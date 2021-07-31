package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingType extends StObject
/**
  * Specifies the type of the binding object that should be returned.
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends StObject {
  
  /**
    * Tabular data without a header row. Data is returned as an array of arrays, for example in this form: 
    * [[row1column1, row1column2],[row2column1, row2column2]]
    */
  @js.native
  sealed trait Matrix
    extends StObject
       with BindingType
  
  /**
    * Tabular data with a header row. Data is returned as a {@link Office.TableData | TableData} object.
    */
  @js.native
  sealed trait Table
    extends StObject
       with BindingType
  
  /**
    * Plain text. Data is returned as a run of characters.
    */
  @js.native
  sealed trait Text
    extends StObject
       with BindingType
}

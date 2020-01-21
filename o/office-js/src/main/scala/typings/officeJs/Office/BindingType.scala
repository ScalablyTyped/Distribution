package typings.officeJs.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

/**
  * Specifies the type of the binding object that should be returned.
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends js.Object {
  /**
    * Tabular data without a header row. Data is returned as an array of arrays, for example in this form: 
    * [[row1column1, row1column2],[row2column1, row2column2]]
    */
  @js.native
  sealed trait Matrix extends BindingType
  
  /**
    * Tabular data with a header row. Data is returned as a {@link Office.TableData | TableData} object.
    */
  @js.native
  sealed trait Table extends BindingType
  
  /**
    * Plain text. Data is returned as a run of characters.
    */
  @js.native
  sealed trait Text extends BindingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingType with Double] = js.native
  /* 1 */ @js.native
  object Matrix extends TopLevel[Matrix with Double]
  
  /* 2 */ @js.native
  object Table
    extends TopLevel[typings.officeJs.Office.BindingType.Table with Double]
  
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}


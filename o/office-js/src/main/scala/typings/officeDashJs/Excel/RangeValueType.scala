package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeValueType extends js.Object

/**
  * [Api set: ExcelApi 1.1 for Unknown, Empty, String, Integer, Double, Boolean, Error. 1.7 for RichValue]
  */
@JSGlobal("Excel.RangeValueType")
@js.native
object RangeValueType extends js.Object {
  @js.native
  sealed trait boolean extends RangeValueType
  
  @js.native
  sealed trait double extends RangeValueType
  
  @js.native
  sealed trait empty extends RangeValueType
  
  @js.native
  sealed trait error extends RangeValueType
  
  @js.native
  sealed trait integer extends RangeValueType
  
  @js.native
  sealed trait richValue extends RangeValueType
  
  @js.native
  sealed trait string extends RangeValueType
  
  @js.native
  sealed trait unknown extends RangeValueType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeValueType with String] = js.native
  /* "Boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "Empty" */ @js.native
  object empty extends TopLevel[empty with String]
  
  /* "Error" */ @js.native
  object error extends TopLevel[error with String]
  
  /* "Integer" */ @js.native
  object integer extends TopLevel[integer with String]
  
  /* "RichValue" */ @js.native
  object richValue extends TopLevel[richValue with String]
  
  /* "String" */ @js.native
  object string extends TopLevel[string with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}


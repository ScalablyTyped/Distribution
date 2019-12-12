package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.NamedItemType.array
import typings.officeDashJs.Excel.NamedItemType.boolean
import typings.officeDashJs.Excel.NamedItemType.double
import typings.officeDashJs.Excel.NamedItemType.error
import typings.officeDashJs.Excel.NamedItemType.integer
import typings.officeDashJs.Excel.NamedItemType.range
import typings.officeDashJs.Excel.NamedItemType.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamedItemType extends js.Object

/**
  * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
  */
@JSGlobal("Excel.NamedItemType")
@js.native
object NamedItemType extends js.Object {
  @js.native
  sealed trait array extends NamedItemType
  
  @js.native
  sealed trait boolean extends NamedItemType
  
  @js.native
  sealed trait double extends NamedItemType
  
  @js.native
  sealed trait error extends NamedItemType
  
  @js.native
  sealed trait integer extends NamedItemType
  
  @js.native
  sealed trait range extends NamedItemType
  
  @js.native
  sealed trait string extends NamedItemType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NamedItemType with String] = js.native
  /* "Array" */ @js.native
  object array extends TopLevel[array with String]
  
  /* "Boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "Error" */ @js.native
  object error extends TopLevel[error with String]
  
  /* "Integer" */ @js.native
  object integer extends TopLevel[integer with String]
  
  /* "Range" */ @js.native
  object range extends TopLevel[range with String]
  
  /* "String" */ @js.native
  object string extends TopLevel[string with String]
  
}


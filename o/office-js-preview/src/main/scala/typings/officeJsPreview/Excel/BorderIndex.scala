package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderIndex extends js.Object
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderIndex")
@js.native
object BorderIndex extends js.Object {
  
  @js.native
  sealed trait diagonalDown extends BorderIndex
  
  @js.native
  sealed trait diagonalUp extends BorderIndex
  
  @js.native
  sealed trait edgeBottom extends BorderIndex
  
  @js.native
  sealed trait edgeLeft extends BorderIndex
  
  @js.native
  sealed trait edgeRight extends BorderIndex
  
  @js.native
  sealed trait edgeTop extends BorderIndex
  
  @js.native
  sealed trait insideHorizontal extends BorderIndex
  
  @js.native
  sealed trait insideVertical extends BorderIndex
}

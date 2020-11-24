package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeTextVerticalAlignment extends js.Object
/**
  *
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends js.Object {
  
  @js.native
  sealed trait bottom extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait distributed extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait justified extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait middle extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait top extends ShapeTextVerticalAlignment
}

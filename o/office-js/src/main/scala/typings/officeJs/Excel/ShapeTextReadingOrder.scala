package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeTextReadingOrder extends StObject
/**
  *
  * Specifies the reading order for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextReadingOrder")
@js.native
object ShapeTextReadingOrder extends StObject {
  
  @js.native
  sealed trait leftToRight
    extends StObject
       with ShapeTextReadingOrder
  
  @js.native
  sealed trait rightToLeft
    extends StObject
       with ShapeTextReadingOrder
}

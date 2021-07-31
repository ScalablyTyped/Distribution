package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeTextHorizontalOverflow extends StObject
/**
  *
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends StObject {
  
  @js.native
  sealed trait clip
    extends StObject
       with ShapeTextHorizontalOverflow
  
  @js.native
  sealed trait overflow
    extends StObject
       with ShapeTextHorizontalOverflow
}

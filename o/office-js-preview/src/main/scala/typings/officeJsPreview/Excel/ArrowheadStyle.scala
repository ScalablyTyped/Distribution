package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArrowheadStyle extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadStyle")
@js.native
object ArrowheadStyle extends StObject {
  
  @js.native
  sealed trait diamond
    extends StObject
       with ArrowheadStyle
  
  @js.native
  sealed trait none
    extends StObject
       with ArrowheadStyle
  
  @js.native
  sealed trait open
    extends StObject
       with ArrowheadStyle
  
  @js.native
  sealed trait oval
    extends StObject
       with ArrowheadStyle
  
  @js.native
  sealed trait stealth
    extends StObject
       with ArrowheadStyle
  
  @js.native
  sealed trait triangle
    extends StObject
       with ArrowheadStyle
}

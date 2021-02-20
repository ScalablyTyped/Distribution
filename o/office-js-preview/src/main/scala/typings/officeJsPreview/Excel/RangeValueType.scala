package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeValueType extends StObject
/**
  * [Api set: ExcelApi 1.1 for Unknown, Empty, String, Integer, Double, Boolean, Error. 1.7 for RichValue]
  */
@JSGlobal("Excel.RangeValueType")
@js.native
object RangeValueType extends StObject {
  
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
}

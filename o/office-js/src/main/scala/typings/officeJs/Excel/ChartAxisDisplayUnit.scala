package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisDisplayUnit extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisDisplayUnit")
@js.native
object ChartAxisDisplayUnit extends StObject {
  
  /**
    * This will set the axis in units of billions.
    *
    */
  @js.native
  sealed trait billions extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of custom value.
    *
    */
  @js.native
  sealed trait custom extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds of millions.
    *
    */
  @js.native
  sealed trait hundredMillions extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds of thousands.
    *
    */
  @js.native
  sealed trait hundredThousands extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds.
    *
    */
  @js.native
  sealed trait hundreds extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of millions.
    *
    */
  @js.native
  sealed trait millions extends ChartAxisDisplayUnit
  
  /**
    * Default option. This will reset display unit to the axis, and set unit label invisible.
    *
    */
  @js.native
  sealed trait none extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of tens of millions.
    *
    */
  @js.native
  sealed trait tenMillions extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of tens of thousands.
    *
    */
  @js.native
  sealed trait tenThousands extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of thousands.
    *
    */
  @js.native
  sealed trait thousands extends ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of trillions.
    *
    */
  @js.native
  sealed trait trillions extends ChartAxisDisplayUnit
}

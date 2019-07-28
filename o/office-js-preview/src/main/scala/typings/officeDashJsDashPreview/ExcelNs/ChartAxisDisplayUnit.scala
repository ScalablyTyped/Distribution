package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisDisplayUnit extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisDisplayUnit")
@js.native
object ChartAxisDisplayUnit extends js.Object {
  /**
    *
    * This will set the axis in units of billions.
    *
    */
  @js.native
  sealed trait billions extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of custom value.
    *
    */
  @js.native
  sealed trait custom extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of hundreds of millions.
    *
    */
  @js.native
  sealed trait hundredMillions extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of hundreds of thousands.
    *
    */
  @js.native
  sealed trait hundredThousands extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of hundreds.
    *
    */
  @js.native
  sealed trait hundreds extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of millions.
    *
    */
  @js.native
  sealed trait millions extends ChartAxisDisplayUnit
  
  /**
    *
    * Default option. This will reset display unit to the axis, and set unit label invisible.
    *
    */
  @js.native
  sealed trait none extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of tens of millions.
    *
    */
  @js.native
  sealed trait tenMillions extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of tens of thousands.
    *
    */
  @js.native
  sealed trait tenThousands extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of thousands.
    *
    */
  @js.native
  sealed trait thousands extends ChartAxisDisplayUnit
  
  /**
    *
    * This will set the axis in units of trillions.
    *
    */
  @js.native
  sealed trait trillions extends ChartAxisDisplayUnit
  
  /* "Billions" */ val billions: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.billions with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.custom with String = js.native
  /* "HundredMillions" */ val hundredMillions: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.hundredMillions with String = js.native
  /* "HundredThousands" */ val hundredThousands: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.hundredThousands with String = js.native
  /* "Hundreds" */ val hundreds: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.hundreds with String = js.native
  /* "Millions" */ val millions: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.millions with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.none with String = js.native
  /* "TenMillions" */ val tenMillions: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.tenMillions with String = js.native
  /* "TenThousands" */ val tenThousands: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.tenThousands with String = js.native
  /* "Thousands" */ val thousands: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.thousands with String = js.native
  /* "Trillions" */ val trillions: typings.officeDashJsDashPreview.ExcelNs.ChartAxisDisplayUnit.trillions with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisDisplayUnit with String] = js.native
}


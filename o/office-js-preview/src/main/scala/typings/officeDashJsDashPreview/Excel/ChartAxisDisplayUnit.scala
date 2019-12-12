package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.billions
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.custom
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.hundredMillions
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.hundredThousands
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.hundreds
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.millions
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.none
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.tenMillions
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.tenThousands
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.thousands
import typings.officeDashJsDashPreview.Excel.ChartAxisDisplayUnit.trillions
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisDisplayUnit with String] = js.native
  /* "Billions" */ @js.native
  object billions extends TopLevel[billions with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "HundredMillions" */ @js.native
  object hundredMillions extends TopLevel[hundredMillions with String]
  
  /* "HundredThousands" */ @js.native
  object hundredThousands extends TopLevel[hundredThousands with String]
  
  /* "Hundreds" */ @js.native
  object hundreds extends TopLevel[hundreds with String]
  
  /* "Millions" */ @js.native
  object millions extends TopLevel[millions with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "TenMillions" */ @js.native
  object tenMillions extends TopLevel[tenMillions with String]
  
  /* "TenThousands" */ @js.native
  object tenThousands extends TopLevel[tenThousands with String]
  
  /* "Thousands" */ @js.native
  object thousands extends TopLevel[thousands with String]
  
  /* "Trillions" */ @js.native
  object trillions extends TopLevel[trillions with String]
  
}


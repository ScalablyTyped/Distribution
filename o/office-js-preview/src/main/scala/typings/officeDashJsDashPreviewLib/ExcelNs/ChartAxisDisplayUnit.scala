package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait billions
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of custom value.
           *
           */
  @js.native
  sealed trait custom
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of hundreds of millions.
           *
           */
  @js.native
  sealed trait hundredMillions
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of hundreds of thousands.
           *
           */
  @js.native
  sealed trait hundredThousands
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of hundreds.
           *
           */
  @js.native
  sealed trait hundreds
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of millions.
           *
           */
  @js.native
  sealed trait millions
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * Default option. This will reset display unit to the axis, and set unit label invisible.
           *
           */
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of tens of millions.
           *
           */
  @js.native
  sealed trait tenMillions
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of tens of thousands.
           *
           */
  @js.native
  sealed trait tenThousands
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of thousands.
           *
           */
  @js.native
  sealed trait thousands
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /**
           *
           * This will set the axis in units of trillions.
           *
           */
  @js.native
  sealed trait trillions
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit
  
  /* "Billions" */ val billions: billions with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "HundredMillions" */ val hundredMillions: hundredMillions with java.lang.String = js.native
  /* "HundredThousands" */ val hundredThousands: hundredThousands with java.lang.String = js.native
  /* "Hundreds" */ val hundreds: hundreds with java.lang.String = js.native
  /* "Millions" */ val millions: millions with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "TenMillions" */ val tenMillions: tenMillions with java.lang.String = js.native
  /* "TenThousands" */ val tenThousands: tenThousands with java.lang.String = js.native
  /* "Thousands" */ val thousands: thousands with java.lang.String = js.native
  /* "Trillions" */ val trillions: trillions with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit with java.lang.String] = js.native
}


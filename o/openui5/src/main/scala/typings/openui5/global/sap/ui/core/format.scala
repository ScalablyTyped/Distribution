package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.format")
@js.native
object format extends js.Object {
  @js.native
  /**
    * Constructor for DateFormat - must not be used: To get a DateFormat instance, please use getInstance,
    * getDateTimeInstance or getTimeInstance.
    */
  class DateFormat ()
    extends typings.openui5.sap.ui.core.format.DateFormat
  
  @js.native
  /**
    * Constructor for FileSizeFormat - must not be used: To get a FileSizeFormat instance, please use
    * getInstance.
    */
  class FileSizeFormat ()
    extends typings.openui5.sap.ui.core.format.FileSizeFormat
  
  @js.native
  class NumberFormat protected ()
    extends typings.openui5.sap.ui.core.format.NumberFormat {
    /**
      * Constructor for NumberFormat - must not be used: To get a NumberFormat instance, please use
      * getInstance, getFloatInstance or getIntegerInstance.
      * @param oFormatOptions The option object which support the following parameters. If no options is
      * given, default values according to the type and locale settings are used.
      */
    def this(oFormatOptions: js.Any) = this()
  }
  
  @js.native
  object NumberFormat extends js.Object {
    /**
      * Specifies a rounding behavior for numerical operations capable of discarding precision. Each
      * rounding mode in this object indicates how the leastsignificant returned digits of rounded result is
      * to be calculated.
      */
    @js.native
    object RoundingMode extends js.Object {
      /* 0 */ val AWAY_FROM_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.AWAY_FROM_ZERO with Double = js.native
      /* 1 */ val CEILING: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.CEILING with Double = js.native
      /* 2 */ val FLOOR: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.FLOOR with Double = js.native
      /* 3 */ val HALF_AWAY_FROM_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_AWAY_FROM_ZERO with Double = js.native
      /* 4 */ val HALF_CEILING: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_CEILING with Double = js.native
      /* 5 */ val HALF_FLOOR: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_FLOOR with Double = js.native
      /* 6 */ val HALF_TOWARDS_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_TOWARDS_ZERO with Double = js.native
      /* 7 */ val TOWARDS_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.TOWARDS_ZERO with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode with Double] = js.native
    }
    
  }
  
}


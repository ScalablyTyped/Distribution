package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object format {
  
  @JSGlobal("sap.ui.core.format.DateFormat")
  @js.native
  /**
    * Constructor for DateFormat - must not be used: To get a DateFormat instance, please use getInstance,
    * getDateTimeInstance or getTimeInstance.
    */
  class DateFormat ()
    extends StObject
       with typings.openui5.sap.ui.core.format.DateFormat
  
  @JSGlobal("sap.ui.core.format.FileSizeFormat")
  @js.native
  /**
    * Constructor for FileSizeFormat - must not be used: To get a FileSizeFormat instance, please use
    * getInstance.
    */
  class FileSizeFormat ()
    extends StObject
       with typings.openui5.sap.ui.core.format.FileSizeFormat
  
  @JSGlobal("sap.ui.core.format.NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends StObject
       with typings.openui5.sap.ui.core.format.NumberFormat {
    /**
      * Constructor for NumberFormat - must not be used: To get a NumberFormat instance, please use
      * getInstance, getFloatInstance or getIntegerInstance.
      * @param oFormatOptions The option object which support the following parameters. If no options is
      * given, default values according to the type and locale settings are used.
      */
    def this(oFormatOptions: js.Any) = this()
  }
  object NumberFormat {
    
    /**
      * Specifies a rounding behavior for numerical operations capable of discarding precision. Each
      * rounding mode in this object indicates how the leastsignificant returned digits of rounded result is
      * to be calculated.
      */
    @JSGlobal("sap.ui.core.format.NumberFormat.RoundingMode")
    @js.native
    object RoundingMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode & Double] = js.native
      
      /* 0 */ val AWAY_FROM_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.AWAY_FROM_ZERO & Double = js.native
      
      /* 1 */ val CEILING: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.CEILING & Double = js.native
      
      /* 2 */ val FLOOR: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.FLOOR & Double = js.native
      
      /* 3 */ val HALF_AWAY_FROM_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_AWAY_FROM_ZERO & Double = js.native
      
      /* 4 */ val HALF_CEILING: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_CEILING & Double = js.native
      
      /* 5 */ val HALF_FLOOR: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_FLOOR & Double = js.native
      
      /* 6 */ val HALF_TOWARDS_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.HALF_TOWARDS_ZERO & Double = js.native
      
      /* 7 */ val TOWARDS_ZERO: typings.openui5.sap.ui.core.format.NumberFormat.RoundingMode.TOWARDS_ZERO & Double = js.native
    }
  }
}

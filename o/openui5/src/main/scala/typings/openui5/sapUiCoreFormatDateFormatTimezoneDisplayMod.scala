package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatDateFormatTimezoneDisplayMod {
  
  /**
    * @SINCE 1.99.0
    * @deprecated (since 1.101) - replaced by `DateFormat#getDateTimeWithTimezoneInstance` with the `showDate`,
    * `showTime` and `showTimezone` format options.
    *
    * Configuration options for the `showTimezone` format option of `DateFormat#getDateTimeWithTimezoneInstance`.
    */
  @JSImport("sap/ui/core/format/DateFormatTimezoneDisplay", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DateFormatTimezoneDisplay & String] = js.native
    
    /* "Hide" */ val Hide: typings.openui5.sapUiCoreFormatDateFormatTimezoneDisplayMod.DateFormatTimezoneDisplay.Hide & String = js.native
    
    /* "Only" */ val Only: typings.openui5.sapUiCoreFormatDateFormatTimezoneDisplayMod.DateFormatTimezoneDisplay.Only & String = js.native
    
    /* "Show" */ val Show: typings.openui5.sapUiCoreFormatDateFormatTimezoneDisplayMod.DateFormatTimezoneDisplay.Show & String = js.native
  }
  
  @js.native
  sealed trait DateFormatTimezoneDisplay extends StObject
  /**
    * @SINCE 1.99.0
    * @deprecated (since 1.101) - replaced by `DateFormat#getDateTimeWithTimezoneInstance` with the `showDate`,
    * `showTime` and `showTimezone` format options.
    *
    * Configuration options for the `showTimezone` format option of `DateFormat#getDateTimeWithTimezoneInstance`.
    */
  @JSImport("sap/ui/core/format/DateFormatTimezoneDisplay", "DateFormatTimezoneDisplay")
  @js.native
  object DateFormatTimezoneDisplay extends StObject {
    
    /**
      * Do not add the IANA timezone ID to the format output.
      */
    @js.native
    sealed trait Hide
      extends StObject
         with DateFormatTimezoneDisplay
    
    /**
      * Only output the IANA timezone ID.
      */
    @js.native
    sealed trait Only
      extends StObject
         with DateFormatTimezoneDisplay
    
    /**
      * Add the IANA timezone ID to the format output.
      */
    @js.native
    sealed trait Show
      extends StObject
         with DateFormatTimezoneDisplay
  }
}

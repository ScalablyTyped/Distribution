package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattingApi {
  
  /**
    * Helper of Formatting API interface
    */
  object Types {
    
    /**
      * DateTime Field Behavior options
      * 0 - None - Unknown DateTime Behavior,
      * 1 - UserLocal - Respect user local time. Dates stored as UTC,
      * 3 - TimeZoneIndependent - Dates and time stored without conversion to UTC
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`
    */
    trait DateTimeFieldBehavior extends StObject
    object DateTimeFieldBehavior {
      
      @scala.inline
      def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`]
      
      @scala.inline
      def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
      
      @scala.inline
      def `3`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3` = 3.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`]
    }
  }
}

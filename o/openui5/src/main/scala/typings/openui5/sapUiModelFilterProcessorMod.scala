package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelFilterProcessorMod extends Shortcut {
  
  @JSImport("sap/ui/model/FilterProcessor", JSImport.Default)
  @js.native
  val default: FilterProcessor = js.native
  
  /**
    * @SINCE 1.71
    *
    * Helper class for processing of filter objects
    */
  trait FilterProcessor extends StObject {
    
    /**
      * @SINCE 1.71
      *
      * Groups filters according to their path and combines filters on the same path using "OR" and filters on
      * different paths using "AND", all multi-filters contained are ANDed.
      *
      * @returns Single Filter containing all filters of the array combined or undefined
      */
    def groupFilters(
      /**
      * the filters to be grouped
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelFilterMod.default
  }
  object FilterProcessor {
    
    inline def apply(
      groupFilters: js.Array[typings.openui5.sapUiModelFilterMod.default] => typings.openui5.sapUiModelFilterMod.default
    ): FilterProcessor = {
      val __obj = js.Dynamic.literal(groupFilters = js.Any.fromFunction1(groupFilters))
      __obj.asInstanceOf[FilterProcessor]
    }
    
    extension [Self <: FilterProcessor](x: Self) {
      
      inline def setGroupFilters(
        value: js.Array[typings.openui5.sapUiModelFilterMod.default] => typings.openui5.sapUiModelFilterMod.default
      ): Self = StObject.set(x, "groupFilters", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FilterProcessor
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelFilterProcessorMod.foo` */
  override def _to: FilterProcessor = default
}

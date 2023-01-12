package typings.ngTable

import typings.ngTable.srcCoreFilteringFilterComparatorMod.FilterComparator
import typings.ngTable.srcCoreFilteringFilterFuncMod.IFilterFunc
import typings.ngTable.srcCoreFilteringFilterFuncMod.IFilterValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreFilteringFilterSettingsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngTable.ngTableStrings.stack
    - typings.ngTable.ngTableStrings.horizontal
  */
  trait FilterLayout extends StObject
  object FilterLayout {
    
    inline def horizontal: typings.ngTable.ngTableStrings.horizontal = "horizontal".asInstanceOf[typings.ngTable.ngTableStrings.horizontal]
    
    inline def stack: typings.ngTable.ngTableStrings.stack = "stack".asInstanceOf[typings.ngTable.ngTableStrings.stack]
  }
  
  trait IFilterSettings[T] extends StObject {
    
    /**
      * Use this to determine how items are matched against the filter values.
      * This setting is identical to the `comparator` parameter supported by the angular
      * `$filter` filter service
      *
      * Defaults to `undefined` which will result in a case insensitive susbstring match when
      * `IDefaultGetData` service is supplying the implementation for the
      * `ISettings.getData` function
      */
    var filterComparator: js.UndefOr[FilterComparator[T]] = js.undefined
    
    /**
      * A duration to wait for the user to stop typing before applying the filter.
      * - Defaults to 0 for small managed inmemory arrays ie where a `ISettings.dataset` argument is
      *   supplied to `NgTableParams.settings`.
      * - Defaults to 500 milliseconds otherwise.
      */
    var filterDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of elements up to which a managed inmemory array is considered small. Defaults to 10000.
      */
    var filterDelayThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Overrides `IDefaultGetDataProvider.filterFilterName`.
      * The value supplied should be the name of the angular `$filter` service that will be selected to perform
      * the actual filter logic.
      * Defaults to 'filter'.
      */
    var filterFilterName: js.UndefOr[String] = js.undefined
    
    /**
      * Tells `IDefaultGetData` to use this function supplied to perform the filtering instead of selecting an angular $filter.
      */
    var filterFn: js.UndefOr[IFilterFunc[T]] = js.undefined
    
    /**
      * The layout to use when multiple html templates are to rendered in a single table header column.
      */
    var filterLayout: js.UndefOr[FilterLayout] = js.undefined
  }
  object IFilterSettings {
    
    inline def apply[T](): IFilterSettings[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterSettings[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFilterSettings[?], T] (val x: Self & IFilterSettings[T]) extends AnyVal {
      
      inline def setFilterComparator(value: FilterComparator[T]): Self = StObject.set(x, "filterComparator", value.asInstanceOf[js.Any])
      
      inline def setFilterComparatorFunction2(value: (T, T) => Boolean): Self = StObject.set(x, "filterComparator", js.Any.fromFunction2(value))
      
      inline def setFilterComparatorUndefined: Self = StObject.set(x, "filterComparator", js.undefined)
      
      inline def setFilterDelay(value: Double): Self = StObject.set(x, "filterDelay", value.asInstanceOf[js.Any])
      
      inline def setFilterDelayThreshold(value: Double): Self = StObject.set(x, "filterDelayThreshold", value.asInstanceOf[js.Any])
      
      inline def setFilterDelayThresholdUndefined: Self = StObject.set(x, "filterDelayThreshold", js.undefined)
      
      inline def setFilterDelayUndefined: Self = StObject.set(x, "filterDelay", js.undefined)
      
      inline def setFilterFilterName(value: String): Self = StObject.set(x, "filterFilterName", value.asInstanceOf[js.Any])
      
      inline def setFilterFilterNameUndefined: Self = StObject.set(x, "filterFilterName", js.undefined)
      
      inline def setFilterFn(
        value: (/* data */ js.Array[T], /* filter */ IFilterValues, /* filterComparator */ FilterComparator[T]) => js.Array[T]
      ): Self = StObject.set(x, "filterFn", js.Any.fromFunction3(value))
      
      inline def setFilterFnUndefined: Self = StObject.set(x, "filterFn", js.undefined)
      
      inline def setFilterLayout(value: FilterLayout): Self = StObject.set(x, "filterLayout", value.asInstanceOf[js.Any])
      
      inline def setFilterLayoutUndefined: Self = StObject.set(x, "filterLayout", js.undefined)
    }
  }
}

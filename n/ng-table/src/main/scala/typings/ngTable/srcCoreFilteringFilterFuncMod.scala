package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import typings.ngTable.srcCoreFilteringFilterComparatorMod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreFilteringFilterFuncMod {
  
  type IFilterFunc[T] = js.Function3[
    /* data */ js.Array[T], 
    /* filter */ IFilterValues, 
    /* filterComparator */ FilterComparator[T], 
    js.Array[T]
  ]
  
  type IFilterValues = StringDictionary[Any]
}

package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMapping[K, D, Kin, Din] extends StObject {
  
  def mapFields(item: Item[Kin, Din]): Item[K, D]
  
  var mapFilterCriterion: js.UndefOr[
    js.Function1[/* filterCriterion */ js.Array[FilterOperator[D]], js.Array[FilterOperator[Din]]]
  ] = js.undefined
  
  var mapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[D]], js.Array[SortCriterion[Din]]]
  ] = js.undefined
  
  var unmapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[Din]], js.Array[SortCriterion[D]]]
  ] = js.undefined
}
object DataMapping {
  
  inline def apply[K, D, Kin, Din](mapFields: Item[Kin, Din] => Item[K, D]): DataMapping[K, D, Kin, Din] = {
    val __obj = js.Dynamic.literal(mapFields = js.Any.fromFunction1(mapFields))
    __obj.asInstanceOf[DataMapping[K, D, Kin, Din]]
  }
  
  extension [Self <: DataMapping[?, ?, ?, ?], K, D, Kin, Din](x: Self & (DataMapping[K, D, Kin, Din])) {
    
    inline def setMapFields(value: Item[Kin, Din] => Item[K, D]): Self = StObject.set(x, "mapFields", js.Any.fromFunction1(value))
    
    inline def setMapFilterCriterion(value: /* filterCriterion */ js.Array[FilterOperator[D]] => js.Array[FilterOperator[Din]]): Self = StObject.set(x, "mapFilterCriterion", js.Any.fromFunction1(value))
    
    inline def setMapFilterCriterionUndefined: Self = StObject.set(x, "mapFilterCriterion", js.undefined)
    
    inline def setMapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[D]] => js.Array[SortCriterion[Din]]): Self = StObject.set(x, "mapSortCriteria", js.Any.fromFunction1(value))
    
    inline def setMapSortCriteriaUndefined: Self = StObject.set(x, "mapSortCriteria", js.undefined)
    
    inline def setUnmapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[Din]] => js.Array[SortCriterion[D]]): Self = StObject.set(x, "unmapSortCriteria", js.Any.fromFunction1(value))
    
    inline def setUnmapSortCriteriaUndefined: Self = StObject.set(x, "unmapSortCriteria", js.undefined)
  }
}

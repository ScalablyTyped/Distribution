package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataMapping
import typings.oracleOraclejet.ojdataproviderMod.FetchAttribute
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes[Kin, D, K, Din] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  
  var dataMapping: js.UndefOr[DataMapping[K, D, Kin, Din]] = js.undefined
  
  var from: js.UndefOr[Kin] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
}
object Attributes {
  
  inline def apply[Kin, D, K, Din](): Attributes[Kin, D, K, Din] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes[Kin, D, K, Din]]
  }
  
  extension [Self <: Attributes[?, ?, ?, ?], Kin, D, K, Din](x: Self & (Attributes[Kin, D, K, Din])) {
    
    inline def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDataMapping(value: DataMapping[K, D, Kin, Din]): Self = StObject.set(x, "dataMapping", value.asInstanceOf[js.Any])
    
    inline def setDataMappingUndefined: Self = StObject.set(x, "dataMapping", js.undefined)
    
    inline def setFrom(value: Kin): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
    
    inline def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "sortCriteria", js.Array(value*))
  }
}

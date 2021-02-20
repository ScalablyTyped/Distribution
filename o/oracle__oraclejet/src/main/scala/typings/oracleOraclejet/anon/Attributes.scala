package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataMapping
import typings.oracleOraclejet.ojdataproviderMod.FetchAttribute
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes[Kin, D, K, Din] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  
  var dataMapping: js.UndefOr[DataMapping[K, D, Kin, Din]] = js.native
  
  var from: js.UndefOr[Kin] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
}
object Attributes {
  
  @scala.inline
  def apply[Kin, D, K, Din](): Attributes[Kin, D, K, Din] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes[Kin, D, K, Din]]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes[_, _, _, _], Kin, D, K, Din] (val x: Self with (Attributes[Kin, D, K, Din])) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDataMapping(value: DataMapping[K, D, Kin, Din]): Self = StObject.set(x, "dataMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMappingUndefined: Self = StObject.set(x, "dataMapping", js.undefined)
    
    @scala.inline
    def setFrom(value: Kin): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "sortCriteria", js.Array(value :_*))
  }
}

package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataMapping
import typings.oracleOraclejet.ojdataproviderMod.FetchAttribute
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes[Kin, D, K, Din] extends js.Object {
  
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
  implicit class AttributesOps[Self <: Attributes[_, _, _, _], Kin, D, K, Din] (val x: Self with (Attributes[Kin, D, K, Din])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDataMapping(value: DataMapping[K, D, Kin, Din]): Self = this.set("dataMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMapping: Self = this.set("dataMapping", js.undefined)
    
    @scala.inline
    def setFrom(value: Kin): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = this.set("sortCriteria", js.Array(value :_*))
    
    @scala.inline
    def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = this.set("sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortCriteria: Self = this.set("sortCriteria", js.undefined)
  }
}

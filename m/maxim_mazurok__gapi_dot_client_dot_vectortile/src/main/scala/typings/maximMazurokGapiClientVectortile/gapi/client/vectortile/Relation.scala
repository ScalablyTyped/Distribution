package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends js.Object {
  
  /** Zero-based index to look up the related feature from the list of features in the tile. */
  var relatedFeatureIndex: js.UndefOr[Double] = js.native
  
  /** Relation type between the origin feature to the related feature. */
  var relationType: js.UndefOr[String] = js.native
}
object Relation {
  
  @scala.inline
  def apply(): Relation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relation]
  }
  
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
    
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
    def setRelatedFeatureIndex(value: Double): Self = this.set("relatedFeatureIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedFeatureIndex: Self = this.set("relatedFeatureIndex", js.undefined)
    
    @scala.inline
    def setRelationType(value: String): Self = this.set("relationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationType: Self = this.set("relationType", js.undefined)
  }
}

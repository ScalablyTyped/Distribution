package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends js.Object {
  
  /** The localized name of this feature. Currently only returned for roads. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The geometry of this feature, representing the space that it occupies in the world. */
  var geometry: js.UndefOr[Geometry] = js.native
  
  /** Place ID of this feature, suitable for use in Places API details requests. */
  var placeId: js.UndefOr[String] = js.native
  
  /** Relations to other features. */
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  
  /** Metadata for features with the SEGMENT FeatureType. */
  var segmentInfo: js.UndefOr[SegmentInfo] = js.native
  
  /** The type of this feature. */
  var `type`: js.UndefOr[String] = js.native
}
object Feature {
  
  @scala.inline
  def apply(): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGeometry(value: Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: Relation*): Self = this.set("relations", js.Array(value :_*))
    
    @scala.inline
    def setRelations(value: js.Array[Relation]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    
    @scala.inline
    def setSegmentInfo(value: SegmentInfo): Self = this.set("segmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentInfo: Self = this.set("segmentInfo", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

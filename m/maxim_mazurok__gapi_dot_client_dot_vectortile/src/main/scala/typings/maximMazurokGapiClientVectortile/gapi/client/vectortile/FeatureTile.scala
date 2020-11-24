package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTile extends js.Object {
  
  /** The global tile coordinates that uniquely identify this tile. */
  var coordinates: js.UndefOr[TileCoordinates] = js.native
  
  /** Features present on this map tile. */
  var features: js.UndefOr[js.Array[Feature]] = js.native
  
  /**
    * Resource name of the tile. The tile resource name is prefixed by its collection ID `tiles/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom
    * level as `@,,z`. For example, `tiles/@1,2,3z`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Data providers for the data contained in this tile. */
  var providers: js.UndefOr[js.Array[ProviderInfo]] = js.native
  
  /** Tile response status code to support tile caching. */
  var status: js.UndefOr[String] = js.native
  
  /**
    * An opaque value, usually less than 30 characters, that contains version info about this tile and the data that was used to generate it. The client should store this value in its
    * tile cache and pass it back to the API in the client_tile_version_id field of subsequent tile requests in order to enable the API to detect when the new tile would be the same as
    * the one the client already has in its cache. Also see STATUS_OK_DATA_UNCHANGED.
    */
  var versionId: js.UndefOr[String] = js.native
}
object FeatureTile {
  
  @scala.inline
  def apply(): FeatureTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTile]
  }
  
  @scala.inline
  implicit class FeatureTileOps[Self <: FeatureTile] (val x: Self) extends AnyVal {
    
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
    def setCoordinates(value: TileCoordinates): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: ProviderInfo*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[ProviderInfo]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}

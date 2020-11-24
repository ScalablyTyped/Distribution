package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerrainTile extends js.Object {
  
  /** The global tile coordinates that uniquely identify this tile. */
  var coordinates: js.UndefOr[TileCoordinates] = js.native
  
  /** Terrain elevation data encoded as a FirstDerivativeElevationGrid. */
  var firstDerivative: js.UndefOr[FirstDerivativeElevationGrid] = js.native
  
  /**
    * Resource name of the tile. The tile resource name is prefixed by its collection ID `terrain/` followed by the resource ID, which encodes the tile's global x and y coordinates and
    * zoom level as `@,,z`. For example, `terrain/@1,2,3z`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Terrain elevation data encoded as a SecondDerivativeElevationGrid. . */
  var secondDerivative: js.UndefOr[SecondDerivativeElevationGrid] = js.native
}
object TerrainTile {
  
  @scala.inline
  def apply(): TerrainTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerrainTile]
  }
  
  @scala.inline
  implicit class TerrainTileOps[Self <: TerrainTile] (val x: Self) extends AnyVal {
    
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
    def setFirstDerivative(value: FirstDerivativeElevationGrid): Self = this.set("firstDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDerivative: Self = this.set("firstDerivative", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecondDerivative(value: SecondDerivativeElevationGrid): Self = this.set("secondDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondDerivative: Self = this.set("secondDerivative", js.undefined)
  }
}

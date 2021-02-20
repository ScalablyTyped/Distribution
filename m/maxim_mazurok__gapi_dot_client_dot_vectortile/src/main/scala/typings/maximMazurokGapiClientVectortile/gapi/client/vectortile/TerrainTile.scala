package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerrainTile extends StObject {
  
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
  implicit class TerrainTileMutableBuilder[Self <: TerrainTile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: TileCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setFirstDerivative(value: FirstDerivativeElevationGrid): Self = StObject.set(x, "firstDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDerivativeUndefined: Self = StObject.set(x, "firstDerivative", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecondDerivative(value: SecondDerivativeElevationGrid): Self = StObject.set(x, "secondDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondDerivativeUndefined: Self = StObject.set(x, "secondDerivative", js.undefined)
  }
}

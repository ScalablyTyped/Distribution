package typings.maximMazurokGapiClientVectortile

import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.FeaturetilesResource
import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.TerraintilesResource
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.v1
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.vectortile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Semantic Tile API v1 */
      def load(name: vectortile, version: v1): js.Thenable[Unit] = js.native
      def load(name: vectortile, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object vectortile extends js.Object {
        
        val featuretiles: FeaturetilesResource = js.native
        
        val terraintiles: TerraintilesResource = js.native
      }
    }
  }
}

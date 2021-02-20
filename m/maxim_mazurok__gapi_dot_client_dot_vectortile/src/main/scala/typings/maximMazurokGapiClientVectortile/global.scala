package typings.maximMazurokGapiClientVectortile

import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.FeaturetilesResource
import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.TerraintilesResource
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.v1
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.vectortile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Semantic Tile API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vectortile, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vectortile, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object vectortile {
        
        @JSGlobal("gapi.client.vectortile.featuretiles")
        @js.native
        val featuretiles: FeaturetilesResource = js.native
        
        @JSGlobal("gapi.client.vectortile.terraintiles")
        @js.native
        val terraintiles: TerraintilesResource = js.native
      }
    }
  }
}

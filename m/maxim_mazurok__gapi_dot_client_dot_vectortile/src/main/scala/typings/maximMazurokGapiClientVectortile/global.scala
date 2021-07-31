package typings.maximMazurokGapiClientVectortile

import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.FeaturetilesResource
import typings.maximMazurokGapiClientVectortile.gapi.client.vectortile.TerraintilesResource
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.v1
import typings.maximMazurokGapiClientVectortile.maximMazurokGapiClientVectortileStrings.vectortile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Semantic Tile API v1 */
      @scala.inline
      def load(name: vectortile, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: vectortile, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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

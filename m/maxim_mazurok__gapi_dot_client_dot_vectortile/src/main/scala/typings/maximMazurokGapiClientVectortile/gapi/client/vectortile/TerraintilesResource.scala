package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVectortile.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerraintilesResource extends StObject {
  
  /** Gets a terrain tile by its tile resource name. */
  def get(): Request[TerrainTile] = js.native
  def get(request: Alt): Request[TerrainTile] = js.native
}

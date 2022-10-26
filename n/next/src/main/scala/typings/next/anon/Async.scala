package typings.next.anon

import typings.next.distBuildWebpackPluginsFlightManifestPluginMod.ManifestChunks
import typings.next.distBuildWebpackPluginsFlightManifestPluginMod.ModuleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  /**
    * If chunk contains async module
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Chunks for the module. JS and CSS.
    */
  var chunks: ManifestChunks
  
  /**
    * Webpack module id
    */
  var id: ModuleId
  
  /**
    * Export name
    */
  var name: String
}
object Async {
  
  inline def apply(chunks: ManifestChunks, id: ModuleId, name: String): Async = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  extension [Self <: Async](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setChunks(value: ManifestChunks): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksVarargs(value: (/* template literal string: ${string}:${string} */ String)*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setId(value: ModuleId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

package typings.pixiLoaders

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pixiLoaders.mod.ILoaderPlugin
import typings.pixiLoaders.mod.IResourceMetadata
import typings.pixiLoaders.mod.Loader
import typings.pixiLoaders.mod.LoaderResource.LOAD_TYPE
import typings.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CrossOrigin extends StObject {
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
    
    var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
    
    var metadata: js.UndefOr[IResourceMetadata] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
  }
  object CrossOrigin {
    
    inline def apply(): CrossOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOrigin]
    }
    
    extension [Self <: CrossOrigin](x: Self) {
      
      inline def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setLoadType(value: LOAD_TYPE): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
      
      inline def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
      
      inline def setMetadata(value: IResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setXhrType(value: XHR_RESPONSE_TYPE): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
      
      inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
    }
  }
  
  @js.native
  trait TypeofLoader
    extends StObject
       with Instantiable0[Loader]
       with Instantiable1[/* baseUrl */ String, Loader]
       with Instantiable2[(/* baseUrl */ String) | (/* baseUrl */ Unit), /* concurrency */ Double, Loader] {
    
    var _plugins: js.Array[ILoaderPlugin] = js.native
    
    /* private */ var _shared: Any = js.native
    
    /**
      * Use the {@link PIXI.extensions.add} API to register plugins.
      * @deprecated since 6.5.0
      * @param plugin - The plugin to add
      * @returns Reference to PIXI.Loader for chaining
      */
    def registerPlugin(plugin: ILoaderPlugin): /* import warning: importer.ImportType#apply Failed type conversion: typeof Loader */ js.Any = js.native
    
    /** A premade instance of the loader that can be used to load resources. */
    def shared: Loader = js.native
  }
}

package typings.next.anon

import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.AssetBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/build/webpack/plugins/middleware-plugin.EdgeFunctionDefinition, 'wasm' | 'assets'> */
trait PickEdgeFunctionDefinitioAssets extends StObject {
  
  var assets: js.UndefOr[js.Array[AssetBinding]] = js.undefined
  
  var wasm: js.UndefOr[js.Array[AssetBinding]] = js.undefined
}
object PickEdgeFunctionDefinitioAssets {
  
  inline def apply(): PickEdgeFunctionDefinitioAssets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickEdgeFunctionDefinitioAssets]
  }
  
  extension [Self <: PickEdgeFunctionDefinitioAssets](x: Self) {
    
    inline def setAssets(value: js.Array[AssetBinding]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetBinding*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setWasm(value: js.Array[AssetBinding]): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
    
    inline def setWasmVarargs(value: AssetBinding*): Self = StObject.set(x, "wasm", js.Array(value*))
  }
}

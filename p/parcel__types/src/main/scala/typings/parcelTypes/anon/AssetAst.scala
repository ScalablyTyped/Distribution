package typings.parcelTypes.anon

import typings.parcelTypes.mod.AST
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetAst extends StObject {
  
  var asset: typings.parcelTypes.mod.Asset
  
  var ast: AST
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object AssetAst {
  
  inline def apply(asset: typings.parcelTypes.mod.Asset, ast: AST, logger: PluginLogger, options: PluginOptions): AssetAst = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetAst] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

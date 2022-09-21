package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin
  extends StObject
     with Processors
     with _AcceptedPlugin {
  
  var postcssPlugin: String
  
  var prepare: js.UndefOr[js.Function1[/* result */ typings.postcss.resultMod.default, Processors]] = js.undefined
}
object Plugin {
  
  inline def apply(postcssPlugin: String): Plugin = {
    val __obj = js.Dynamic.literal(postcssPlugin = postcssPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setPostcssPlugin(value: String): Self = StObject.set(x, "postcssPlugin", value.asInstanceOf[js.Any])
    
    inline def setPrepare(value: /* result */ typings.postcss.resultMod.default => Processors): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
  }
}

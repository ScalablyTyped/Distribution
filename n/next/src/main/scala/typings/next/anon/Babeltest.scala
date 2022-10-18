package typings.next.anon

import typings.next.distBuildBabelPresetMod.StyledJsxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Babeltest extends StObject {
  
  var `babel-test`: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[js.Array[StyledJsxPlugin]] = js.undefined
  
  var styleModule: js.UndefOr[String] = js.undefined
}
object Babeltest {
  
  inline def apply(): Babeltest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Babeltest]
  }
  
  extension [Self <: Babeltest](x: Self) {
    
    inline def `setBabel-test`(value: Boolean): Self = StObject.set(x, "babel-test", value.asInstanceOf[js.Any])
    
    inline def `setBabel-testUndefined`: Self = StObject.set(x, "babel-test", js.undefined)
    
    inline def setPlugins(value: js.Array[StyledJsxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: StyledJsxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setStyleModule(value: String): Self = StObject.set(x, "styleModule", value.asInstanceOf[js.Any])
    
    inline def setStyleModuleUndefined: Self = StObject.set(x, "styleModule", js.undefined)
  }
}

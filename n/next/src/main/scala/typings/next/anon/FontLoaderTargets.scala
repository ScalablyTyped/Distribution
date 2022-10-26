package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontLoaderTargets extends StObject {
  
  var appDirEnabled: Boolean
  
  var fontLoaderTargets: js.Array[String]
}
object FontLoaderTargets {
  
  inline def apply(appDirEnabled: Boolean, fontLoaderTargets: js.Array[String]): FontLoaderTargets = {
    val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], fontLoaderTargets = fontLoaderTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontLoaderTargets]
  }
  
  extension [Self <: FontLoaderTargets](x: Self) {
    
    inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
    
    inline def setFontLoaderTargets(value: js.Array[String]): Self = StObject.set(x, "fontLoaderTargets", value.asInstanceOf[js.Any])
    
    inline def setFontLoaderTargetsVarargs(value: String*): Self = StObject.set(x, "fontLoaderTargets", js.Array(value*))
  }
}

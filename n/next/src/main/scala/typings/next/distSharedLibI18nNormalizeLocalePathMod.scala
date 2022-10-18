package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibI18nNormalizeLocalePathMod {
  
  @JSImport("next/dist/shared/lib/i18n/normalize-locale-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeLocalePath(pathname: String): PathLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocalePath")(pathname.asInstanceOf[js.Any]).asInstanceOf[PathLocale]
  inline def normalizeLocalePath(pathname: String, locales: js.Array[String]): PathLocale = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocalePath")(pathname.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[PathLocale]
  
  trait PathLocale extends StObject {
    
    var detectedLocale: js.UndefOr[String] = js.undefined
    
    var pathname: String
  }
  object PathLocale {
    
    inline def apply(pathname: String): PathLocale = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathLocale]
    }
    
    extension [Self <: PathLocale](x: Self) {
      
      inline def setDetectedLocale(value: String): Self = StObject.set(x, "detectedLocale", value.asInstanceOf[js.Any])
      
      inline def setDetectedLocaleUndefined: Self = StObject.set(x, "detectedLocale", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
}

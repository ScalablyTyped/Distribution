package typings.next

import typings.next.distSharedLibRouterUtilsGetNextPathnameInfoMod.NextPathnameInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsFormatNextPathnameInfoMod {
  
  @JSImport("next/dist/shared/lib/router/utils/format-next-pathname-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatNextPathnameInfo(info: ExtendedInfo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNextPathnameInfo")(info.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ExtendedInfo
    extends StObject
       with NextPathnameInfo {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var ignorePrefix: js.UndefOr[Boolean] = js.undefined
  }
  object ExtendedInfo {
    
    inline def apply(pathname: String): ExtendedInfo = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedInfo]
    }
    
    extension [Self <: ExtendedInfo](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setIgnorePrefix(value: Boolean): Self = StObject.set(x, "ignorePrefix", value.asInstanceOf[js.Any])
      
      inline def setIgnorePrefixUndefined: Self = StObject.set(x, "ignorePrefix", js.undefined)
    }
  }
}

package typings.polished

import typings.polished.libTypesColorMod.HslColor
import typings.polished.libTypesColorMod.HslaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorHslToColorStringMod {
  
  @JSImport("polished/lib/color/hslToColorString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(color: HslColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(color: HslaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}

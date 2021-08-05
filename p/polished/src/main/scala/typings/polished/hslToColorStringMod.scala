package typings.polished

import typings.polished.colorMod.HslColor
import typings.polished.colorMod.HslaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslToColorStringMod {
  
  @JSImport("polished/lib/color/hslToColorString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(color: HslColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(color: HslaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}

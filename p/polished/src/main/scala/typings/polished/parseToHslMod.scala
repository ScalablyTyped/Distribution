package typings.polished

import typings.polished.colorMod.HslColor
import typings.polished.colorMod.HslaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseToHslMod {
  
  @JSImport("polished/lib/color/parseToHsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String): HslColor | HslaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[HslColor | HslaColor]
}

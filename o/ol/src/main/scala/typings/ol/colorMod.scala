package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("ol/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asArray(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def asArray(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def asString(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asString(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromString(s: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def isStringColor(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringColor")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalize(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def toString_(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Color = js.Array[Double]
}

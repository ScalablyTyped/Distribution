package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringWhiteSpaceMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/whiteSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeEmptyLines(c: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeEmptyLines(c: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeWhites(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeWhites(s: String, replaceWith: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shorter(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def shorter(text: String, much: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any], much.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def trimRightLines(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trimRightLines(s: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringFormatMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indent(i: Double, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def indent(i: Unit, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def quote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quote(s: String, quote: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any], quote.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def repeat(n: Double, s: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strip(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unquote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unquote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wordWrap(s: String, w: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def wordWrap(s: String, w: Double, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
}

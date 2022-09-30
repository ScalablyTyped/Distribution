package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  @JSImport("playcanvas", "string")
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(s: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(s.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def fromCodePoint(args: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def getCodePoint(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoint")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCodePoint(string: String, i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoint")(string.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCodePoints(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoints")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getSymbols(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbols")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toBool(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def toBool(s: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(s.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

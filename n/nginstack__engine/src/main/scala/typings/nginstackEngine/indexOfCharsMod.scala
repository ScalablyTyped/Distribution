package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexOfCharsMod {
  
  inline def apply(str: String, chars: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(str: String, chars: js.Array[String], index: Double): Double = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/string/indexOfChars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

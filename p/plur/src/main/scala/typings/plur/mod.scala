package typings.plur

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(word: String, plural: String, count: Double): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("plur", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

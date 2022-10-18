package typings.plur

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("plur", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(word: String, plural: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(word.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
}

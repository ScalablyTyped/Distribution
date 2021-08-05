package typings.nanoid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nanoidMod {
  
  inline def apply(random: js.Function1[/* bytes */ Double, js.Array[Double]], alphabet: String, size: Double): String = (^.asInstanceOf[js.Dynamic].apply(random.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("nanoid/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

package typings.nanoid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @scala.inline
  def apply(
    random: js.Function1[/* bytes */ Double, js.Promise[js.Array[Double]]],
    alphabet: String,
    size: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(random.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("nanoid/async/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

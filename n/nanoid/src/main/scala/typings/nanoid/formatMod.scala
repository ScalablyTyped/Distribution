package typings.nanoid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("nanoid/async/format", JSImport.Namespace)
  @js.native
  def apply(
    random: js.Function1[/* bytes */ Double, js.Promise[js.Array[Double]]],
    alphabet: String,
    size: Double
  ): js.Promise[String] = js.native
}

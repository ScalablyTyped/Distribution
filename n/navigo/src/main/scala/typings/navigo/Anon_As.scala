package typings.navigo

import typings.navigo.navigoMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: String
  def uses(params: Params, query: String): Unit
}

object Anon_As {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Unit): Anon_As = {
    val __obj = js.Dynamic.literal(as = as, uses = js.Any.fromFunction2(uses))
  
    __obj.asInstanceOf[Anon_As]
  }
}


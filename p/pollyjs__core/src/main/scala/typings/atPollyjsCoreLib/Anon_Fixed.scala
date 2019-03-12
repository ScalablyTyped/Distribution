package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fixed extends js.Object {
  def fixed(ms: scala.Double): js.Function0[js.Promise[scala.Unit]]
  def relative(ratio: scala.Double): js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]]
}

object Anon_Fixed {
  @scala.inline
  def apply(
    fixed: scala.Double => js.Function0[js.Promise[scala.Unit]],
    relative: scala.Double => js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]]
  ): Anon_Fixed = {
    val __obj = js.Dynamic.literal(fixed = js.Any.fromFunction1(fixed), relative = js.Any.fromFunction1(relative))
  
    __obj.asInstanceOf[Anon_Fixed]
  }
}


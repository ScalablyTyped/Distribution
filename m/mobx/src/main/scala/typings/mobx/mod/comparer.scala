package typings.mobx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "comparer")
@js.native
object comparer extends js.Object {
  @JSName("default")
  var default_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  @JSName("identity")
  var identity_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  @JSName("shallow")
  var shallow_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  @JSName("structural")
  var structural_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  def default(a: js.Any, b: js.Any): Boolean = js.native
  def identity(a: js.Any, b: js.Any): Boolean = js.native
  def shallow(a: js.Any, b: js.Any): Boolean = js.native
  def structural(a: js.Any, b: js.Any): Boolean = js.native
}


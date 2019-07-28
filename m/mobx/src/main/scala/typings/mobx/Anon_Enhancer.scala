package typings.mobx

import typings.mobx.libTypesModifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Enhancer extends js.Object {
  @JSName("enhancer")
  var enhancer_Original: IEnhancer[_] = js.native
  def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
  def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
}


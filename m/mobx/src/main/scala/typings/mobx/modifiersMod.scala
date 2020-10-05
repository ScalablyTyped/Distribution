package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/modifiers", JSImport.Namespace)
@js.native
object modifiersMod extends js.Object {
  def deepEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = js.native
  def referenceEnhancer(): js.Any = js.native
  def referenceEnhancer(newValue: js.Any): js.Any = js.native
  def shallowEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  type IEnhancer[T] = js.Function3[/* newValue */ T, /* oldValue */ js.UndefOr[T], /* name */ String, T]
}


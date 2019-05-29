package typings
package mobxLib.libApiObservabledecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableDecorator extends js.Object {
  @JSName("enhancer")
  var enhancer_Original: mobxLib.libTypesModifiersMod.IEnhancer[_] = js.native
  def apply(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: java.lang.String): js.Any = js.native
  def enhancer(newValue: js.Any, oldValue: js.Any, name: java.lang.String): js.Any = js.native
}


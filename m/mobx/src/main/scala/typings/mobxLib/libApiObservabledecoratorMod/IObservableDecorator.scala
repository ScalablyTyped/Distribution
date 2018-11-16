package typings
package mobxLib.libApiObservabledecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableDecorator extends js.Object {
  var enhancer: mobxLib.libTypesModifiersMod.IEnhancer[_] = js.native
  def apply(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
}


package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/extendobservable", JSImport.Namespace)
@js.native
object libApiExtendobservableMod extends js.Object {
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: mobxLib.mobxLibStrings.extendObservable with js.Any): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: mobxLib.mobxLibStrings.extendObservable with js.Any,
    options: mobxLib.libApiObservableMod.CreateObservableOptions
  ): A with B = js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): scala.Unit = js.native
  def getDefaultDecoratorFromObjectOptions(options: mobxLib.libApiObservableMod.CreateObservableOptions): mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
}


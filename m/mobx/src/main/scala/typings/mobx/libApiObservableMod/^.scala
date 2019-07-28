package typings.mobx.libApiObservableMod

import typings.mobx.Anon_Enhancer
import typings.mobx.libApiObservabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val deepDecorator: IObservableDecorator = js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  val observable: IObservableFactory with IObservableFactories with Anon_Enhancer = js.native
  val refDecorator: IObservableDecorator = js.native
  def asCreateObservableOptions(thing: js.Any): CreateObservableOptions = js.native
}


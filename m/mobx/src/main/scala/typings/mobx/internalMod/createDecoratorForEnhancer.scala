package typings.mobx.internalMod

import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "createDecoratorForEnhancer")
@js.native
object createDecoratorForEnhancer extends js.Object {
  def apply(enhancer: IEnhancer[_]): IObservableDecorator = js.native
}


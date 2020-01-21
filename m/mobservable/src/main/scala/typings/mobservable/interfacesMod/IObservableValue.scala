package typings.mobservable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableValue[T] extends IObservable {
  def apply(): T = js.native
  def apply(value: T): Unit = js.native
  def observe(callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
  def observe(callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
}


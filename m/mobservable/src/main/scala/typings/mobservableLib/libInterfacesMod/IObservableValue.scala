package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableValue[T] extends IObservable {
  def apply(): T = js.native
  def apply(value: T): scala.Unit = js.native
  def observe(callback: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit]): Lambda = js.native
  def observe(
    callback: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit],
    fireImmediately: scala.Boolean
  ): Lambda = js.native
}


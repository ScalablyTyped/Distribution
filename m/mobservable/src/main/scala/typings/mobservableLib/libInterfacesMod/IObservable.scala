package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable extends js.Object {
  def observe(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Lambda = js.native
  def observe(callback: js.Function1[/* repeated */ js.Any, scala.Unit], fireImmediately: scala.Boolean): Lambda = js.native
}


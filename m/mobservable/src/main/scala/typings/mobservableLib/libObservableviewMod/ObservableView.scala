package typings
package mobservableLib.libObservableviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observableview", "ObservableView")
@js.native
class ObservableView[T] protected ()
  extends mobservableLib.libDnodeMod.ViewNode {
  def this(func: js.Function0[T], scope: js.Object, context: mobservableLib.libInterfacesMod.IContextInfoStruct, compareStructural: scala.Boolean) = this()
  var _value: T = js.native
  var changeEvent: mobservableLib.libSimpleeventemitterMod.default = js.native
  var compareStructural: js.Any = js.native
  var isComputing: js.Any = js.native
  var scope: js.Any = js.native
  /* protected */ def func(): T = js.native
  def get(): T = js.native
  def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe(
    listener: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit],
    fireImmediately: scala.Boolean
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def set(x: js.Any): scala.Unit = js.native
}


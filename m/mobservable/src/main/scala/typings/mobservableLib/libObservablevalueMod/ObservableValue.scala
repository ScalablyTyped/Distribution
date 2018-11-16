package typings
package mobservableLib.libObservablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observablevalue", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends mobservableLib.libDnodeMod.DataNode {
  def this(value: T, mode: mobservableLib.libCoreMod.ValueMode, context: mobservableLib.libInterfacesMod.IContextInfoStruct) = this()
  var _value: T = js.native
  var changeEvent: mobservableLib.libSimpleeventemitterMod.default = js.native
  var mode: mobservableLib.libCoreMod.ValueMode = js.native
  var value: T = js.native
  def get(): T = js.native
  /* private */ def makeReferenceValueReactive(value: js.Any): js.Any = js.native
  def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe(
    listener: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit],
    fireImmediately: scala.Boolean
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def set(newValue: T): scala.Boolean = js.native
}


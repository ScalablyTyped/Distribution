package typings.mobservable

import typings.mobservable.libDnodeMod.ViewNode
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libSimpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observableview", JSImport.Namespace)
@js.native
object libObservableviewMod extends js.Object {
  @js.native
  class ObservableView[T] protected () extends ViewNode {
    def this(func: js.Function0[T], scope: js.Object, context: IContextInfoStruct, compareStructural: Boolean) = this()
    var _value: T = js.native
    var changeEvent: default = js.native
    var compareStructural: js.Any = js.native
    var isComputing: js.Any = js.native
    var scope: js.Any = js.native
    /* protected */ def func(): T = js.native
    def get(): T = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    def set(x: js.Any): Unit = js.native
  }
  
  def throwingViewSetter(name: js.Any): Lambda = js.native
}


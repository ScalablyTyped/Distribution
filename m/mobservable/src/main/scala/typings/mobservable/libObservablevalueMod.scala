package typings.mobservable

import typings.mobservable.libCoreMod.ValueMode
import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libSimpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observablevalue", JSImport.Namespace)
@js.native
object libObservablevalueMod extends js.Object {
  @js.native
  class ObservableValue[T] protected () extends DataNode {
    def this(value: T, mode: ValueMode, context: IContextInfoStruct) = this()
    var _value: T = js.native
    var changeEvent: default = js.native
    var mode: ValueMode = js.native
    var value: T = js.native
    def get(): T = js.native
    /* private */ def makeReferenceValueReactive(value: js.Any): js.Any = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    def set(newValue: T): Boolean = js.native
  }
  
}


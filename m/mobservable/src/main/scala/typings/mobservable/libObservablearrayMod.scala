package typings.mobservable

import typings.mobservable.libCoreMod.ValueMode
import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libInterfacesMod.IArrayChange
import typings.mobservable.libInterfacesMod.IArraySplice
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import typings.mobservable.libInterfacesMod.IObservableArray
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libObservablearrayMod.ObservableArray
import typings.mobservable.libObservablearrayMod.ObservableArrayAdministration
import typings.mobservable.libObservablearrayMod.StubArray
import typings.mobservable.libSimpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observablearray", JSImport.Namespace)
@js.native
object libObservablearrayMod extends js.Object {
  @js.native
  class ObservableArray[T] protected () extends StubArray {
    def this(
      initialValues: js.Array[T],
      mode: ValueMode,
      supportEnumerable: Boolean,
      context: IContextInfoStruct
    ) = this()
    @JSName("$mobservable")
    var $mobservable: ObservableArrayAdministration[T] = js.native
    def clear(): js.Array[T] = js.native
    def find(predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ ObservableArray[T], Boolean]): T = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ ObservableArray[T], Boolean],
      thisArg: js.Any
    ): T = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ ObservableArray[T], Boolean],
      thisArg: js.Any,
      fromIndex: Double
    ): T = js.native
    def observe(listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit]): Lambda = js.native
    def observe(
      listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit],
      fireImmediately: Boolean
    ): Lambda = js.native
    def peek(): js.Array[T] = js.native
    def pop(): T = js.native
    def push(items: T*): Double = js.native
    def remove(value: T): Boolean = js.native
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
    def reverse(): js.Array[T] = js.native
    def shift(): T = js.native
    def sort(): js.Array[T] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
    def splice(index: Double): js.Array[T] = js.native
    def splice(index: Double, deleteCount: Double, newItems: T*): js.Array[T] = js.native
    def toJSON(): js.Array[T] = js.native
    def unshift(items: T*): Double = js.native
  }
  
  @js.native
  class ObservableArrayAdministration[T] protected () extends DataNode {
    def this(
      array: ObservableArray[T],
      mode: ValueMode,
      supportEnumerable: Boolean,
      context: IContextInfoStruct
    ) = this()
    var array: ObservableArray[T] = js.native
    var changeEvent: default = js.native
    var lastKnownLength: Double = js.native
    var mode: ValueMode = js.native
    var supportEnumerable: Boolean = js.native
    var values: js.Array[T] = js.native
    def getLength(): Double = js.native
    def makeReactiveArrayItem(value: js.Any): js.Any = js.native
    /* private */ def notifyChanged(): js.Any = js.native
    /* private */ def notifyChildUpdate(index: js.Any, oldValue: js.Any): js.Any = js.native
    /* private */ def notifySplice(index: js.Any, deleted: js.Any, added: js.Any): js.Any = js.native
    def setLength(newLength: js.Any): Double = js.native
    def spliceWithArray(index: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    def updateLength(oldLength: Double, delta: Double): Unit = js.native
  }
  
  @js.native
  class StubArray () extends js.Object
  
  def createObservableArray[T](
    initialValues: js.Array[T],
    mode: ValueMode,
    supportEnumerable: Boolean,
    context: IContextInfoStruct
  ): IObservableArray[T] = js.native
}


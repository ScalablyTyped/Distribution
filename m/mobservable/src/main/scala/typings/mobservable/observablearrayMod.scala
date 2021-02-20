package typings.mobservable

import typings.mobservable.coreMod.ValueMode
import typings.mobservable.dnodeMod.DataNode
import typings.mobservable.interfacesMod.IArrayChange
import typings.mobservable.interfacesMod.IArraySplice
import typings.mobservable.interfacesMod.IContextInfoStruct
import typings.mobservable.interfacesMod.IObservableArray
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.simpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablearrayMod {
  
  @JSImport("mobservable/lib/observablearray", "ObservableArray")
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
      thisArg: js.UndefOr[scala.Nothing],
      fromIndex: Double
    ): T = js.native
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
    
    def splice(index: Double, deleteCount: js.UndefOr[scala.Nothing], newItems: T*): js.Array[T] = js.native
    def splice(index: Double, deleteCount: Double, newItems: T*): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
  }
  
  @JSImport("mobservable/lib/observablearray", "ObservableArrayAdministration")
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
    
    def getLength(): Double = js.native
    
    var lastKnownLength: Double = js.native
    
    def makeReactiveArrayItem(value: js.Any): js.Any = js.native
    
    var mode: ValueMode = js.native
    
    /* private */ def notifyChanged(): js.Any = js.native
    
    /* private */ def notifyChildUpdate(index: js.Any, oldValue: js.Any): js.Any = js.native
    
    /* private */ def notifySplice(index: js.Any, deleted: js.Any, added: js.Any): js.Any = js.native
    
    def setLength(newLength: js.Any): Double = js.native
    
    def spliceWithArray(index: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: js.UndefOr[scala.Nothing], newItems: js.Array[T]): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    
    var supportEnumerable: Boolean = js.native
    
    def updateLength(oldLength: Double, delta: Double): Unit = js.native
    
    var values: js.Array[T] = js.native
  }
  
  @JSImport("mobservable/lib/observablearray", "StubArray")
  @js.native
  class StubArray () extends StObject
  
  @JSImport("mobservable/lib/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](
    initialValues: js.Array[T],
    mode: ValueMode,
    supportEnumerable: Boolean,
    context: IContextInfoStruct
  ): IObservableArray[T] = js.native
}

package typings.mobservable

import typings.mobservable.coreMod.ValueMode
import typings.mobservable.dnodeMod.DataNode
import typings.mobservable.interfacesMod.IContextInfoStruct
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.simpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/observablevalue", JSImport.Namespace)
@js.native
object observablevalueMod extends js.Object {
  
  @js.native
  class ObservableValue[T] protected () extends DataNode {
    def this(value: T, mode: ValueMode, context: IContextInfoStruct) = this()
    
    var _value: T = js.native
    
    var changeEvent: default = js.native
    
    def get(): T = js.native
    
    /* private */ def makeReferenceValueReactive(value: js.Any): js.Any = js.native
    
    var mode: ValueMode = js.native
    
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(newValue: T): Boolean = js.native
    
    var value: T = js.native
  }
}

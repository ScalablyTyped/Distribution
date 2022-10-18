package typings.mobservable

import typings.mobservable.libCoreMod.ValueMode
import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libSimpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablevalueMod {
  
  @JSImport("mobservable/lib/observablevalue", "ObservableValue")
  @js.native
  open class ObservableValue[T] protected () extends DataNode {
    def this(value: T, mode: ValueMode, context: IContextInfoStruct) = this()
    
    /* protected */ var _value: T = js.native
    
    /* protected */ var changeEvent: default = js.native
    
    def get(): T = js.native
    
    /* private */ def makeReferenceValueReactive(value: Any): Any = js.native
    
    /* protected */ var mode: ValueMode = js.native
    
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(newValue: T): Boolean = js.native
    
    /* protected */ var value: T = js.native
  }
}

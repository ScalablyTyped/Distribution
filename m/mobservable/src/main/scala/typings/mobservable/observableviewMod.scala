package typings.mobservable

import typings.mobservable.dnodeMod.ViewNode
import typings.mobservable.interfacesMod.IContextInfoStruct
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.simpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableviewMod {
  
  @JSImport("mobservable/lib/observableview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/observableview", "ObservableView")
  @js.native
  class ObservableView[T] protected () extends ViewNode {
    def this(func: js.Function0[T], scope: js.Object, context: IContextInfoStruct, compareStructural: Boolean) = this()
    
    var _value: T = js.native
    
    var changeEvent: default = js.native
    
    var compareStructural: js.Any = js.native
    
    /* protected */ def func(): T = js.native
    
    def get(): T = js.native
    
    var isComputing: js.Any = js.native
    
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    
    var scope: js.Any = js.native
    
    def set(x: js.Any): Unit = js.native
  }
  
  @scala.inline
  def throwingViewSetter(name: js.Any): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("throwingViewSetter")(name.asInstanceOf[js.Any]).asInstanceOf[Lambda]
}

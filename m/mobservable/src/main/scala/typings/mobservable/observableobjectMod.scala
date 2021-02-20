package typings.mobservable

import org.scalablytyped.runtime.StringDictionary
import typings.mobservable.coreMod.ValueMode
import typings.mobservable.dnodeMod.DataNode
import typings.mobservable.interfacesMod.IContextInfoStruct
import typings.mobservable.interfacesMod.IObjectChange
import typings.mobservable.interfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableobjectMod {
  
  @JSImport("mobservable/lib/observableobject", "ObservableObject")
  @js.native
  class ObservableObject protected () extends StObject {
    def this(target: js.Any, context: IContextInfoStruct, mode: ValueMode) = this()
    
    var _events: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def defineReactiveProperty(propName: js.Any, value: js.Any): js.Any = js.native
    
    var mode: js.Any = js.native
    
    def observe(callback: js.Function1[/* changes */ IObjectChange[_, _], Unit]): Lambda = js.native
    
    def set(propName: js.Any, value: js.Any): Unit = js.native
    
    var target: js.Any = js.native
    
    var values: StringDictionary[DataNode] = js.native
  }
  /* static members */
  object ObservableObject {
    
    @JSImport("mobservable/lib/observableobject", "ObservableObject.asReactive")
    @js.native
    def asReactive(target: js.Any, context: IContextInfoStruct, mode: ValueMode): ObservableObject = js.native
  }
}

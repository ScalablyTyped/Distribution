package typings.mobservable

import org.scalablytyped.runtime.StringDictionary
import typings.mobservable.libCoreMod.ValueMode
import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import typings.mobservable.libInterfacesMod.IObjectChange
import typings.mobservable.libInterfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservableobjectMod {
  
  @JSImport("mobservable/lib/observableobject", "ObservableObject")
  @js.native
  open class ObservableObject protected () extends StObject {
    def this(target: Any, context: IContextInfoStruct, mode: ValueMode) = this()
    
    /* private */ var _events: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /* private */ def defineReactiveProperty(propName: Any, value: Any): Any = js.native
    
    /* private */ var mode: Any = js.native
    
    def observe(callback: js.Function1[/* changes */ IObjectChange[Any, Any], Unit]): Lambda = js.native
    
    def set(propName: Any, value: Any): Unit = js.native
    
    /* private */ var target: Any = js.native
    
    var values: StringDictionary[DataNode] = js.native
  }
  /* static members */
  object ObservableObject {
    
    @JSImport("mobservable/lib/observableobject", "ObservableObject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def asReactive(target: Any, context: IContextInfoStruct, mode: ValueMode): ObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("asReactive")(target.asInstanceOf[js.Any], context.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[ObservableObject]
  }
}

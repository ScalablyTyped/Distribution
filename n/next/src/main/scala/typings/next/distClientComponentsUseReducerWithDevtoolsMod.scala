package typings.next

import typings.react.mod.Dispatch
import typings.react.mod.ReducerAction
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsUseReducerWithDevtoolsMod {
  
  @JSImport("next/dist/client/components/use-reducer-with-devtools", "useReducerWithReduxDevtools")
  @js.native
  val useReducerWithReduxDevtools: js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof reducer */ /* fn */ js.Any, 
    /* initialState */ ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reducer */ js.Any
    ], 
    js.Tuple3[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof reducer */ js.Any
      ], 
      Dispatch[
        ReducerAction[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof reducer */ js.Any
        ]
      ], 
      js.Function0[Unit]
    ]
  ] = js.native
  
  object global {
    
    trait Window extends StObject {
      
      var __REDUX_DEVTOOLS_EXTENSION__ : Any
    }
    object Window {
      
      inline def apply(__REDUX_DEVTOOLS_EXTENSION__ : Any): typings.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window = {
        val __obj = js.Dynamic.literal(__REDUX_DEVTOOLS_EXTENSION__ = __REDUX_DEVTOOLS_EXTENSION__.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window]
      }
      
      extension [Self <: typings.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window](x: Self) {
        
        inline def set__REDUX_DEVTOOLS_EXTENSION__(value: Any): Self = StObject.set(x, "__REDUX_DEVTOOLS_EXTENSION__", value.asInstanceOf[js.Any])
      }
    }
  }
}

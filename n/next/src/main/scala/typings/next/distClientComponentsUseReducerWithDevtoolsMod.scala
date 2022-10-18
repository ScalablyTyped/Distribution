package typings.next

import typings.next.anon.ReadonlyAppRouterState
import typings.next.distClientComponentsReducerMod.AppRouterState
import typings.next.distClientComponentsReducerMod.NavigateAction
import typings.next.distClientComponentsReducerMod.PrefetchAction
import typings.next.distClientComponentsReducerMod.ReloadAction
import typings.next.distClientComponentsReducerMod.RestoreAction
import typings.next.distClientComponentsReducerMod.ServerPatchAction
import typings.react.mod.Dispatch
import typings.react.mod.ReducerAction
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsUseReducerWithDevtoolsMod {
  
  @JSImport("next/dist/client/components/use-reducer-with-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useReducerWithReduxDevtools(
    fn: js.Function2[
      /* state */ ReadonlyAppRouterState, 
      /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
      AppRouterState
    ],
    initialState: ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ]
  ): js.Tuple3[
    ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ], 
    Dispatch[
      ReducerAction[
        js.Function2[
          /* state */ ReadonlyAppRouterState, 
          /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
          AppRouterState
        ]
      ]
    ], 
    js.Function0[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerWithReduxDevtools")(fn.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ], 
    Dispatch[
      ReducerAction[
        js.Function2[
          /* state */ ReadonlyAppRouterState, 
          /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
          AppRouterState
        ]
      ]
    ], 
    js.Function0[Unit]
  ]]
  
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

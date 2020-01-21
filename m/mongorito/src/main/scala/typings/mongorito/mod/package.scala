package typings.mongorito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type ModelClass = typings.mongorito.mod.Class[typings.mongorito.mod.Model]
  type Plugin = js.Function1[
    /* modelClass */ typings.mongorito.mod.ModelClass, 
    js.Function1[
      /* store */ typings.mongorito.mod.PluginStore, 
      js.Function1[
        /* next */ typings.mongorito.mod.PluginNext, 
        js.Function1[/* action */ typings.mongorito.mod.Action, scala.Unit]
      ]
    ]
  ]
  type PluginNext = js.Function1[/* action */ typings.mongorito.mod.Action, scala.Unit]
  type Reducer[S] = js.Function2[
    /* state */ S, 
    /* action */ typings.mongorito.mod.Action, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  ]
  type ReducerModifier = js.Function1[
    /* reducerState */ typings.mongorito.mod.ReducerState, 
    typings.mongorito.mod.ReducerState
  ]
  type ReducerState = typings.mongorito.mod.DefaultReducer with (typings.std.Map[_, typings.mongorito.mod.Reducer[_]])
  type State = typings.mongorito.mod.DefaultState with js.Any
}

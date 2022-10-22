package typings.mongorito.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Class[T] = Instantiable1[/* args (repeated) */ Any, T]

type ModelClass = Class[Model]

type Plugin = js.Function1[
/* modelClass */ ModelClass, 
js.Function1[
  /* store */ PluginStore, 
  js.Function1[/* next */ PluginNext, js.Function1[/* action */ Action, Unit]]
]]

type PluginNext = js.Function1[/* action */ Action, Unit]

type ReducerModifier = js.Function1[/* reducerState */ ReducerState, ReducerState]

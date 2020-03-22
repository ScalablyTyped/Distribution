package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  type LoadableComponent[P] = typings.react.mod.ComponentType[P]
  type LoadableFn[P] = js.Function1[
    /* opts */ typings.nextServer.dynamicMod.LoadableOptions[P], 
    typings.react.mod.ComponentType[P]
  ]
  type Loader[P] = js.Function0[typings.nextServer.dynamicMod.LoaderComponent[P]] | typings.nextServer.dynamicMod.LoaderComponent[P]
  type LoaderComponent[P] = js.Promise[typings.react.mod.ComponentType[P] | typings.nextServer.AnonDefault[P]]
  type LoaderMap = org.scalablytyped.runtime.StringDictionary[js.Function0[typings.nextServer.dynamicMod.Loader[js.Any]]]
}

package typings.nextServer.loadableMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadable extends js.Object {
  def apply[P](opts: js.Any): ComponentClass[P, ComponentState] = js.native
  def Map[P](opts: js.Any): ComponentType[P] = js.native
  def preloadAll(): js.Promise[_] = js.native
}


package typings.nuclearDashJs.nuclearDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Reactor")
@js.native
/**
  * State is stored in NuclearJS Reactors. Reactors contain a `state` object
  * which is an Immutable.Map
  *
  * The only way Reactors can change state is by reacting to messages. To
  * update state, Reactor's dispatch messages to all registered stores, and
  * the store returns it's new state based on the message
  */
class ReactorCls () extends Reactor {
  def this(config: ReactorConfig) = this()
}


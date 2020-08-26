package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a WebGL state, and is is passed The WebGL StateManager.
  *
  * Each mesh rendered may require WebGL to be in a different state.
  * For example you may want different blend mode or to enable polygon offsets
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "State")
@js.native
class State ()
  extends typings.pixiJs.PIXI.State


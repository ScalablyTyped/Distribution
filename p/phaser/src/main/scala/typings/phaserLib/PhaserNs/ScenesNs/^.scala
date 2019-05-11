package typings
package phaserLib.PhaserNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scenes")
@js.native
object ^ extends js.Object {
  /**
    * Scene state.
    */
  var CREATING: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var DESTROYED: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var INIT: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var LOADING: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var PAUSED: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var PENDING: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var RUNNING: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var SHUTDOWN: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var SLEEPING: phaserLib.integer = js.native
  /**
    * Scene state.
    */
  var START: phaserLib.integer = js.native
  /**
    * Builds an array of which physics plugins should be activated for the given Scene.
    * @param sys The scene system to get the physics systems of.
    */
  def GetPhysicsPlugins(sys: Systems): js.Array[_] = js.native
  /**
    * Builds an array of which plugins (not including physics plugins) should be activated for the given Scene.
    * @param sys The Scene Systems object to check for plugins.
    */
  def GetScenePlugins(sys: Systems): js.Array[_] = js.native
}


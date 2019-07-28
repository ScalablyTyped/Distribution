package typings.phaser.PhaserNs.ScenesNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scenes")
@js.native
object ^ extends js.Object {
  /**
    * Scene state.
    */
  var CREATING: integer = js.native
  /**
    * Scene state.
    */
  var DESTROYED: integer = js.native
  /**
    * Scene state.
    */
  var INIT: integer = js.native
  /**
    * Scene state.
    */
  var LOADING: integer = js.native
  /**
    * Scene state.
    */
  var PAUSED: integer = js.native
  /**
    * Scene state.
    */
  var PENDING: integer = js.native
  /**
    * Scene state.
    */
  var RUNNING: integer = js.native
  /**
    * Scene state.
    */
  var SHUTDOWN: integer = js.native
  /**
    * Scene state.
    */
  var SLEEPING: integer = js.native
  /**
    * Scene state.
    */
  var START: integer = js.native
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


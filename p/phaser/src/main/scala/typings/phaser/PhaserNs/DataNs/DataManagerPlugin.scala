package typings.phaser.PhaserNs.DataNs

import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.ScenesNs.Systems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Data Component features a means to store pieces of data specific to a Game Object, System or Plugin.
  * You can then search, query it, and retrieve the data. The parent must either extend EventEmitter,
  * or have a property called `events` that is an instance of it.
  */
@JSGlobal("Phaser.Data.DataManagerPlugin")
@js.native
class DataManagerPlugin protected () extends DataManager {
  /**
    * 
    * @param scene A reference to the Scene that this DataManager belongs to.
    */
  def this(scene: Scene) = this()
  /**
    * A reference to the Scene that this DataManager belongs to.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene's Systems.
    */
  var systems: Systems = js.native
}


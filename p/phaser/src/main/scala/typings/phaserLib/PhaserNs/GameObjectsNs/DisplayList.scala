package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Display List plugin.
  * 
  * Display Lists belong to a Scene and maintain the list of Game Objects to render every frame.
  * 
  * Some of these Game Objects may also be part of the Scene's [Update List]{@link Phaser.GameObjects.UpdateList}, for updating.
  */
@JSGlobal("Phaser.GameObjects.DisplayList")
@js.native
class DisplayList protected ()
  extends phaserLib.PhaserNs.StructsNs.List[GameObject] {
  /**
    * 
    * @param scene The Scene that this Display List belongs to.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * The Scene that this Display List belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * The flag the determines whether Game Objects should be sorted when `depthSort()` is called.
    */
  var sortChildrenFlag: scala.Boolean = js.native
  /**
    * The Scene's Systems.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * Immediately sorts the display list if the flag is set.
    */
  def depthSort(): scala.Unit = js.native
  /**
    * Returns an array which contains all objects currently on the Display List.
    * This is a reference to the main list array, not a copy of it, so be careful not to modify it.
    */
  def getChildren(): js.Array[GameObject] = js.native
  /**
    * Force a sort of the display list on the next call to depthSort.
    */
  def queueDepthSort(): scala.Unit = js.native
  /**
    * Compare the depth of two Game Objects.
    * @param childA The first Game Object.
    * @param childB The second Game Object.
    */
  def sortByDepth(childA: GameObject, childB: GameObject): phaserLib.integer = js.native
}


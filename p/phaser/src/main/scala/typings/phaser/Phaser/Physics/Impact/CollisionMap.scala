package typings.phaser.Phaser.Physics.Impact

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Impact.CollisionMap")
@js.native
/**
  * 
  * @param tilesize [description] Default 32.
  * @param data [description]
  */
class CollisionMap () extends js.Object {
  def this(tilesize: integer) = this()
  def this(tilesize: integer, data: js.Array[_]) = this()
  /**
    * [description]
    */
  var data: js.Array[_] = js.native
  /**
    * [description]
    */
  var height: Double = js.native
  /**
    * [description]
    */
  var lastSlope: integer = js.native
  /**
    * [description]
    */
  var tiledef: js.Object = js.native
  /**
    * [description]
    */
  var tilesize: integer = js.native
  /**
    * [description]
    */
  var width: Double = js.native
  /**
    * [description]
    * @param res [description]
    * @param t [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param width [description]
    * @param height [description]
    * @param tileX [description]
    * @param tileY [description]
    */
  def checkDef(
    res: js.Object,
    t: Double,
    x: Double,
    y: Double,
    vx: Double,
    vy: Double,
    width: Double,
    height: Double,
    tileX: Double,
    tileY: Double
  ): Boolean = js.native
  /**
    * [description]
    * @param res [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param width [description]
    * @param height [description]
    * @param rvx [description]
    * @param rvy [description]
    * @param step [description]
    */
  def step(
    res: js.Object,
    x: Double,
    y: Double,
    vx: Double,
    vy: Double,
    width: Double,
    height: Double,
    rvx: Double,
    rvy: Double,
    step: Double
  ): Unit = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param objectWidth [description]
    * @param objectHeight [description]
    */
  def trace(x: Double, y: Double, vx: Double, vy: Double, objectWidth: Double, objectHeight: Double): Boolean = js.native
}


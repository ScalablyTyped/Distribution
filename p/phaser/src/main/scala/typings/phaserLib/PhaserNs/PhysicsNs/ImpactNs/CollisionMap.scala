package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

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
  def this(tilesize: phaserLib.integer) = this()
  def this(tilesize: phaserLib.integer, data: js.Array[_]) = this()
  /**
    * [description]
    */
  var data: js.Array[_] = js.native
  /**
    * [description]
    */
  var height: scala.Double = js.native
  /**
    * [description]
    */
  var lastSlope: phaserLib.integer = js.native
  /**
    * [description]
    */
  var tiledef: js.Object = js.native
  /**
    * [description]
    */
  var tilesize: phaserLib.integer = js.native
  /**
    * [description]
    */
  var width: scala.Double = js.native
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
    t: scala.Double,
    x: scala.Double,
    y: scala.Double,
    vx: scala.Double,
    vy: scala.Double,
    width: scala.Double,
    height: scala.Double,
    tileX: scala.Double,
    tileY: scala.Double
  ): scala.Boolean = js.native
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
    x: scala.Double,
    y: scala.Double,
    vx: scala.Double,
    vy: scala.Double,
    width: scala.Double,
    height: scala.Double,
    rvx: scala.Double,
    rvy: scala.Double,
    step: scala.Double
  ): scala.Unit = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param objectWidth [description]
    * @param objectHeight [description]
    */
  def trace(
    x: scala.Double,
    y: scala.Double,
    vx: scala.Double,
    vy: scala.Double,
    objectWidth: scala.Double,
    objectHeight: scala.Double
  ): scala.Boolean = js.native
}


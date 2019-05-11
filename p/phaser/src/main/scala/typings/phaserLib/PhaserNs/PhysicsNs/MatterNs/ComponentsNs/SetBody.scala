package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait SetBody extends js.Object {
  /**
    * [description]
    * @param config [description]
    * @param options [description]
    */
  def setBody(config: js.Object, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param radius [description]
    * @param options [description]
    */
  def setCircle(radius: scala.Double, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param body [description]
    * @param addToWorld [description] Default true.
    */
  def setExistingBody(body: phaserLib.MatterJSNs.Body): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setExistingBody(body: phaserLib.MatterJSNs.Body, addToWorld: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Set the body on the Game Object to a polygon shape.
    * @param radius The radius of the polygon.
    * @param sides The amount of sides creating the polygon.
    * @param options A matterjs config object.
    */
  def setPolygon(radius: scala.Double, sides: scala.Double, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Set the body on a Game Object to a rectangle.
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param options [description]
    */
  def setRectangle(width: scala.Double, height: scala.Double, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Creates a new matterjs trapezoid body.
    * @param width The width of the trapezoid.
    * @param height The height of the trapezoid.
    * @param slope The angle of slope for the trapezoid.
    * @param options A matterjs config object for the body.
    */
  def setTrapezoid(width: scala.Double, height: scala.Double, slope: scala.Double, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}


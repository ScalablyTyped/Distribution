package typings.phaser.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import typings.phaser.MatterJSNs.Body
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
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
  def setBody(config: js.Object, options: js.Object): GameObject = js.native
  /**
    * [description]
    * @param radius [description]
    * @param options [description]
    */
  def setCircle(radius: Double, options: js.Object): GameObject = js.native
  /**
    * [description]
    * @param body [description]
    * @param addToWorld [description] Default true.
    */
  def setExistingBody(body: Body): GameObject = js.native
  def setExistingBody(body: Body, addToWorld: Boolean): GameObject = js.native
  /**
    * Set the body on the Game Object to a polygon shape.
    * @param radius The radius of the polygon.
    * @param sides The amount of sides creating the polygon.
    * @param options A matterjs config object.
    */
  def setPolygon(radius: Double, sides: Double, options: js.Object): GameObject = js.native
  /**
    * Set the body on a Game Object to a rectangle.
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param options [description]
    */
  def setRectangle(width: Double, height: Double, options: js.Object): GameObject = js.native
  /**
    * Creates a new matterjs trapezoid body.
    * @param width The width of the trapezoid.
    * @param height The height of the trapezoid.
    * @param slope The angle of slope for the trapezoid.
    * @param options A matterjs config object for the body.
    */
  def setTrapezoid(width: Double, height: Double, slope: Double, options: js.Object): GameObject = js.native
}


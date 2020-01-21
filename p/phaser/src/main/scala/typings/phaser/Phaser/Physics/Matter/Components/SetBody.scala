package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterSetBodyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables a Matter-enabled Game Object to set its Body. Should be used as a mixin and not directly.
  */
@js.native
trait SetBody extends js.Object {
  /**
    * Set this Game Object to create and use a new Body based on the configuration object given.
    * 
    * Calling this method resets previous properties you may have set on the body, including
    * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
    * @param config Either a string, such as `circle`, or a Matter Set Body Configuration object.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def setBody(config: String): GameObject = js.native
  def setBody(config: String, options: MatterBodyConfig): GameObject = js.native
  def setBody(config: MatterSetBodyConfig): GameObject = js.native
  def setBody(config: MatterSetBodyConfig, options: MatterBodyConfig): GameObject = js.native
  /**
    * Set the body on a Game Object to a circle.
    * 
    * Calling this methods resets previous properties you may have set on the body, including
    * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
    * @param radius The radius of the circle.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def setCircle(radius: Double): GameObject = js.native
  def setCircle(radius: Double, options: MatterBodyConfig): GameObject = js.native
  /**
    * Set this Game Object to use the given existing Matter Body.
    * 
    * The body is first removed from the world before being added to this Game Object.
    * @param body The Body this Game Object should use.
    * @param addToWorld Should the body be immediately added to the World? Default true.
    */
  def setExistingBody(body: BodyType): GameObject = js.native
  def setExistingBody(body: BodyType, addToWorld: Boolean): GameObject = js.native
  /**
    * Set the body on the Game Object to a polygon shape.
    * 
    * Calling this methods resets previous properties you may have set on the body, including
    * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
    * @param sides The number of sides the polygon will have.
    * @param radius The "radius" of the polygon, i.e. the distance from its center to any vertex. This is also the radius of its circumcircle.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def setPolygon(sides: Double, radius: Double): GameObject = js.native
  def setPolygon(sides: Double, radius: Double, options: MatterBodyConfig): GameObject = js.native
  /**
    * Set the body on a Game Object to a rectangle.
    * 
    * Calling this methods resets previous properties you may have set on the body, including
    * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def setRectangle(width: Double, height: Double): GameObject = js.native
  def setRectangle(width: Double, height: Double, options: MatterBodyConfig): GameObject = js.native
  /**
    * Set the body on the Game Object to a trapezoid shape.
    * 
    * Calling this methods resets previous properties you may have set on the body, including
    * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
    * @param width The width of the trapezoid Body.
    * @param height The height of the trapezoid Body.
    * @param slope The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def setTrapezoid(width: Double, height: Double, slope: Double): GameObject = js.native
  def setTrapezoid(width: Double, height: Double, slope: Double, options: MatterBodyConfig): GameObject = js.native
}


package typings.phaser.Phaser.Physics.Matter

import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Physics.Matter.MatterBody
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Body Bounds class contains methods to help you extract the world coordinates from various points around
  * the bounds of a Matter Body. Because Matter bodies are positioned based on their center of mass, and not a
  * dimension based center, you often need to get the bounds coordinates in order to properly align them in the world.
  * 
  * You can access this class via the MatterPhysics class from a Scene, i.e.:
  * 
  * ```javascript
  * this.matter.bodyBounds.getTopLeft(body);
  * ```
  * 
  * See also the `MatterPhysics.alignBody` method.
  */
@js.native
trait BodyBounds extends StObject {
  
  /**
    * A Vector2 that stores the temporary bounds center value during calculations by methods in this class.
    */
  var boundsCenter: Vector2 = js.native
  
  /**
    * A Vector2 that stores the temporary center diff values during calculations by methods in this class.
    */
  var centerDiff: Vector2 = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the bottom-center of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getBottomCenter(body: MatterBody): Vector2 | `false` = js.native
  def getBottomCenter(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getBottomCenter(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getBottomCenter(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the bottom-left of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getBottomLeft(body: MatterBody): Vector2 | `false` = js.native
  def getBottomLeft(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getBottomLeft(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getBottomLeft(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the bottom-right of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getBottomRight(body: MatterBody): Vector2 | `false` = js.native
  def getBottomRight(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getBottomRight(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getBottomRight(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the center of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getCenter(body: MatterBody): Vector2 | `false` = js.native
  def getCenter(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getCenter(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getCenter(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the left-center of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getLeftCenter(body: MatterBody): Vector2 | `false` = js.native
  def getLeftCenter(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getLeftCenter(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getLeftCenter(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the right-center of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getRightCenter(body: MatterBody): Vector2 | `false` = js.native
  def getRightCenter(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getRightCenter(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getRightCenter(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the top-center of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getTopCenter(body: MatterBody): Vector2 | `false` = js.native
  def getTopCenter(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getTopCenter(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getTopCenter(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the top-left of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getTopLeft(body: MatterBody): Vector2 | `false` = js.native
  def getTopLeft(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getTopLeft(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getTopLeft(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Takes a Body and returns the world coordinates of the top-right of its _bounds_.
    * 
    * Body bounds are updated by Matter each step and factor in scale and rotation.
    * This will return the world coordinate based on the bodies _current_ position and bounds.
    * @param body The Body to get the position from.
    * @param x Optional horizontal offset to add to the returned coordinates. Default 0.
    * @param y Optional vertical offset to add to the returned coordinates. Default 0.
    */
  def getTopRight(body: MatterBody): Vector2 | `false` = js.native
  def getTopRight(body: MatterBody, x: js.UndefOr[scala.Nothing], y: Double): Vector2 | `false` = js.native
  def getTopRight(body: MatterBody, x: Double): Vector2 | `false` = js.native
  def getTopRight(body: MatterBody, x: Double, y: Double): Vector2 | `false` = js.native
  
  /**
    * Parses the given body to get the bounds diff values from it.
    * 
    * They're stored in this class in the temporary properties `boundsCenter` and `centerDiff`.
    * 
    * This method is called automatically by all other methods in this class.
    * @param body The Body to get the bounds position from.
    */
  def parseBody(body: MatterBody): Boolean = js.native
}

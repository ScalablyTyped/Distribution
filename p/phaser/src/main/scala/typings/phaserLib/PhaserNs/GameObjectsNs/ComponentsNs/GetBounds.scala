package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for obtaining the bounds of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait GetBounds extends js.Object {
  /**
    * Gets the bottom-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getBottomCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getBottomCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the bottom-left corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getBottomLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getBottomLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the bottom-right corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getBottomRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getBottomRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the bounds of this Game Object, regardless of origin.
    * The values are stored and returned in a Rectangle, or Rectangle-like, object.
    * @param output An object to store the values in. If not provided a new Rectangle will be created.
    */
  def getBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](): O = js.native
  def getBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](output: O): O = js.native
  /**
    * Gets the center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    */
  def getCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  /**
    * Gets the left-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getLeftCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getLeftCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getLeftCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the right-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getRightCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getRightCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getRightCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the top-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getTopCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getTopCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the top-left corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getTopLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getTopLeft[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
  /**
    * Gets the top-right corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getTopRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O): O = js.native
  def getTopRight[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](output: O, includeParent: scala.Boolean): O = js.native
}


package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information for a single attribute structure required to render geometry.
  *
  * This does not contain the actual data, but instead has a buffer id that maps to a {@link PIXI.Buffer}
  * This can include anything from positions, uvs, normals, colors etc.
  *
  * @class
  * @memberof PIXI
  */
trait Attribute extends js.Object {
  /**
    * Destroys the Attribute.
    */
  def destroy(): Unit
}

object Attribute {
  @scala.inline
  def apply(destroy: () => Unit): Attribute = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Attribute]
  }
}


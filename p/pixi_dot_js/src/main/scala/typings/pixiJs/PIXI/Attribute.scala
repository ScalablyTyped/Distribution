package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the information for a single attribute structure required to render geometry.
  *
  * This does not contain the actual data, but instead has a buffer id that maps to a {@link PIXI.Buffer}
  * This can include anything from positions, uvs, normals, colors etc.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Attribute extends js.Object {
  
  /**
    * Destroys the Attribute.
    */
  def destroy(): Unit = js.native
}
object Attribute {
  
  @scala.inline
  def apply(destroy: () => Unit): Attribute = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
}

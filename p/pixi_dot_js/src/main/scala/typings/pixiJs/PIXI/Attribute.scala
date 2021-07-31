package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Attribute extends StObject {
  
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
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}

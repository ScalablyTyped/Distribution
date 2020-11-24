package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends Item {
  
  /** 
    * The radius of the shape, as a number if it is a circle, or a size object
    * for ellipses and rounded rectangles.
    */
  var radius: Double | Size = js.native
  
  /** 
    * The size of the shape.
    */
  var size: Size = js.native
  
  /** 
    * Creates a new path item with same geometry as this shape item, and
    * inherits all settings from it, similar to {@link Item#clone}.
    * 
    * @see Path#toShape(insert)
    * 
    * @param insert - specifies whether the new path should be
    *     inserted into the scene graph. When set to `true`, it is inserted
    *     above the shape item
    * 
    * @return the newly created path item with the same geometry as
    *     this shape item
    */
  def toPath(): Path = js.native
  def toPath(insert: Boolean): Path = js.native
  
  /** 
    * The type of shape of the item as a string.
    */
  var `type`: String = js.native
}
@JSGlobal("paper.Shape")
@js.native
object Shape extends js.Object {
  
  type Circle = Shape
  
  type Ellipse = Shape
  
  type Rectangle = Shape
}

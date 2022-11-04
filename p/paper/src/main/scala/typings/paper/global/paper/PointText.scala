package typings.paper.global.paper

import typings.paper.paper.PointLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A PointText item represents a piece of typography in your Paper.js
  * project which starts from a certain point and extends by the amount of
  * characters contained in it.
  */
@JSGlobal("paper.PointText")
@js.native
open class PointText protected ()
  extends StObject
     with typings.paper.paper.PointText {
  /** 
    * Creates a point text item
    * 
    * @param point - the position where the text will start
    */
  /** 
    * Creates a point text item from the properties described by an object
    * literal.
    * 
    * @param object - an object containing properties describing the
    *     path's attributes
    */
  def this(point: js.Object | PointLike) = this()
}

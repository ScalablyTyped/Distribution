package typings.ol.regularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegularShape
  extends typings.ol.styleImageMod.default {
  
  /* protected */ def createRenderOptions(): RenderOptions = js.native
  
  /**
    * Get the angle used in generating the shape.
    */
  def getAngle(): Double = js.native
  
  /**
    * Get the fill style for the shape.
    */
  def getFill(): typings.ol.fillMod.default = js.native
  
  /**
    * Get the number of points for generating the shape.
    */
  def getPoints(): Double = js.native
  
  /**
    * Get the (primary) radius for the shape.
    */
  def getRadius(): Double = js.native
  
  /**
    * Get the secondary radius for the shape.
    */
  def getRadius2(): js.UndefOr[Double] = js.native
  
  /**
    * Get the stroke style for the shape.
    */
  def getStroke(): typings.ol.strokeMod.default = js.native
  
  var radius_ : Double = js.native
  
  /* protected */ def render(): Unit = js.native
}

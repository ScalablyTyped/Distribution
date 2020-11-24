package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for classes that represent a hit area.
  *
  * It is implemented by the following classes:
  * - {@link PIXI.Circle}
  * - {@link PIXI.Ellipse}
  * - {@link PIXI.Polygon}
  * - {@link PIXI.RoundedRectangle}
  *
  * @interface IHitArea
  * @memberof PIXI
  */
@js.native
trait IHitArea extends js.Object {
  
  /**
    * Checks whether the x and y coordinates given are contained within this area
    *
    * @method
    * @name contains
    * @memberof PIXI.IHitArea#
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this area
    */
  def contains(x: Double, y: Double): Boolean = js.native
}
object IHitArea {
  
  @scala.inline
  def apply(contains: (Double, Double) => Boolean): IHitArea = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains))
    __obj.asInstanceOf[IHitArea]
  }
  
  @scala.inline
  implicit class IHitAreaOps[Self <: IHitArea] (val x: Self) extends AnyVal {
    
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
    def setContains(value: (Double, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
  }
}

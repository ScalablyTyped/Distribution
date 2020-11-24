package typings.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundedRectRadius extends js.Object {
  
  /**
    * Bottom left
    */
  var bl: js.UndefOr[Double] = js.native
  
  /**
    * Bottom right
    */
  var br: js.UndefOr[Double] = js.native
  
  /**
    * Top left
    */
  var tl: js.UndefOr[Double] = js.native
  
  /**
    * Top right
    */
  var tr: js.UndefOr[Double] = js.native
}
object RoundedRectRadius {
  
  @scala.inline
  def apply(): RoundedRectRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedRectRadius]
  }
  
  @scala.inline
  implicit class RoundedRectRadiusOps[Self <: RoundedRectRadius] (val x: Self) extends AnyVal {
    
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
    def setBl(value: Double): Self = this.set("bl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBl: Self = this.set("bl", js.undefined)
    
    @scala.inline
    def setBr(value: Double): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    
    @scala.inline
    def setTl(value: Double): Self = this.set("tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTl: Self = this.set("tl", js.undefined)
    
    @scala.inline
    def setTr(value: Double): Self = this.set("tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
  }
}

package typings.phaser.Phaser.Types.GameObjects.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Shadow configuration object as used by the Text Style.
  */
@js.native
trait TextShadow extends js.Object {
  
  /**
    * The amount of blur applied to the shadow. Leave as zero for a hard shadow.
    */
  var blur: js.UndefOr[Double] = js.native
  
  /**
    * The color of the shadow, given as a CSS string value.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Apply the shadow to the fill effect on the Text object?
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * The horizontal offset of the shadow.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The vertical offset of the shadow.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * Apply the shadow to the stroke effect on the Text object?
    */
  var stroke: js.UndefOr[Boolean] = js.native
}
object TextShadow {
  
  @scala.inline
  def apply(): TextShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadow]
  }
  
  @scala.inline
  implicit class TextShadowOps[Self <: TextShadow] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setStroke(value: Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}

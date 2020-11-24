package typings.phaser.Phaser.Types.GameObjects.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Padding configuration object as used by the Text Style.
  */
@js.native
trait TextPadding extends js.Object {
  
  /**
    * The amount of padding added to the bottom of the Text object.
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * The amount of padding added to the left of the Text object.
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * The amount of padding added to the right of the Text object.
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * The amount of padding added to the top of the Text object.
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * If set this value is used for both the left and right padding.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * If set this value is used for both the top and bottom padding.
    */
  var y: js.UndefOr[Double] = js.native
}
object TextPadding {
  
  @scala.inline
  def apply(): TextPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPadding]
  }
  
  @scala.inline
  implicit class TextPaddingOps[Self <: TextPadding] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}

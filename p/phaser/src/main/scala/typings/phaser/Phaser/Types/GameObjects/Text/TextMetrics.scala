package typings.phaser.Phaser.Types.GameObjects.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Font metrics for a Text Style object.
  */
@js.native
trait TextMetrics extends js.Object {
  
  /**
    * The ascent of the font.
    */
  var ascent: Double = js.native
  
  /**
    * The descent of the font.
    */
  var descent: Double = js.native
  
  /**
    * The size of the font.
    */
  var fontSize: Double = js.native
}
object TextMetrics {
  
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): TextMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  @scala.inline
  implicit class TextMetricsOps[Self <: TextMetrics] (val x: Self) extends AnyVal {
    
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
    def setAscent(value: Double): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescent(value: Double): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
  }
}

package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetroFontConfig extends js.Object {
  
  /**
    * The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
    */
  var chars: String = js.native
  
  /**
    * The number of characters per row in the font set. If not given charsPerRow will be the image width / characterWidth.
    */
  var charsPerRow: Double = js.native
  
  /**
    * The height of each character in the font set.
    */
  var height: Double = js.native
  
  /**
    * The key of the image containing the font.
    */
  var image: String = js.native
  
  /**
    * The amount of vertical space to add to the line height of the font.
    */
  var lineSpacing: Double = js.native
  
  /**
    * If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
    */
  @JSName("offset.x")
  var offsetDotx: Double = js.native
  
  /**
    * If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.
    */
  @JSName("offset.y")
  var offsetDoty: Double = js.native
  
  /**
    * If the characters in the font set have horizontal spacing between them set the required amount here.
    */
  @JSName("spacing.x")
  var spacingDotx: Double = js.native
  
  /**
    * If the characters in the font set have vertical spacing between them set the required amount here.
    */
  @JSName("spacing.y")
  var spacingDoty: Double = js.native
  
  /**
    * The width of each character in the font set.
    */
  var width: Double = js.native
}
object RetroFontConfig {
  
  @scala.inline
  def apply(
    chars: String,
    charsPerRow: Double,
    height: Double,
    image: String,
    lineSpacing: Double,
    offsetDotx: Double,
    offsetDoty: Double,
    spacingDotx: Double,
    spacingDoty: Double,
    width: Double
  ): RetroFontConfig = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], charsPerRow = charsPerRow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("offset.x")(offsetDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("offset.y")(offsetDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("spacing.x")(spacingDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("spacing.y")(spacingDoty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetroFontConfig]
  }
  
  @scala.inline
  implicit class RetroFontConfigOps[Self <: RetroFontConfig] (val x: Self) extends AnyVal {
    
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
    def setChars(value: String): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsPerRow(value: Double): Self = this.set("charsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDotx(value: Double): Self = this.set("offset.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDoty(value: Double): Self = this.set("offset.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingDotx(value: Double): Self = this.set("spacing.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingDoty(value: Double): Self = this.set("spacing.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}

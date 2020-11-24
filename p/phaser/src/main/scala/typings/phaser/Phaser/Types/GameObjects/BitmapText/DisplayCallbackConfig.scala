package typings.phaser.Phaser.Types.GameObjects.BitmapText

import typings.phaser.Phaser.GameObjects.DynamicBitmapText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayCallbackConfig extends js.Object {
  
  /**
    * The character code of the character being rendered.
    */
  var charCode: Double = js.native
  
  /**
    * Custom data stored with the character being rendered.
    */
  var data: js.Any = js.native
  
  /**
    * The index of the character being rendered.
    */
  var index: Double = js.native
  
  /**
    * The Dynamic Bitmap Text object that owns this character being rendered.
    */
  var parent: DynamicBitmapText = js.native
  
  /**
    * The rotation of the character being rendered.
    */
  var rotation: Double = js.native
  
  /**
    * The scale of the character being rendered.
    */
  var scale: Double = js.native
  
  /**
    * The tint of the character being rendered. Always zero in Canvas.
    */
  var tint: TintConfig = js.native
  
  /**
    * The x position of the character being rendered.
    */
  var x: Double = js.native
  
  /**
    * The y position of the character being rendered.
    */
  var y: Double = js.native
}
object DisplayCallbackConfig {
  
  @scala.inline
  def apply(
    charCode: Double,
    data: js.Any,
    index: Double,
    parent: DynamicBitmapText,
    rotation: Double,
    scale: Double,
    tint: TintConfig,
    x: Double,
    y: Double
  ): DisplayCallbackConfig = {
    val __obj = js.Dynamic.literal(charCode = charCode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayCallbackConfig]
  }
  
  @scala.inline
  implicit class DisplayCallbackConfigOps[Self <: DisplayCallbackConfig] (val x: Self) extends AnyVal {
    
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
    def setCharCode(value: Double): Self = this.set("charCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: DynamicBitmapText): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTint(value: TintConfig): Self = this.set("tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}

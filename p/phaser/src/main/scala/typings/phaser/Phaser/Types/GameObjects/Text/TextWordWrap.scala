package typings.phaser.Phaser.Types.GameObjects.Text

import typings.phaser.TextStyleWordWrapCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Word Wrap configuration object as used by the Text Style configuration.
  */
@js.native
trait TextWordWrap extends js.Object {
  
  /**
    * Provide a custom callback when word wrapping is enabled.
    */
  var callback: js.UndefOr[TextStyleWordWrapCallback] = js.native
  
  /**
    * The context in which the word wrap callback is invoked.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  
  /**
    * Use basic or advanced word wrapping?
    */
  var useAdvancedWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * The width at which text should be considered for word-wrapping.
    */
  var width: js.UndefOr[Double] = js.native
}
object TextWordWrap {
  
  @scala.inline
  def apply(): TextWordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWordWrap]
  }
  
  @scala.inline
  implicit class TextWordWrapOps[Self <: TextWordWrap] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (/* text */ String, /* textObject */ typings.phaser.Phaser.GameObjects.Text) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCallbackScope(value: js.Any): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    
    @scala.inline
    def setUseAdvancedWrap(value: Boolean): Self = this.set("useAdvancedWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAdvancedWrap: Self = this.set("useAdvancedWrap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

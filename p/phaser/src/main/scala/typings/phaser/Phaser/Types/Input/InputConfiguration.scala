package typings.phaser.Phaser.Types.Input

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputConfiguration extends js.Object {
  
  /**
    * If `pixelPerfect` is set, this is the alpha tolerance threshold value used in the callback.
    */
  var alphaTolerance: js.UndefOr[integer] = js.native
  
  /**
    * The CSS string to be used when the cursor is over this Interactive Object.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * If `true` the Interactive Object will be set to be draggable and emit drag events.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` the Interactive Object will be set to be a drop zone for draggable objects.
    */
  var dropZone: js.UndefOr[Boolean] = js.native
  
  /**
    * The object / shape to use as the Hit Area. If not given it will try to create a Rectangle based on the texture frame.
    */
  var hitArea: js.UndefOr[js.Any] = js.native
  
  /**
    * The callback that determines if the pointer is within the Hit Area shape or not.
    */
  var hitAreaCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * If `true` the a pixel perfect function will be set for the hit area callback. Only works with texture based Game Objects.
    */
  var pixelPerfect: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` the Interactive Object will set the `pointer` hand cursor when a pointer is over it. This is a short-cut for setting `cursor: 'pointer'`.
    */
  var useHandCursor: js.UndefOr[Boolean] = js.native
}
object InputConfiguration {
  
  @scala.inline
  def apply(): InputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfiguration]
  }
  
  @scala.inline
  implicit class InputConfigurationOps[Self <: InputConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAlphaTolerance(value: integer): Self = this.set("alphaTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaTolerance: Self = this.set("alphaTolerance", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDropZone(value: Boolean): Self = this.set("dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZone: Self = this.set("dropZone", js.undefined)
    
    @scala.inline
    def setHitArea(value: js.Any): Self = this.set("hitArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitArea: Self = this.set("hitArea", js.undefined)
    
    @scala.inline
    def setHitAreaCallback(value: js.Function): Self = this.set("hitAreaCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitAreaCallback: Self = this.set("hitAreaCallback", js.undefined)
    
    @scala.inline
    def setPixelPerfect(value: Boolean): Self = this.set("pixelPerfect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelPerfect: Self = this.set("pixelPerfect", js.undefined)
    
    @scala.inline
    def setUseHandCursor(value: Boolean): Self = this.set("useHandCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHandCursor: Self = this.set("useHandCursor", js.undefined)
  }
}

package typings.phaser.Phaser.Types.Create

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateTextureConfig extends js.Object {
  
  /**
    * The HTML Canvas to draw the texture to.
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * Should the canvas be cleared before the texture is drawn?
    */
  var clearCanvas: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of data, where each row is a string of single values 0-9A-F, or the period character.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The indexed palette that the data cell values map to.
    */
  var palette: js.UndefOr[Palette] = js.native
  
  /**
    * The height of each 'pixel' in the generated texture.
    */
  var pixelHeight: js.UndefOr[Double] = js.native
  
  /**
    * The width of each 'pixel' in the generated texture.
    */
  var pixelWidth: js.UndefOr[Double] = js.native
  
  /**
    * A callback to send the canvas to after the texture has been drawn.
    */
  var postRender: js.UndefOr[GenerateTextureCallback] = js.native
  
  /**
    * A callback to send the canvas to prior to the texture being drawn.
    */
  var preRender: js.UndefOr[GenerateTextureCallback] = js.native
  
  /**
    * Should the canvas be resized before the texture is drawn?
    */
  var resizeCanvas: js.UndefOr[Boolean] = js.native
}
object GenerateTextureConfig {
  
  @scala.inline
  def apply(): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTextureConfig]
  }
  
  @scala.inline
  implicit class GenerateTextureConfigOps[Self <: GenerateTextureConfig] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setClearCanvas(value: Boolean): Self = this.set("clearCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearCanvas: Self = this.set("clearCanvas", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setPalette(value: Palette): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPixelHeight(value: Double): Self = this.set("pixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelHeight: Self = this.set("pixelHeight", js.undefined)
    
    @scala.inline
    def setPixelWidth(value: Double): Self = this.set("pixelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelWidth: Self = this.set("pixelWidth", js.undefined)
    
    @scala.inline
    def setPostRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = this.set("postRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostRender: Self = this.set("postRender", js.undefined)
    
    @scala.inline
    def setPreRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = this.set("preRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
    
    @scala.inline
    def setResizeCanvas(value: Boolean): Self = this.set("resizeCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeCanvas: Self = this.set("resizeCanvas", js.undefined)
  }
}

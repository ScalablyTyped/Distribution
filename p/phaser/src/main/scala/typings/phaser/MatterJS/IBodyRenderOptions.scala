package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBodyRenderOptions extends js.Object {
  
  /**
    * A hex color value that defines the fill color to use when rendering the body.
    *
    * @property fillColor
    * @type number
    */
  var fillColor: js.UndefOr[Double] = js.native
  
  /**
    * A value that defines the fill opacity to use when rendering the body.
    *
    * @property fillOpacity
    * @type number
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.native
  
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent.
    *
    * @property opacity
    * @type number
    * @default 1
  		 */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.native
  
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IBodyRenderOptions {
  
  @scala.inline
  def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  
  @scala.inline
  implicit class IBodyRenderOptionsOps[Self <: IBodyRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setFillColor(value: Double): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setLineColor(value: Double): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineOpacity(value: Double): Self = this.set("lineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineOpacity: Self = this.set("lineOpacity", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSprite(value: IBodyRenderOptionsSprite): Self = this.set("sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

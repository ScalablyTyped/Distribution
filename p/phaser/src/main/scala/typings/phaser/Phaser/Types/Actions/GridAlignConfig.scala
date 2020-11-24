package typings.phaser.Phaser.Types.Actions

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAlignConfig extends js.Object {
  
  /**
    * The height of the cell, in pixels, in which the item is positioned.
    */
  var cellHeight: js.UndefOr[integer] = js.native
  
  /**
    * The width of the cell, in pixels, in which the item is positioned.
    */
  var cellWidth: js.UndefOr[integer] = js.native
  
  /**
    * The height of the grid in items (not pixels). -1 means lay all items out vertically, regardless of quantity.
    *                                   If both this value and `width` are set to -1 then `width` overrides it and this value is ignored.
    */
  var height: js.UndefOr[integer] = js.native
  
  /**
    * The alignment position. One of the Phaser.Display.Align consts such as `TOP_LEFT` or `RIGHT_CENTER`.
    */
  var position: js.UndefOr[integer] = js.native
  
  /**
    * The width of the grid in items (not pixels). -1 means lay all items out horizontally, regardless of quantity.
    *                                  If both this value and height are set to -1 then this value overrides it and the `height` value is ignored.
    */
  var width: js.UndefOr[integer] = js.native
  
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}
object GridAlignConfig {
  
  @scala.inline
  def apply(): GridAlignConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAlignConfig]
  }
  
  @scala.inline
  implicit class GridAlignConfigOps[Self <: GridAlignConfig] (val x: Self) extends AnyVal {
    
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
    def setCellHeight(value: integer): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCellWidth(value: integer): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPosition(value: integer): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
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

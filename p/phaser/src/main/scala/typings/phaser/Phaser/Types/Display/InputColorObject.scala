package typings.phaser.Phaser.Types.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputColorObject extends js.Object {
  
  /**
    * The alpha color value in the range 0 to 255.
    */
  var a: js.UndefOr[Double] = js.native
  
  /**
    * The blue color value in the range 0 to 255.
    */
  var b: js.UndefOr[Double] = js.native
  
  /**
    * The green color value in the range 0 to 255.
    */
  var g: js.UndefOr[Double] = js.native
  
  /**
    * The red color value in the range 0 to 255.
    */
  var r: js.UndefOr[Double] = js.native
}
object InputColorObject {
  
  @scala.inline
  def apply(): InputColorObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputColorObject]
  }
  
  @scala.inline
  implicit class InputColorObjectOps[Self <: InputColorObject] (val x: Self) extends AnyVal {
    
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG: Self = this.set("g", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
  }
}

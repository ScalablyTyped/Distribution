package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourRedToBlackSet extends /* index */ NumberDictionary[Icon] {
  
  var blackCircle: Icon = js.native
  
  var grayCircle: Icon = js.native
  
  var pinkCircle: Icon = js.native
  
  var redCircle: Icon = js.native
}
object FourRedToBlackSet {
  
  @scala.inline
  def apply(blackCircle: Icon, grayCircle: Icon, pinkCircle: Icon, redCircle: Icon): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], grayCircle = grayCircle.asInstanceOf[js.Any], pinkCircle = pinkCircle.asInstanceOf[js.Any], redCircle = redCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourRedToBlackSet]
  }
  
  @scala.inline
  implicit class FourRedToBlackSetOps[Self <: FourRedToBlackSet] (val x: Self) extends AnyVal {
    
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
    def setBlackCircle(value: Icon): Self = this.set("blackCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayCircle(value: Icon): Self = this.set("grayCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinkCircle(value: Icon): Self = this.set("pinkCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedCircle(value: Icon): Self = this.set("redCircle", value.asInstanceOf[js.Any])
  }
}

package typings.polished.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContrastScores extends js.Object {
  
  var AA: Boolean = js.native
  
  var AAA: Boolean = js.native
  
  var AAALarge: Boolean = js.native
  
  var AALarge: Boolean = js.native
}
object ContrastScores {
  
  @scala.inline
  def apply(AA: Boolean, AAA: Boolean, AAALarge: Boolean, AALarge: Boolean): ContrastScores = {
    val __obj = js.Dynamic.literal(AA = AA.asInstanceOf[js.Any], AAA = AAA.asInstanceOf[js.Any], AAALarge = AAALarge.asInstanceOf[js.Any], AALarge = AALarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContrastScores]
  }
  
  @scala.inline
  implicit class ContrastScoresOps[Self <: ContrastScores] (val x: Self) extends AnyVal {
    
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
    def setAA(value: Boolean): Self = this.set("AA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAAA(value: Boolean): Self = this.set("AAA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAAALarge(value: Boolean): Self = this.set("AAALarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAALarge(value: Boolean): Self = this.set("AALarge", value.asInstanceOf[js.Any])
  }
}

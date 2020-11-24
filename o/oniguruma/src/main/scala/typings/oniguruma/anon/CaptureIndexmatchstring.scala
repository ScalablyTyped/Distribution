package typings.oniguruma.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined oniguruma.oniguruma.CaptureIndex & {  match :string} */
@js.native
trait CaptureIndexmatchstring extends js.Object {
  
  /** The position in the search string where the capture ends */
  var end: Double = js.native
  
  /** The index of the capturing group, or 0 for a full-string match */
  var index: Double = js.native
  
  /** The total character length of the capture */
  var length: Double = js.native
  
  var `match`: String = js.native
  
  /** The position in the search string where the capture begins */
  var start: Double = js.native
}
object CaptureIndexmatchstring {
  
  @scala.inline
  def apply(end: Double, index: Double, length: Double, `match`: String, start: Double): CaptureIndexmatchstring = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureIndexmatchstring]
  }
  
  @scala.inline
  implicit class CaptureIndexmatchstringOps[Self <: CaptureIndexmatchstring] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}

package typings.poly2tri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SweepContextOptions extends js.Object {
  
  /**
    * cloneArrays - if `true`, do a shallow copy of the Array parameters (contour, holes).
    * Points inside arrays are never copied.
    * Default is `false` : keep a reference to the array arguments, who will be modified in place.
    */
  var cloneArrays: js.UndefOr[Boolean] = js.native
}
object SweepContextOptions {
  
  @scala.inline
  def apply(): SweepContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SweepContextOptions]
  }
  
  @scala.inline
  implicit class SweepContextOptionsOps[Self <: SweepContextOptions] (val x: Self) extends AnyVal {
    
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
    def setCloneArrays(value: Boolean): Self = this.set("cloneArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneArrays: Self = this.set("cloneArrays", js.undefined)
  }
}

package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinderOptions extends Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object FinderOptions {
  
  @scala.inline
  def apply(): FinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinderOptions]
  }
  
  @scala.inline
  implicit class FinderOptionsOps[Self <: FinderOptions] (val x: Self) extends AnyVal {
    
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
    def setDiagonalMovement(value: DiagonalMovement): Self = this.set("diagonalMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonalMovement: Self = this.set("diagonalMovement", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}

package typings.nodeUci.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends js.Object {
  
  var binc: js.UndefOr[Double] = js.native
  
  var btime: js.UndefOr[Double] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var mate: js.UndefOr[Double] = js.native
  
  var movestogo: js.UndefOr[Double] = js.native
  
  var movetime: js.UndefOr[Double] = js.native
  
  var nodes: js.UndefOr[Double] = js.native
  
  var ponder: js.UndefOr[Boolean] = js.native
  
  var searchmoves: js.UndefOr[js.Array[String]] = js.native
  
  var winc: js.UndefOr[Double] = js.native
  
  var wtime: js.UndefOr[Double] = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
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
    def setBinc(value: Double): Self = this.set("binc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinc: Self = this.set("binc", js.undefined)
    
    @scala.inline
    def setBtime(value: Double): Self = this.set("btime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtime: Self = this.set("btime", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setMate(value: Double): Self = this.set("mate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMate: Self = this.set("mate", js.undefined)
    
    @scala.inline
    def setMovestogo(value: Double): Self = this.set("movestogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovestogo: Self = this.set("movestogo", js.undefined)
    
    @scala.inline
    def setMovetime(value: Double): Self = this.set("movetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovetime: Self = this.set("movetime", js.undefined)
    
    @scala.inline
    def setNodes(value: Double): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setPonder(value: Boolean): Self = this.set("ponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePonder: Self = this.set("ponder", js.undefined)
    
    @scala.inline
    def setSearchmovesVarargs(value: String*): Self = this.set("searchmoves", js.Array(value :_*))
    
    @scala.inline
    def setSearchmoves(value: js.Array[String]): Self = this.set("searchmoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchmoves: Self = this.set("searchmoves", js.undefined)
    
    @scala.inline
    def setWinc(value: Double): Self = this.set("winc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWinc: Self = this.set("winc", js.undefined)
    
    @scala.inline
    def setWtime(value: Double): Self = this.set("wtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtime: Self = this.set("wtime", js.undefined)
  }
}

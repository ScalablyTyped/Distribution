package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}> */
@js.native
trait PartialuseDisplayedColumn extends js.Object {
  
  var useDisplayedColumnsOnly: js.UndefOr[Boolean] = js.native
  
  var useDisplayedRowsOnly: js.UndefOr[Boolean] = js.native
}
object PartialuseDisplayedColumn {
  
  @scala.inline
  def apply(): PartialuseDisplayedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseDisplayedColumn]
  }
  
  @scala.inline
  implicit class PartialuseDisplayedColumnOps[Self <: PartialuseDisplayedColumn] (val x: Self) extends AnyVal {
    
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
    def setUseDisplayedColumnsOnly(value: Boolean): Self = this.set("useDisplayedColumnsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDisplayedColumnsOnly: Self = this.set("useDisplayedColumnsOnly", js.undefined)
    
    @scala.inline
    def setUseDisplayedRowsOnly(value: Boolean): Self = this.set("useDisplayedRowsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDisplayedRowsOnly: Self = this.set("useDisplayedRowsOnly", js.undefined)
  }
}

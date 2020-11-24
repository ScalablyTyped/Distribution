package typings.parse.mod.global.Parse.Query

import typings.parse.mod.global.Parse.FullOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchOptions extends FullOptions {
  
  var batchSize: js.UndefOr[Double] = js.native
}
object BatchOptions {
  
  @scala.inline
  def apply(): BatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchOptions]
  }
  
  @scala.inline
  implicit class BatchOptionsOps[Self <: BatchOptions] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
  }
}

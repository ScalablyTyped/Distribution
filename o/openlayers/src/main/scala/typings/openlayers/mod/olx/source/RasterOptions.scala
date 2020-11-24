package typings.openlayers.mod.olx.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.RasterOperation
import typings.openlayers.mod.RasterOperationType
import typings.openlayers.mod.source.Source
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @api
  */
@js.native
trait RasterOptions extends js.Object {
  
  var lib: js.UndefOr[GlobalObject] = js.native
  
  var operation: js.UndefOr[RasterOperation] = js.native
  
  var operationType: js.UndefOr[RasterOperationType] = js.native
  
  var sources: js.Array[Source] = js.native
  
  var threads: js.UndefOr[Double] = js.native
}
object RasterOptions {
  
  @scala.inline
  def apply(sources: js.Array[Source]): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
  
  @scala.inline
  implicit class RasterOptionsOps[Self <: RasterOptions] (val x: Self) extends AnyVal {
    
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
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLib(value: GlobalObject): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    
    @scala.inline
    def setOperation(
      value: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => js.Array[Double] | ImageData
    ): Self = this.set("operation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setOperationType(value: RasterOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
  }
}

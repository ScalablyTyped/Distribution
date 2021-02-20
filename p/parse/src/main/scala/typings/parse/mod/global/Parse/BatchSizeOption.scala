package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSizeOption extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.native
}
object BatchSizeOption {
  
  @scala.inline
  def apply(): BatchSizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeOption]
  }
  
  @scala.inline
  implicit class BatchSizeOptionMutableBuilder[Self <: BatchSizeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}

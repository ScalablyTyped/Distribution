package typings.openfin.anon

import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var newVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
  
  var oldVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
}
object `10` {
  
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setNewValVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "newVal", js.Array(value :_*))
    
    @scala.inline
    def setOldVal(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    @scala.inline
    def setOldValVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "oldVal", js.Array(value :_*))
  }
}

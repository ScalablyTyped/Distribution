package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArrayMetadata
  extends /* item */ StringDictionary[js.Any] {
  
  var offset: js.UndefOr[Double] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object IArrayMetadata {
  
  @scala.inline
  def apply(): IArrayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayMetadata]
  }
  
  @scala.inline
  implicit class IArrayMetadataMutableBuilder[Self <: IArrayMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}

package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pageable extends StObject {
  
  var page: js.UndefOr[Double] = js.native
  
  var page_size: js.UndefOr[Double] = js.native
}
object Pageable {
  
  @scala.inline
  def apply(): Pageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pageable]
  }
  
  @scala.inline
  implicit class PageableMutableBuilder[Self <: Pageable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
  }
}

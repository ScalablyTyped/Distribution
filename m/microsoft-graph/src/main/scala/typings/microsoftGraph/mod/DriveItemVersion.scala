package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItemVersion extends BaseItemVersion {
  
  // The content stream for this version of the item.
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  // Indicates the size of the content stream for this version of the item.
  var size: js.UndefOr[NullableOption[Double]] = js.native
}
object DriveItemVersion {
  
  @scala.inline
  def apply(): DriveItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemVersion]
  }
  
  @scala.inline
  implicit class DriveItemVersionMutableBuilder[Self <: DriveItemVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[_]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = StObject.set(x, "size", null)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

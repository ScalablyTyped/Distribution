package typings.miniprogram

import typings.miniprogram.anon.ApFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageArgs extends AsyncCallback[ApFilePaths] {
  
  var count: js.UndefOr[Double] = js.native
  
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  
  var sourceType: js.UndefOr[js.Array[String]] = js.native
}
object ChooseImageArgs {
  
  @scala.inline
  def apply(): ChooseImageArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageArgs]
  }
  
  @scala.inline
  implicit class ChooseImageArgsMutableBuilder[Self <: ChooseImageArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
  }
}

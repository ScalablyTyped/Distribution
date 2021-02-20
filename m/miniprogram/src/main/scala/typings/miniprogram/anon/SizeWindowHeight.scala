package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeWindowHeight extends StObject {
  
  var size: WindowHeight = js.native
}
object SizeWindowHeight {
  
  @scala.inline
  def apply(size: WindowHeight): SizeWindowHeight = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeWindowHeight]
  }
  
  @scala.inline
  implicit class SizeWindowHeightMutableBuilder[Self <: SizeWindowHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: WindowHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

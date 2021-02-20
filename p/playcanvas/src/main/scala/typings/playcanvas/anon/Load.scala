package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Load extends StObject {
  
  var load: js.UndefOr[String] = js.native
  
  var original: js.UndefOr[String] = js.native
}
object Load {
  
  @scala.inline
  def apply(): Load = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Load]
  }
  
  @scala.inline
  implicit class LoadMutableBuilder[Self <: Load] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
  }
}

package typings.phantom.anon

import typings.phantom.mod.IPhantomCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents extends StObject {
  
  var contents: IPhantomCallback = js.native
  
  var height: String = js.native
}
object Contents {
  
  @scala.inline
  def apply(contents: IPhantomCallback, height: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: IPhantomCallback): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}

package typings.parcelTypes.anon

import typings.parcelTypes.mod.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: Blob
}
object Contents {
  
  inline def apply(contents: Blob): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    inline def setContents(value: Blob): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
  }
}

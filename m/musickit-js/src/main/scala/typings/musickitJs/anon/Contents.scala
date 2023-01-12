package typings.musickitJs.anon

import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: js.Array[Relationship[Resource]]
}
object Contents {
  
  inline def apply(contents: js.Array[Relationship[Resource]]): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    inline def setContents(value: js.Array[Relationship[Resource]]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: Relationship[Resource]*): Self = StObject.set(x, "contents", js.Array(value*))
  }
}

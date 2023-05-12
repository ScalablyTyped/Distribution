package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefFromString extends StObject {
  
  var ref: FromString
  
  var sha: FromString
}
object RefFromString {
  
  inline def apply(ref: FromString, sha: FromString): RefFromString = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefFromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefFromString] (val x: Self) extends AnyVal {
    
    inline def setRef(value: FromString): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSha(value: FromString): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}

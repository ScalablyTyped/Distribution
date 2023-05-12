package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestName extends StObject {
  
  var digest: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object DigestName {
  
  inline def apply(): DigestName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigestName] (val x: Self) extends AnyVal {
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

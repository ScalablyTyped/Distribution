package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPurposes extends StObject {
  
  var keyPurposes: js.UndefOr[String] = js.undefined
}
object KeyPurposes {
  
  inline def apply(): KeyPurposes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPurposes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPurposes] (val x: Self) extends AnyVal {
    
    inline def setKeyPurposes(value: String): Self = StObject.set(x, "keyPurposes", value.asInstanceOf[js.Any])
    
    inline def setKeyPurposesUndefined: Self = StObject.set(x, "keyPurposes", js.undefined)
  }
}

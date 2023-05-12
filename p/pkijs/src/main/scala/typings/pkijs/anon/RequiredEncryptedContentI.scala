package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<pkijs.pkijs.EncryptedContentInfoSplit> */
trait RequiredEncryptedContentI extends StObject {
  
  var disableSplit: Boolean
}
object RequiredEncryptedContentI {
  
  inline def apply(disableSplit: Boolean): RequiredEncryptedContentI = {
    val __obj = js.Dynamic.literal(disableSplit = disableSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredEncryptedContentI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredEncryptedContentI] (val x: Self) extends AnyVal {
    
    inline def setDisableSplit(value: Boolean): Self = StObject.set(x, "disableSplit", value.asInstanceOf[js.Any])
  }
}

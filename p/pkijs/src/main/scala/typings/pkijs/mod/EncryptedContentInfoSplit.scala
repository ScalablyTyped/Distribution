package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedContentInfoSplit extends StObject {
  
  /**
    * Disables OctetString splitting for encryptedContent.
    */
  var disableSplit: js.UndefOr[Boolean] = js.undefined
}
object EncryptedContentInfoSplit {
  
  inline def apply(): EncryptedContentInfoSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedContentInfoSplit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedContentInfoSplit] (val x: Self) extends AnyVal {
    
    inline def setDisableSplit(value: Boolean): Self = StObject.set(x, "disableSplit", value.asInstanceOf[js.Any])
    
    inline def setDisableSplitUndefined: Self = StObject.set(x, "disableSplit", js.undefined)
  }
}

package typings.mz.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingPersistent extends StObject {
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object EncodingPersistent {
  
  @scala.inline
  def apply(): EncodingPersistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingPersistent]
  }
  
  @scala.inline
  implicit class EncodingPersistentMutableBuilder[Self <: EncodingPersistent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}

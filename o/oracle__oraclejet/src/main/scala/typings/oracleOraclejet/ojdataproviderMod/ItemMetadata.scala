package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemMetadata[K] extends StObject {
  
  var key: K = js.native
}
object ItemMetadata {
  
  @scala.inline
  def apply[K](key: K): ItemMetadata[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMetadata[K]]
  }
  
  @scala.inline
  implicit class ItemMetadataMutableBuilder[Self <: ItemMetadata[_], K] (val x: Self with ItemMetadata[K]) extends AnyVal {
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

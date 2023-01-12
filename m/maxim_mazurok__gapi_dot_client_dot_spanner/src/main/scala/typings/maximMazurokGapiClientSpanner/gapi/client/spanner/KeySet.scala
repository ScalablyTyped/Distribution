package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySet extends StObject {
  
  /**
    * For convenience `all` can be set to `true` to indicate that this `KeySet` matches all keys in the table or index. Note that any keys specified in `keys` or `ranges` are only yielded
    * once.
    */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of specific keys. Entries in `keys` should have exactly as many elements as there are columns in the primary or index key with which this `KeySet` is used. Individual key
    * values are encoded as described here.
    */
  var keys: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /** A list of key ranges. See KeyRange for more information about key range specifications. */
  var ranges: js.UndefOr[js.Array[KeyRange]] = js.undefined
}
object KeySet {
  
  inline def apply(): KeySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySet] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setKeys(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: js.Array[Any]*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setRanges(value: js.Array[KeyRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: KeyRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}

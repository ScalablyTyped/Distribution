package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastaccessedat extends StObject {
  
  /**
    * Format: date-time
    * @example 2019-01-24T22:45:36.000Z
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @example 2 */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @example Linux-node-958aff96db2d75d67787d1e634ae70b659de937b */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2019-01-24T22:45:36.000Z
    */
  var last_accessed_at: js.UndefOr[String] = js.undefined
  
  /** @example refs/heads/main */
  var ref: js.UndefOr[String] = js.undefined
  
  /** @example 1024 */
  var size_in_bytes: js.UndefOr[Double] = js.undefined
  
  /** @example 73885106f58cc52a7df9ec4d4a5622a5614813162cb516c759a30af6bf56e6f0 */
  var version: js.UndefOr[String] = js.undefined
}
object Lastaccessedat {
  
  inline def apply(): Lastaccessedat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lastaccessedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastaccessedat] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLast_accessed_at(value: String): Self = StObject.set(x, "last_accessed_at", value.asInstanceOf[js.Any])
    
    inline def setLast_accessed_atUndefined: Self = StObject.set(x, "last_accessed_at", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSize_in_bytes(value: Double): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytesUndefined: Self = StObject.set(x, "size_in_bytes", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

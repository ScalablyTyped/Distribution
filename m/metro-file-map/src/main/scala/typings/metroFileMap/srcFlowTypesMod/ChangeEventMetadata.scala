package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.metroFileMapStrings.d
import typings.metroFileMap.metroFileMapStrings.f
import typings.metroFileMap.metroFileMapStrings.l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventMetadata extends StObject {
  
  /** Epoch ms */
  var modifiedTime: Double | Null
  
  /** Bytes */
  var size: Double | Null
  
  /** Regular file / Directory / Symlink */
  var `type`: f | d | l
}
object ChangeEventMetadata {
  
  inline def apply(`type`: f | d | l): ChangeEventMetadata = {
    val __obj = js.Dynamic.literal(modifiedTime = null, size = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeEventMetadata] (val x: Self) extends AnyVal {
    
    inline def setModifiedTime(value: Double): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeNull: Self = StObject.set(x, "modifiedTime", null)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setType(value: f | d | l): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordMeta extends StObject {
  
  var `@rid`: ORID
  
  var `@version`: Version
}
object RecordMeta {
  
  inline def apply(`@rid`: ORID, `@version`: Version): RecordMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@rid")(`@rid`.asInstanceOf[js.Any])
    __obj.updateDynamic("@version")(`@version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMeta]
  }
  
  extension [Self <: RecordMeta](x: Self) {
    
    inline def `set@rid`(value: ORID): Self = StObject.set(x, "@rid", value.asInstanceOf[js.Any])
    
    inline def `set@version`(value: Version): Self = StObject.set(x, "@version", value.asInstanceOf[js.Any])
  }
}

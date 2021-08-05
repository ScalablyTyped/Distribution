package typings.phonegap

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var modificationTime: Date
}
object Metadata {
  
  inline def apply(modificationTime: Date): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
  }
}

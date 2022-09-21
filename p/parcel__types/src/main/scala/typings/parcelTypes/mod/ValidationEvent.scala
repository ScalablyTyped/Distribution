package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationEvent
  extends StObject
     with ReporterEvent {
  
  val filePath: FilePath
  
  val `type`: validation
}
object ValidationEvent {
  
  inline def apply(filePath: FilePath): ValidationEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("validation")
    __obj.asInstanceOf[ValidationEvent]
  }
  
  extension [Self <: ValidationEvent](x: Self) {
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setType(value: validation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

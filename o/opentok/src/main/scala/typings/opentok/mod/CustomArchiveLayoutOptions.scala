package typings.opentok.mod

import typings.opentok.opentokStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomArchiveLayoutOptions
  extends StObject
     with ArchiveLayoutOptions {
  
  var stylesheet: String
  
  var `type`: custom
}
object CustomArchiveLayoutOptions {
  
  inline def apply(stylesheet: String): CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomArchiveLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomArchiveLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  /**
    * The filename, which is longer than specified by the value of the property `maximumFilenameLength`.
    */
  var fileName: js.UndefOr[String] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  extension [Self <: FileName](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}

package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XcodeVersion extends StObject {
  
  /** Tags for this Xcode version. Example: "default". */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The id for this version. Example: "9.2". */
  var version: js.UndefOr[String] = js.undefined
}
object XcodeVersion {
  
  inline def apply(): XcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XcodeVersion]
  }
  
  extension [Self <: XcodeVersion](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

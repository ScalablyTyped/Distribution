package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: js.UndefOr[Sourcelocation] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]] = js.undefined
  
  /**
    * @description The name of the manifest.
    * @example package-lock.json
    */
  var name: String
  
  /** @description A collection of resolved package dependencies. */
  var resolved: js.UndefOr[StringDictionary[Metadata]] = js.undefined
}
object File {
  
  inline def apply(name: String): File = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: Sourcelocation): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: StringDictionary[Metadata]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}

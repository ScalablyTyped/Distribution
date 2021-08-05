package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicationFacet extends StObject {
  
  // The state of publication for this document. Either published or checkout. Read-only.
  var level: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the version that is visible to the current caller. Read-only.
  var versionId: js.UndefOr[NullableOption[String]] = js.undefined
}
object PublicationFacet {
  
  inline def apply(): PublicationFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationFacet]
  }
  
  extension [Self <: PublicationFacet](x: Self) {
    
    inline def setLevel(value: NullableOption[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setVersionId(value: NullableOption[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}

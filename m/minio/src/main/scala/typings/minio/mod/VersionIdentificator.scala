package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<minio.minio.RetentionOptions, 'versionId'> */
trait VersionIdentificator extends StObject {
  
  var versionId: String
}
object VersionIdentificator {
  
  inline def apply(versionId: String): VersionIdentificator = {
    val __obj = js.Dynamic.literal(versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionIdentificator]
  }
  
  extension [Self <: VersionIdentificator](x: Self) {
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}

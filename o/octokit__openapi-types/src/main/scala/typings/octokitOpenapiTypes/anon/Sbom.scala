package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sbom extends StObject {
  
  var sbom: CreationInfo
}
object Sbom {
  
  inline def apply(sbom: CreationInfo): Sbom = {
    val __obj = js.Dynamic.literal(sbom = sbom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sbom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sbom] (val x: Self) extends AnyVal {
    
    inline def setSbom(value: CreationInfo): Self = StObject.set(x, "sbom", value.asInstanceOf[js.Any])
  }
}

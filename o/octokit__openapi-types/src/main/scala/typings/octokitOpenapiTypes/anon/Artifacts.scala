package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  var artifacts: js.Array[Archivedownloadurl]
  
  var total_count: Double
}
object Artifacts {
  
  inline def apply(artifacts: js.Array[Archivedownloadurl], total_count: Double): Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  
  extension [Self <: Artifacts](x: Self) {
    
    inline def setArtifacts(value: js.Array[Archivedownloadurl]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(value: Archivedownloadurl*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}

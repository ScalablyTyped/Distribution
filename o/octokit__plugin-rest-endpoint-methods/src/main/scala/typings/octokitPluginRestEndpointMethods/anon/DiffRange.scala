package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffRange extends StObject {
  
  var createRepositorySnapshot: `1140`
  
  var diffRange: `1141`
  
  var exportSbom: `1142`
}
object DiffRange {
  
  inline def apply(createRepositorySnapshot: `1140`, diffRange: `1141`, exportSbom: `1142`): DiffRange = {
    val __obj = js.Dynamic.literal(createRepositorySnapshot = createRepositorySnapshot.asInstanceOf[js.Any], diffRange = diffRange.asInstanceOf[js.Any], exportSbom = exportSbom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffRange] (val x: Self) extends AnyVal {
    
    inline def setCreateRepositorySnapshot(value: `1140`): Self = StObject.set(x, "createRepositorySnapshot", value.asInstanceOf[js.Any])
    
    inline def setDiffRange(value: `1141`): Self = StObject.set(x, "diffRange", value.asInstanceOf[js.Any])
    
    inline def setExportSbom(value: `1142`): Self = StObject.set(x, "exportSbom", value.asInstanceOf[js.Any])
  }
}

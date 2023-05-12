package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffRange extends StObject {
  
  var createRepositorySnapshot: `1088`
  
  var diffRange: `1089`
}
object DiffRange {
  
  inline def apply(createRepositorySnapshot: `1088`, diffRange: `1089`): DiffRange = {
    val __obj = js.Dynamic.literal(createRepositorySnapshot = createRepositorySnapshot.asInstanceOf[js.Any], diffRange = diffRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffRange] (val x: Self) extends AnyVal {
    
    inline def setCreateRepositorySnapshot(value: `1088`): Self = StObject.set(x, "createRepositorySnapshot", value.asInstanceOf[js.Any])
    
    inline def setDiffRange(value: `1089`): Self = StObject.set(x, "diffRange", value.asInstanceOf[js.Any])
  }
}

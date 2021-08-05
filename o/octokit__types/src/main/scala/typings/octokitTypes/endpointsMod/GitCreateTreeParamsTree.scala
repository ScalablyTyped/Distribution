package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`040000`
import typings.octokitTypes.octokitTypesStrings.`100644`
import typings.octokitTypes.octokitTypesStrings.`100755`
import typings.octokitTypes.octokitTypesStrings.`120000`
import typings.octokitTypes.octokitTypesStrings.`160000`
import typings.octokitTypes.octokitTypesStrings.blob
import typings.octokitTypes.octokitTypesStrings.commit
import typings.octokitTypes.octokitTypesStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateTreeParamsTree extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var sha: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[blob | tree | commit] = js.undefined
}
object GitCreateTreeParamsTree {
  
  inline def apply(): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
  
  extension [Self <: GitCreateTreeParamsTree](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMode(value: `100644` | `100755` | `040000` | `160000` | `120000`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaNull: Self = StObject.set(x, "sha", null)
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setType(value: blob | tree | commit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

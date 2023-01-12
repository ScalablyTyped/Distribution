package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.anon.CompleteAfter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneTaskOptions extends StObject {
  
  var includeBarCodes: Boolean
  
  var includeDependencies: Boolean
  
  var includeMetadata: Boolean
  
  var overrides: js.UndefOr[CompleteAfter] = js.undefined
}
object CloneTaskOptions {
  
  inline def apply(includeBarCodes: Boolean, includeDependencies: Boolean, includeMetadata: Boolean): CloneTaskOptions = {
    val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneTaskOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneTaskOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeBarCodes(value: Boolean): Self = StObject.set(x, "includeBarCodes", value.asInstanceOf[js.Any])
    
    inline def setIncludeDependencies(value: Boolean): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetadata(value: Boolean): Self = StObject.set(x, "includeMetadata", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: CompleteAfter): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}

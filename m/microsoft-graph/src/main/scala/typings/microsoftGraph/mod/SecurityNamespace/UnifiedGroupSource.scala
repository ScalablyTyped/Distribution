package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Group
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedGroupSource
  extends StObject
     with DataSource {
  
  // Represents a group.
  var group: js.UndefOr[Group] = js.undefined
  
  // Specifies which sources are included in this group. Possible values are: mailbox, site.
  var includedSources: js.UndefOr[NullableOption[SourceType]] = js.undefined
}
object UnifiedGroupSource {
  
  inline def apply(): UnifiedGroupSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedGroupSource]
  }
  
  extension [Self <: UnifiedGroupSource](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIncludedSources(value: NullableOption[SourceType]): Self = StObject.set(x, "includedSources", value.asInstanceOf[js.Any])
    
    inline def setIncludedSourcesNull: Self = StObject.set(x, "includedSources", null)
    
    inline def setIncludedSourcesUndefined: Self = StObject.set(x, "includedSources", js.undefined)
  }
}

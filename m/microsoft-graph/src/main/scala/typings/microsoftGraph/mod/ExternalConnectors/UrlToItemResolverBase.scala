package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlToItemResolverBase extends StObject {
  
  // The priority which defines the sequence in which the urlToItemResolverBase instances are evaluated.
  var priority: js.UndefOr[NullableOption[Double]] = js.undefined
}
object UrlToItemResolverBase {
  
  inline def apply(): UrlToItemResolverBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlToItemResolverBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlToItemResolverBase] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: NullableOption[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}

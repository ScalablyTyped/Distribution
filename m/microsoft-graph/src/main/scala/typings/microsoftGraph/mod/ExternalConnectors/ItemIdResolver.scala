package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: interface-name
trait ItemIdResolver
  extends StObject
     with UrlToItemResolverBase {
  
  /**
    * Pattern that specifies how to form the ID of the external item that the URL represents. The named groups from the
    * regular expression in urlPattern within the urlMatchInfo can be referenced by inserting the group name inside curly
    * brackets.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  // Configurations to match and resolve URL.
  var urlMatchInfo: js.UndefOr[NullableOption[UrlMatchInfo]] = js.undefined
}
object ItemIdResolver {
  
  inline def apply(): ItemIdResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemIdResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemIdResolver] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setUrlMatchInfo(value: NullableOption[UrlMatchInfo]): Self = StObject.set(x, "urlMatchInfo", value.asInstanceOf[js.Any])
    
    inline def setUrlMatchInfoNull: Self = StObject.set(x, "urlMatchInfo", null)
    
    inline def setUrlMatchInfoUndefined: Self = StObject.set(x, "urlMatchInfo", js.undefined)
  }
}

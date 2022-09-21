package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryAddToReviewSetOperation
  extends StObject
     with CaseOperation {
  
  // eDiscovery review set to which items matching source collection query gets added.
  var reviewSet: js.UndefOr[NullableOption[EdiscoveryReviewSet]] = js.undefined
  
  // eDiscovery search that gets added to review set.
  var search: js.UndefOr[NullableOption[EdiscoverySearch]] = js.undefined
}
object EdiscoveryAddToReviewSetOperation {
  
  inline def apply(): EdiscoveryAddToReviewSetOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryAddToReviewSetOperation]
  }
  
  extension [Self <: EdiscoveryAddToReviewSetOperation](x: Self) {
    
    inline def setReviewSet(value: NullableOption[EdiscoveryReviewSet]): Self = StObject.set(x, "reviewSet", value.asInstanceOf[js.Any])
    
    inline def setReviewSetNull: Self = StObject.set(x, "reviewSet", null)
    
    inline def setReviewSetUndefined: Self = StObject.set(x, "reviewSet", js.undefined)
    
    inline def setSearch(value: NullableOption[EdiscoverySearch]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchNull: Self = StObject.set(x, "search", null)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}

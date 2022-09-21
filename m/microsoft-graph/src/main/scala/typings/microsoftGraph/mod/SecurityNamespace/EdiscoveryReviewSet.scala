package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryReviewSet
  extends StObject
     with DataSet {
  
  // Represents queries within the review set.
  var queries: js.UndefOr[NullableOption[js.Array[EdiscoveryReviewSetQuery]]] = js.undefined
}
object EdiscoveryReviewSet {
  
  inline def apply(): EdiscoveryReviewSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryReviewSet]
  }
  
  extension [Self <: EdiscoveryReviewSet](x: Self) {
    
    inline def setQueries(value: NullableOption[js.Array[EdiscoveryReviewSetQuery]]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesNull: Self = StObject.set(x, "queries", null)
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: EdiscoveryReviewSetQuery*): Self = StObject.set(x, "queries", js.Array(value*))
  }
}

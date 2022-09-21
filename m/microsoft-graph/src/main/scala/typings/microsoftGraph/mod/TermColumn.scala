package typings.microsoftGraph.mod

import typings.microsoftGraph.mod.TermStore.Set
import typings.microsoftGraph.mod.TermStore.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermColumn extends StObject {
  
  // Specifies whether the column will allow more than one value.
  var allowMultipleValues: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var parentTerm: js.UndefOr[NullableOption[Term]] = js.undefined
  
  // Specifies whether to display the entire term path or only the term label.
  var showFullyQualifiedName: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var termSet: js.UndefOr[NullableOption[Set]] = js.undefined
}
object TermColumn {
  
  inline def apply(): TermColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermColumn]
  }
  
  extension [Self <: TermColumn](x: Self) {
    
    inline def setAllowMultipleValues(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleValuesNull: Self = StObject.set(x, "allowMultipleValues", null)
    
    inline def setAllowMultipleValuesUndefined: Self = StObject.set(x, "allowMultipleValues", js.undefined)
    
    inline def setParentTerm(value: NullableOption[Term]): Self = StObject.set(x, "parentTerm", value.asInstanceOf[js.Any])
    
    inline def setParentTermNull: Self = StObject.set(x, "parentTerm", null)
    
    inline def setParentTermUndefined: Self = StObject.set(x, "parentTerm", js.undefined)
    
    inline def setShowFullyQualifiedName(value: NullableOption[Boolean]): Self = StObject.set(x, "showFullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setShowFullyQualifiedNameNull: Self = StObject.set(x, "showFullyQualifiedName", null)
    
    inline def setShowFullyQualifiedNameUndefined: Self = StObject.set(x, "showFullyQualifiedName", js.undefined)
    
    inline def setTermSet(value: NullableOption[Set]): Self = StObject.set(x, "termSet", value.asInstanceOf[js.Any])
    
    inline def setTermSetNull: Self = StObject.set(x, "termSet", null)
    
    inline def setTermSetUndefined: Self = StObject.set(x, "termSet", js.undefined)
  }
}

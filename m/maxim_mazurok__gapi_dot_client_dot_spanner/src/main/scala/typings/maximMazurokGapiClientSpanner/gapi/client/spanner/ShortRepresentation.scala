package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortRepresentation extends StObject {
  
  /** A string representation of the expression subtree rooted at this node. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A mapping of (subquery variable name) -> (subquery node id) for cases where the `description` string of this node references a `SCALAR` subquery contained in the expression subtree
    * rooted at this node. The referenced `SCALAR` subquery may not necessarily be a direct child of this node.
    */
  var subqueries: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
  ] = js.undefined
}
object ShortRepresentation {
  
  inline def apply(): ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortRepresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortRepresentation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSubqueries(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
    ): Self = StObject.set(x, "subqueries", value.asInstanceOf[js.Any])
    
    inline def setSubqueriesUndefined: Self = StObject.set(x, "subqueries", js.undefined)
  }
}

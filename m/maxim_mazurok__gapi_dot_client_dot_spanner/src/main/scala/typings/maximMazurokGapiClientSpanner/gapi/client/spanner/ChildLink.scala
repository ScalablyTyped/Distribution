package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildLink extends StObject {
  
  /** The node to which the link points. */
  var childIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of the link. For example, in Hash Joins this could be used to distinguish between the build child and the probe child, or in the case of the child being an output variable,
    * to represent the tag associated with the output variable.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Only present if the child node is SCALAR and corresponds to an output variable of the parent node. The field carries the name of the output variable. For example, a `TableScan`
    * operator that reads rows from a table will have child links to the `SCALAR` nodes representing the output variables created for each column that is read by the operator. The
    * corresponding `variable` fields will be set to the variable names assigned to the columns.
    */
  var variable: js.UndefOr[String] = js.undefined
}
object ChildLink {
  
  inline def apply(): ChildLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildLink]
  }
  
  extension [Self <: ChildLink](x: Self) {
    
    inline def setChildIndex(value: Double): Self = StObject.set(x, "childIndex", value.asInstanceOf[js.Any])
    
    inline def setChildIndexUndefined: Self = StObject.set(x, "childIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}

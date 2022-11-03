package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  /**
    * Measures only: The alias, that is the name of the dynamic property used for aggregation of this measure;
    * see "3.1.1 Keyword as" (since 1.55.0)
    */
  var as: js.UndefOr[String] = js.undefined
  
  /**
    * Its presence is used to detect a dimension; the dimension is ignored unless at least one of `inResult`
    * and `visible` is `true`
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dimensions only: see above
    */
  var inResult: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Measures only: Whether the maximum value (ignoring currencies or units of measure) for this measure is
    * needed (since 1.55.0); filtering and sorting is supported in this case (since 1.58.0), but shared requests
    * are not (since 1.108.0)
    */
  var max: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Measures only: Whether the minimum value (ignoring currencies or units of measure) for this measure is
    * needed (since 1.55.0); filtering and sorting is supported in this case (since 1.58.0), but shared requests
    * are not (since 1.108.0)
    */
  var min: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of an OData property. A property which is neither a dimension nor a measure, but for instance
    * a text property or in some cases a unit property, has no further details.
    */
  var name: String
  
  /**
    * Its presence is used to detect a measure
    */
  var total: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dimensions only: see above
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Measures only: The name of the method (for example "sum") used for aggregation of this measure; see "3.1.2
    * Keyword with" (since 1.55.0)
    */
  var `with`: js.UndefOr[String] = js.undefined
}
object As {
  
  inline def apply(name: String): As = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setInResult(value: Boolean): Self = StObject.set(x, "inResult", value.asInstanceOf[js.Any])
    
    inline def setInResultUndefined: Self = StObject.set(x, "inResult", js.undefined)
    
    inline def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Boolean): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWith(value: String): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    
    inline def setWithUndefined: Self = StObject.set(x, "with", js.undefined)
  }
}

package typings.oJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odataQueryMod {
  
  trait OdataQuery
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("$compute")
    var $compute: js.UndefOr[String] = js.undefined
    
    @JSName("$count")
    var $count: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$expand")
    var $expand: js.UndefOr[String] = js.undefined
    
    @JSName("$filter")
    var $filter: js.UndefOr[String] = js.undefined
    
    @JSName("$format")
    var $format: js.UndefOr[String] = js.undefined
    
    @JSName("$index")
    var $index: js.UndefOr[Double] = js.undefined
    
    @JSName("$orderby")
    var $orderby: js.UndefOr[String] = js.undefined
    
    @JSName("$search")
    var $search: js.UndefOr[String] = js.undefined
    
    @JSName("$select")
    var $select: js.UndefOr[String] = js.undefined
    
    @JSName("$skip")
    var $skip: js.UndefOr[Double] = js.undefined
    
    @JSName("$top")
    var $top: js.UndefOr[Double] = js.undefined
  }
  object OdataQuery {
    
    inline def apply(): OdataQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OdataQuery]
    }
    
    extension [Self <: OdataQuery](x: Self) {
      
      inline def set$compute(value: String): Self = StObject.set(x, "$compute", value.asInstanceOf[js.Any])
      
      inline def set$computeUndefined: Self = StObject.set(x, "$compute", js.undefined)
      
      inline def set$count(value: Boolean): Self = StObject.set(x, "$count", value.asInstanceOf[js.Any])
      
      inline def set$countUndefined: Self = StObject.set(x, "$count", js.undefined)
      
      inline def set$expand(value: String): Self = StObject.set(x, "$expand", value.asInstanceOf[js.Any])
      
      inline def set$expandUndefined: Self = StObject.set(x, "$expand", js.undefined)
      
      inline def set$filter(value: String): Self = StObject.set(x, "$filter", value.asInstanceOf[js.Any])
      
      inline def set$filterUndefined: Self = StObject.set(x, "$filter", js.undefined)
      
      inline def set$format(value: String): Self = StObject.set(x, "$format", value.asInstanceOf[js.Any])
      
      inline def set$formatUndefined: Self = StObject.set(x, "$format", js.undefined)
      
      inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      inline def set$indexUndefined: Self = StObject.set(x, "$index", js.undefined)
      
      inline def set$orderby(value: String): Self = StObject.set(x, "$orderby", value.asInstanceOf[js.Any])
      
      inline def set$orderbyUndefined: Self = StObject.set(x, "$orderby", js.undefined)
      
      inline def set$search(value: String): Self = StObject.set(x, "$search", value.asInstanceOf[js.Any])
      
      inline def set$searchUndefined: Self = StObject.set(x, "$search", js.undefined)
      
      inline def set$select(value: String): Self = StObject.set(x, "$select", value.asInstanceOf[js.Any])
      
      inline def set$selectUndefined: Self = StObject.set(x, "$select", js.undefined)
      
      inline def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
      
      inline def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
      
      inline def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
      
      inline def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
    }
  }
}

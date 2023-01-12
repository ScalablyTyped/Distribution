package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawRules extends StObject {
  
  var begin: String
  
  var end: String
  
  var groupBy: String
  
  var limit: Double
  
  var limitEnd: Double
  
  // limit = limitStart  =0 and limitEnd = limit.
  var limitStart: Double
  
  var orderBy: String
  
  var orderByDesc: String
  
  var table: String
}
object RawRules {
  
  inline def apply(
    begin: String,
    end: String,
    groupBy: String,
    limit: Double,
    limitEnd: Double,
    limitStart: Double,
    orderBy: String,
    orderByDesc: String,
    table: String
  ): RawRules = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], limitEnd = limitEnd.asInstanceOf[js.Any], limitStart = limitStart.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderByDesc = orderByDesc.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawRules] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitEnd(value: Double): Self = StObject.set(x, "limitEnd", value.asInstanceOf[js.Any])
    
    inline def setLimitStart(value: Double): Self = StObject.set(x, "limitStart", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByDesc(value: String): Self = StObject.set(x, "orderByDesc", value.asInstanceOf[js.Any])
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}

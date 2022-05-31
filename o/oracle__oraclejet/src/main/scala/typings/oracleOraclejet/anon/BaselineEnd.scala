package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineEnd[K2, D2]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var baselineEnd: String
  
  var baselineStart: String
  
  var end: String
  
  var rowContext: ComponentElement[K2]
  
  var start: String
  
  var taskContexts: js.Array[ItemData[K2, D2]]
  
  var value: String
}
object BaselineEnd {
  
  inline def apply[K2, D2](
    baselineEnd: String,
    baselineStart: String,
    end: String,
    rowContext: ComponentElement[K2],
    start: String,
    taskContexts: js.Array[ItemData[K2, D2]],
    value: String
  ): BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd.asInstanceOf[js.Any], baselineStart = baselineStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskContexts = taskContexts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineEnd[K2, D2]]
  }
  
  extension [Self <: BaselineEnd[?, ?], K2, D2](x: Self & (BaselineEnd[K2, D2])) {
    
    inline def setBaselineEnd(value: String): Self = StObject.set(x, "baselineEnd", value.asInstanceOf[js.Any])
    
    inline def setBaselineStart(value: String): Self = StObject.set(x, "baselineStart", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setRowContext(value: ComponentElement[K2]): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTaskContexts(value: js.Array[ItemData[K2, D2]]): Self = StObject.set(x, "taskContexts", value.asInstanceOf[js.Any])
    
    inline def setTaskContextsVarargs(value: (ItemData[K2, D2])*): Self = StObject.set(x, "taskContexts", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

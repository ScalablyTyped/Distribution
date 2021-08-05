package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposReplaceAllTopicsResponseData extends StObject {
  
  var names: js.Array[String]
}
object ReposReplaceAllTopicsResponseData {
  
  inline def apply(names: js.Array[String]): ReposReplaceAllTopicsResponseData = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposReplaceAllTopicsResponseData]
  }
  
  extension [Self <: ReposReplaceAllTopicsResponseData](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}

package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetAllTopicsResponseData extends StObject {
  
  var names: js.Array[String]
}
object ReposGetAllTopicsResponseData {
  
  @scala.inline
  def apply(names: js.Array[String]): ReposGetAllTopicsResponseData = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetAllTopicsResponseDataMutableBuilder[Self <: ReposGetAllTopicsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}

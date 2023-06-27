package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters51 extends StObject {
  
  /**
    * Get Octocat
    * @description Get the octocat as ASCII art
    */
  var get: Parameters51
}
object GetParameters51 {
  
  inline def apply(get: Parameters51): GetParameters51 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters51]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters51] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters51): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

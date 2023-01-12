package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angular extends StObject {
  
  var angular: Parser[Any]
  
  var html: Parser[Any]
  
  var lwc: Parser[Any]
  
  var vue: Parser[Any]
}
object Angular {
  
  inline def apply(angular: Parser[Any], html: Parser[Any], lwc: Parser[Any], vue: Parser[Any]): Angular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], lwc = lwc.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angular]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angular] (val x: Self) extends AnyVal {
    
    inline def setAngular(value: Parser[Any]): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Parser[Any]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setLwc(value: Parser[Any]): Self = StObject.set(x, "lwc", value.asInstanceOf[js.Any])
    
    inline def setVue(value: Parser[Any]): Self = StObject.set(x, "vue", value.asInstanceOf[js.Any])
  }
}

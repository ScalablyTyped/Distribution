package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Once extends StObject {
  
  def Once(root: Any): Unit
  
  var postcssPlugin: String
}
object Once {
  
  inline def apply(Once: Any => Unit, postcssPlugin: String): Once = {
    val __obj = js.Dynamic.literal(Once = js.Any.fromFunction1(Once), postcssPlugin = postcssPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once]
  }
  
  extension [Self <: Once](x: Self) {
    
    inline def setOnce(value: Any => Unit): Self = StObject.set(x, "Once", js.Any.fromFunction1(value))
    
    inline def setPostcssPlugin(value: String): Self = StObject.set(x, "postcssPlugin", value.asInstanceOf[js.Any])
  }
}

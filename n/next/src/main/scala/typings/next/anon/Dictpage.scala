package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictpage
  extends StObject
     with /* page */ StringDictionary[js.Array[String]] {
  
  @JSName("/_app")
  var Slash_app: js.Array[String]
}
object Dictpage {
  
  inline def apply(Slash_app: js.Array[String]): Dictpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/_app")(Slash_app.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictpage]
  }
  
  extension [Self <: Dictpage](x: Self) {
    
    inline def setSlash_app(value: js.Array[String]): Self = StObject.set(x, "/_app", value.asInstanceOf[js.Any])
    
    inline def setSlash_appVarargs(value: String*): Self = StObject.set(x, "/_app", js.Array(value*))
  }
}

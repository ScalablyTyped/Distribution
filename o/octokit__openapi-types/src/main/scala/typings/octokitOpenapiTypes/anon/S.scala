package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S extends StObject {
  
  /** The words to show in Octocat's speech bubble */
  var s: js.UndefOr[String] = js.undefined
}
object S {
  
  inline def apply(): S = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S] (val x: Self) extends AnyVal {
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
  }
}

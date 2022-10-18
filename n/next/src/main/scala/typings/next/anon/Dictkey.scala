package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var filename: String
  
  var jsConfig: js.UndefOr[Any] = js.undefined
}
object Dictkey {
  
  inline def apply(filename: String): Dictkey = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setJsConfig(value: Any): Self = StObject.set(x, "jsConfig", value.asInstanceOf[js.Any])
    
    inline def setJsConfigUndefined: Self = StObject.set(x, "jsConfig", js.undefined)
  }
}

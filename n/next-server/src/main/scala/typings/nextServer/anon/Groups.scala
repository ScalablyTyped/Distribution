package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: StringDictionary[Double]
  
  var re: js.RegExp
}
object Groups {
  
  inline def apply(groups: StringDictionary[Double], re: js.RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: StringDictionary[Double]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setRe(value: js.RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
  }
}

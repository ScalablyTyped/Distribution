package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var data: js.Array[Groupdescription]
}
object `7` {
  
  inline def apply(data: js.Array[Groupdescription]): `7` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setData(value: js.Array[Groupdescription]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Groupdescription*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}

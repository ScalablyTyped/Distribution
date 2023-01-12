package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommitter extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Committer
}
object ApplicationjsonCommitter {
  
  inline def apply(applicationSlashjson: Committer): ApplicationjsonCommitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCommitter] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Committer): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}

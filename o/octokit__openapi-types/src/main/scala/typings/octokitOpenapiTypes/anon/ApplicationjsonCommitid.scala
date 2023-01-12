package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommitid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Commitid
}
object ApplicationjsonCommitid {
  
  inline def apply(applicationSlashjson: Commitid): ApplicationjsonCommitid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommitid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCommitid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Commitid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}

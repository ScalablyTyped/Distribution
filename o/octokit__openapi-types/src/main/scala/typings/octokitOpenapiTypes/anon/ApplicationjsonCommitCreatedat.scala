package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommitCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CommitCreatedat
}
object ApplicationjsonCommitCreatedat {
  
  inline def apply(applicationSlashjson: CommitCreatedat): ApplicationjsonCommitCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommitCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCommitCreatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CommitCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}

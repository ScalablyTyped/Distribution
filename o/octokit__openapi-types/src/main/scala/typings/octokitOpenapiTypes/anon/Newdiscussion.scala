package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Newdiscussion extends StObject {
  
  var new_discussion: Answerchosenat
  
  var new_repository: Allowupdatebranch
}
object Newdiscussion {
  
  inline def apply(new_discussion: Answerchosenat, new_repository: Allowupdatebranch): Newdiscussion = {
    val __obj = js.Dynamic.literal(new_discussion = new_discussion.asInstanceOf[js.Any], new_repository = new_repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newdiscussion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Newdiscussion] (val x: Self) extends AnyVal {
    
    inline def setNew_discussion(value: Answerchosenat): Self = StObject.set(x, "new_discussion", value.asInstanceOf[js.Any])
    
    inline def setNew_repository(value: Allowupdatebranch): Self = StObject.set(x, "new_repository", value.asInstanceOf[js.Any])
  }
}

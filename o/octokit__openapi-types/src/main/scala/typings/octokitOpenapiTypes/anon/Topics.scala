package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topics extends StObject {
  
  var default_branch: js.UndefOr[FromString] = js.undefined
  
  var description: js.UndefOr[`455`] = js.undefined
  
  var homepage: js.UndefOr[`455`] = js.undefined
  
  var topics: js.UndefOr[`465`] = js.undefined
}
object Topics {
  
  inline def apply(): Topics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Topics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Topics] (val x: Self) extends AnyVal {
    
    inline def setDefault_branch(value: FromString): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    inline def setDefault_branchUndefined: Self = StObject.set(x, "default_branch", js.undefined)
    
    inline def setDescription(value: `455`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHomepage(value: `455`): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setTopics(value: `465`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
  }
}

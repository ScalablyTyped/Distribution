package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderEntities extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of tags inside the folder. */
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /** The list of triggers inside the folder. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  
  /** The list of variables inside the folder. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}
object FolderEntities {
  
  inline def apply(): FolderEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderEntities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderEntities] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value*))
    
    inline def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value*))
    
    inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value*))
  }
}

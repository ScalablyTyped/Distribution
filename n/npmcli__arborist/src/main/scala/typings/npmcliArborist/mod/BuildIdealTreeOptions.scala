package typings.npmcliArborist.mod

import typings.npmcliArborist.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildIdealTreeOptions extends StObject {
  
  var add: js.UndefOr[js.Array[String]] = js.undefined
  
  var engineStrict: js.UndefOr[Boolean] = js.undefined
  
  var legacyBundling: js.UndefOr[Boolean] = js.undefined
  
  var preferDedupe: js.UndefOr[Boolean] = js.undefined
  
  var prune: js.UndefOr[Boolean] = js.undefined
  
  var rm: js.UndefOr[js.Array[String]] = js.undefined
  
  var saveBundle: js.UndefOr[Boolean] = js.undefined
  
  var saveType: js.UndefOr[SaveType] = js.undefined
  
  var update: js.UndefOr[Boolean | All] = js.undefined
}
object BuildIdealTreeOptions {
  
  inline def apply(): BuildIdealTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildIdealTreeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildIdealTreeOptions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
    
    inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
    
    inline def setLegacyBundling(value: Boolean): Self = StObject.set(x, "legacyBundling", value.asInstanceOf[js.Any])
    
    inline def setLegacyBundlingUndefined: Self = StObject.set(x, "legacyBundling", js.undefined)
    
    inline def setPreferDedupe(value: Boolean): Self = StObject.set(x, "preferDedupe", value.asInstanceOf[js.Any])
    
    inline def setPreferDedupeUndefined: Self = StObject.set(x, "preferDedupe", js.undefined)
    
    inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
    
    inline def setRm(value: js.Array[String]): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
    
    inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
    
    inline def setRmVarargs(value: String*): Self = StObject.set(x, "rm", js.Array(value*))
    
    inline def setSaveBundle(value: Boolean): Self = StObject.set(x, "saveBundle", value.asInstanceOf[js.Any])
    
    inline def setSaveBundleUndefined: Self = StObject.set(x, "saveBundle", js.undefined)
    
    inline def setSaveType(value: SaveType): Self = StObject.set(x, "saveType", value.asInstanceOf[js.Any])
    
    inline def setSaveTypeUndefined: Self = StObject.set(x, "saveType", js.undefined)
    
    inline def setUpdate(value: Boolean | All): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}

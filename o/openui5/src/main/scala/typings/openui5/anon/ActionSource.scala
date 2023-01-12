package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import typings.openui5.sapUiIntegrationLibraryMod.CardActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSource extends StObject {
  
  /**
    * The action source.
    */
  var actionSource: js.UndefOr[default] = js.undefined
  
  /**
    * The manifest parameters related to the triggered action.
    */
  var manifestParameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The parameters related to the triggered action.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The type of the action.
    */
  var `type`: js.UndefOr[
    CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
  ] = js.undefined
}
object ActionSource {
  
  inline def apply(): ActionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSource] (val x: Self) extends AnyVal {
    
    inline def setActionSource(value: default): Self = StObject.set(x, "actionSource", value.asInstanceOf[js.Any])
    
    inline def setActionSourceUndefined: Self = StObject.set(x, "actionSource", js.undefined)
    
    inline def setManifestParameters(value: js.Object): Self = StObject.set(x, "manifestParameters", value.asInstanceOf[js.Any])
    
    inline def setManifestParametersUndefined: Self = StObject.set(x, "manifestParameters", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(
      value: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

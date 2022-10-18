package typings.openui5.anon

import typings.openui5.sapUiIntegrationLibraryMod.CardActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  /**
    * Additional parameters which will be used by the action handler to perform the action.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The type of the action.
    */
  var `type`: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
}
object Parameters {
  
  inline def apply(
    `type`: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(
      value: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardid extends StObject {
  
  /** The unique identifier of the card. */
  var card_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
}
object Cardid {
  
  inline def apply(
    card_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
  ): Cardid = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardid]
  }
  
  extension [Self <: Cardid](x: Self) {
    
    inline def setCard_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
    ): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
  }
}

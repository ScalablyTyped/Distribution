package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardid extends StObject {
  
  var card_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
}
object Cardid {
  
  inline def apply(
    card_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
  ): Cardid = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cardid] (val x: Self) extends AnyVal {
    
    inline def setCard_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['card-id'] */ js.Any
    ): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
  }
}

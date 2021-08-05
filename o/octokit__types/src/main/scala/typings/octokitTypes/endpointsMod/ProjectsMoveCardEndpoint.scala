package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsMoveCardEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var card_id: Double
  
  /**
    * The `id` value of a column in the same project.
    */
  var column_id: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be one of `top`, `bottom`, or `after:<card_id>`, where `<card_id>` is the `id` value of a card in the same column, or in the new column specified by `column_id`.
    */
  var position: String
}
object ProjectsMoveCardEndpoint {
  
  inline def apply(card_id: Double, mediaType: `0`[inertia], position: String): ProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardEndpoint]
  }
  
  extension [Self <: ProjectsMoveCardEndpoint](x: Self) {
    
    inline def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    inline def setColumn_idUndefined: Self = StObject.set(x, "column_id", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

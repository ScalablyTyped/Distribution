package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columnid extends StObject {
  
  /**
    * @description The unique identifier of the column the card should be moved to
    * @example 42
    */
  var column_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The position of the card in a column. Can be one of: `top`, `bottom`, or `after:<card_id>` to place after the specified card.
    * @example bottom
    */
  var position: String
}
object Columnid {
  
  inline def apply(position: String): Columnid = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columnid]
  }
  
  extension [Self <: Columnid](x: Self) {
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    inline def setColumn_idUndefined: Self = StObject.set(x, "column_id", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

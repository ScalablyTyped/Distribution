package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.APPROVED
import typings.paypalPaypalJs.paypalPaypalJsStrings.COMPLETED
import typings.paypalPaypalJs.paypalPaypalJsStrings.CREATED
import typings.paypalPaypalJs.paypalPaypalJsStrings.PAYER_ACTION_REQUIRED
import typings.paypalPaypalJs.paypalPaypalJsStrings.SAVED
import typings.paypalPaypalJs.paypalPaypalJsStrings.VOIDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderResponseBodyMinimal extends StObject {
  
  /**
    * The ID of the order
    * @readonly
    */
  var id: String
  
  /**
    * An array of request-related HATEOAS links
    */
  var links: js.Array[LinkDescription]
  
  /**
    * The order status
    */
  var status: CREATED | SAVED | APPROVED | VOIDED | COMPLETED | PAYER_ACTION_REQUIRED
}
object OrderResponseBodyMinimal {
  
  inline def apply(
    id: String,
    links: js.Array[LinkDescription],
    status: CREATED | SAVED | APPROVED | VOIDED | COMPLETED | PAYER_ACTION_REQUIRED
  ): OrderResponseBodyMinimal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderResponseBodyMinimal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderResponseBodyMinimal] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setStatus(value: CREATED | SAVED | APPROVED | VOIDED | COMPLETED | PAYER_ACTION_REQUIRED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

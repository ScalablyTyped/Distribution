package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsEvent
  extends StObject
     with HostedFieldsState {
  
  var emittedBy: HostedFieldsHostedFieldsFieldName
}
object HostedFieldsEvent {
  
  inline def apply(
    cards: js.Array[HostedFieldsHostedFieldsCard],
    emittedBy: HostedFieldsHostedFieldsFieldName,
    fields: HostedFieldsFieldDataFields
  ): HostedFieldsEvent = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], emittedBy = emittedBy.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsEvent] (val x: Self) extends AnyVal {
    
    inline def setEmittedBy(value: HostedFieldsHostedFieldsFieldName): Self = StObject.set(x, "emittedBy", value.asInstanceOf[js.Any])
  }
}

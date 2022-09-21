package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkin extends StObject {
  
  var attachments: js.Array[Map2[IAttachment]]
  
  def getAttachment(slotIndex: Double, name: String): IAttachment | Null
  
  var name: String
}
object ISkin {
  
  inline def apply(
    attachments: js.Array[Map2[IAttachment]],
    getAttachment: (Double, String) => IAttachment | Null,
    name: String
  ): ISkin = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction2(getAttachment), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkin]
  }
  
  extension [Self <: ISkin](x: Self) {
    
    inline def setAttachments(value: js.Array[Map2[IAttachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: Map2[IAttachment]*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setGetAttachment(value: (Double, String) => IAttachment | Null): Self = StObject.set(x, "getAttachment", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttachment extends StObject {
  
  var name: String
  
  val sequence: js.UndefOr[ISequence] = js.undefined
  
  var `type`: AttachmentType
}
object IAttachment {
  
  inline def apply(name: String, `type`: AttachmentType): IAttachment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachment]
  }
  
  extension [Self <: IAttachment](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: ISequence): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setType(value: AttachmentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

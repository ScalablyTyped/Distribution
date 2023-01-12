package typings.microsoftteams.microsoftTeams.media

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper object to assembled media chunks
  */
trait AssembleAttachment extends StObject {
  
  var file: Blob
  
  var sequence: Double
}
object AssembleAttachment {
  
  inline def apply(file: Blob, sequence: Double): AssembleAttachment = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssembleAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssembleAttachment] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}

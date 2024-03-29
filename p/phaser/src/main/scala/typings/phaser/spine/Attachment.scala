package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  def copy(): Attachment
  
  var name: String
}
object Attachment {
  
  inline def apply(copy: () => Attachment, name: String): Attachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: () => Attachment): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

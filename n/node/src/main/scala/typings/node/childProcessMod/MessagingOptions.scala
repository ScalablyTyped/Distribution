package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingOptions extends StObject {
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
}
object MessagingOptions {
  
  inline def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  extension [Self <: MessagingOptions](x: Self) {
    
    inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}

package typings.moize.anon

import typings.moize.mod.Serialize
import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSerializedSerializer[Serializer /* <: Serialize */] extends StObject {
  
  var isSerialized: `true`
  
  var serializer: Serializer
}
object IsSerializedSerializer {
  
  inline def apply[Serializer /* <: Serialize */](serializer: Serializer): IsSerializedSerializer[Serializer] = {
    val __obj = js.Dynamic.literal(isSerialized = true, serializer = serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSerializedSerializer[Serializer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSerializedSerializer[?], Serializer /* <: Serialize */] (val x: Self & IsSerializedSerializer[Serializer]) extends AnyVal {
    
    inline def setIsSerialized(value: `true`): Self = StObject.set(x, "isSerialized", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: Serializer): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
  }
}

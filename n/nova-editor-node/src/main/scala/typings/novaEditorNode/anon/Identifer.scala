package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifer extends StObject {
  
  var identifer: String
  
  var name: String
}
object Identifer {
  
  inline def apply(identifer: String, name: String): Identifer = {
    val __obj = js.Dynamic.literal(identifer = identifer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifer] (val x: Self) extends AnyVal {
    
    inline def setIdentifer(value: String): Self = StObject.set(x, "identifer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

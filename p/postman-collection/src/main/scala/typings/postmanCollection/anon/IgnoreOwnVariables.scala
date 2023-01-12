package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreOwnVariables extends StObject {
  
  var ignoreOwnVariables: Boolean
}
object IgnoreOwnVariables {
  
  inline def apply(ignoreOwnVariables: Boolean): IgnoreOwnVariables = {
    val __obj = js.Dynamic.literal(ignoreOwnVariables = ignoreOwnVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreOwnVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreOwnVariables] (val x: Self) extends AnyVal {
    
    inline def setIgnoreOwnVariables(value: Boolean): Self = StObject.set(x, "ignoreOwnVariables", value.asInstanceOf[js.Any])
  }
}

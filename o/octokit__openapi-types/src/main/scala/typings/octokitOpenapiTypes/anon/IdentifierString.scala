package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifierString extends StObject {
  
  /** @description The package version that patches this vulnerability. */
  val identifier: String
}
object IdentifierString {
  
  inline def apply(identifier: String): IdentifierString = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentifierString] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}

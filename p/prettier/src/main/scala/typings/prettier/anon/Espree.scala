package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Espree extends StObject {
  
  var espree: Parser[Any]
}
object Espree {
  
  inline def apply(espree: Parser[Any]): Espree = {
    val __obj = js.Dynamic.literal(espree = espree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Espree]
  }
  
  extension [Self <: Espree](x: Self) {
    
    inline def setEspree(value: Parser[Any]): Self = StObject.set(x, "espree", value.asInstanceOf[js.Any])
  }
}

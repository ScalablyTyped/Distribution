package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typescript extends StObject {
  
  var typescript: Parser[Any]
}
object Typescript {
  
  inline def apply(typescript: Parser[Any]): Typescript = {
    val __obj = js.Dynamic.literal(typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typescript]
  }
  
  extension [Self <: Typescript](x: Self) {
    
    inline def setTypescript(value: Parser[Any]): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
  }
}

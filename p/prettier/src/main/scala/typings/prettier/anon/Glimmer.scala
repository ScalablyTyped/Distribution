package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Glimmer extends StObject {
  
  var glimmer: Parser[Any]
}
object Glimmer {
  
  inline def apply(glimmer: Parser[Any]): Glimmer = {
    val __obj = js.Dynamic.literal(glimmer = glimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glimmer]
  }
  
  extension [Self <: Glimmer](x: Self) {
    
    inline def setGlimmer(value: Parser[Any]): Self = StObject.set(x, "glimmer", value.asInstanceOf[js.Any])
  }
}

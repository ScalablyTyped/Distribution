package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Yaml extends StObject {
  
  var yaml: Parser[Any]
}
object Yaml {
  
  inline def apply(yaml: Parser[Any]): Yaml = {
    val __obj = js.Dynamic.literal(yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Yaml]
  }
  
  extension [Self <: Yaml](x: Self) {
    
    inline def setYaml(value: Parser[Any]): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
  }
}

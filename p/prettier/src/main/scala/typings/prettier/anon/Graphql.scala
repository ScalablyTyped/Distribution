package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graphql extends StObject {
  
  var graphql: Parser[Any]
}
object Graphql {
  
  inline def apply(graphql: Parser[Any]): Graphql = {
    val __obj = js.Dynamic.literal(graphql = graphql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphql]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Graphql] (val x: Self) extends AnyVal {
    
    inline def setGraphql(value: Parser[Any]): Self = StObject.set(x, "graphql", value.asInstanceOf[js.Any])
  }
}

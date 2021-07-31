package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuery
  extends StObject
     with Executable {
  
  def ifNotExists(): Executable
}
object CreateQuery {
  
  @scala.inline
  def apply(ifNotExists: () => Executable, toQuery: () => QueryLike): CreateQuery = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[CreateQuery]
  }
  
  @scala.inline
  implicit class CreateQueryMutableBuilder[Self <: CreateQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfNotExists(value: () => Executable): Self = StObject.set(x, "ifNotExists", js.Any.fromFunction0(value))
  }
}

package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropQuery
  extends StObject
     with Executable {
  
  def ifExists(): Executable
}
object DropQuery {
  
  @scala.inline
  def apply(ifExists: () => Executable, toQuery: () => QueryLike): DropQuery = {
    val __obj = js.Dynamic.literal(ifExists = js.Any.fromFunction0(ifExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[DropQuery]
  }
  
  @scala.inline
  implicit class DropQueryMutableBuilder[Self <: DropQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfExists(value: () => Executable): Self = StObject.set(x, "ifExists", js.Any.fromFunction0(value))
  }
}

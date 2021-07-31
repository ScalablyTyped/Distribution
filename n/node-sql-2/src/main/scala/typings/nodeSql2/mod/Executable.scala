package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executable extends StObject {
  
  def toQuery(): QueryLike
}
object Executable {
  
  @scala.inline
  def apply(toQuery: () => QueryLike): Executable = {
    val __obj = js.Dynamic.literal(toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[Executable]
  }
  
  @scala.inline
  implicit class ExecutableMutableBuilder[Self <: Executable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToQuery(value: () => QueryLike): Self = StObject.set(x, "toQuery", js.Any.fromFunction0(value))
  }
}

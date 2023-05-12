package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  recursive :boolean,   filter :std.RegExp}> */
trait Readonlyrecursivebooleanf extends StObject {
  
  val filter: js.RegExp
  
  val recursive: Boolean
}
object Readonlyrecursivebooleanf {
  
  inline def apply(filter: js.RegExp, recursive: Boolean): Readonlyrecursivebooleanf = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyrecursivebooleanf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyrecursivebooleanf] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}

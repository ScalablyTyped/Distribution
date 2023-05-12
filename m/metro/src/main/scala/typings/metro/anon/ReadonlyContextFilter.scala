package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<metro.metro/src/ModuleGraph/worker/collectDependencies.ContextFilter> */
trait ReadonlyContextFilter extends StObject {
  
  val flags: String
  
  val pattern: String
}
object ReadonlyContextFilter {
  
  inline def apply(flags: String, pattern: String): ReadonlyContextFilter = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyContextFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyContextFilter] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}

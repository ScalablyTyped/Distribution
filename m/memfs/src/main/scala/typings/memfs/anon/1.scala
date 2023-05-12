package typings.memfs.anon

import typings.memfs.memfsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var bigint: `false`
  
  var throwIfNoEntry: `false`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(bigint = false, throwIfNoEntry = false)
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

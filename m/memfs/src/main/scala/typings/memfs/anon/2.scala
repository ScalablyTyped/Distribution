package typings.memfs.anon

import typings.memfs.memfsBooleans.`false`
import typings.memfs.memfsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var bigint: `true`
  
  var throwIfNoEntry: `false`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(bigint = true, throwIfNoEntry = false)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

package typings.memfs.anon

import typings.memfs.memfsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var throwIfNoEntry: `false`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(throwIfNoEntry = false)
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

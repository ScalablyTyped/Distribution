package typings.memfs.anon

import typings.memfs.memfsBooleans.`false`
import typings.memfs.memfsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bigint extends StObject {
  
  var bigint: `false`
  
  var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
}
object Bigint {
  
  inline def apply(): Bigint = {
    val __obj = js.Dynamic.literal(bigint = false)
    __obj.asInstanceOf[Bigint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bigint] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

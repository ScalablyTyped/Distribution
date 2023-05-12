package typings.memfs.anon

import typings.memfs.memfsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigintThrowIfNoEntry extends StObject {
  
  var bigint: `true`
  
  var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
}
object BigintThrowIfNoEntry {
  
  inline def apply(): BigintThrowIfNoEntry = {
    val __obj = js.Dynamic.literal(bigint = true)
    __obj.asInstanceOf[BigintThrowIfNoEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigintThrowIfNoEntry] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

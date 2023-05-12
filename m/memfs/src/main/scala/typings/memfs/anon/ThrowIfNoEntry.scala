package typings.memfs.anon

import typings.memfs.memfsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowIfNoEntry extends StObject {
  
  var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
}
object ThrowIfNoEntry {
  
  inline def apply(): ThrowIfNoEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrowIfNoEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrowIfNoEntry] (val x: Self) extends AnyVal {
    
    inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

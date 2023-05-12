package typings.pdfjsDist.anon

import typings.pdfjsDist.pdfjsDistBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  var done: `true`
  
  var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object Done {
  
  inline def apply(): Done = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[Done]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

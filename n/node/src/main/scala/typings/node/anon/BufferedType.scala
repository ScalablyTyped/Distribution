package typings.node.anon

import typings.node.perfHooksMod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferedType extends StObject {
  
  var buffered: js.UndefOr[Boolean] = js.undefined
  
  var `type`: EntryType
}
object BufferedType {
  
  inline def apply(`type`: EntryType): BufferedType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferedType] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setType(value: EntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

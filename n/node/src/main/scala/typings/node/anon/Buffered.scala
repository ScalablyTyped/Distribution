package typings.node.anon

import typings.node.perfHooksMod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffered extends StObject {
  
  var buffered: js.UndefOr[Boolean] = js.undefined
  
  var entryTypes: js.Array[EntryType]
}
object Buffered {
  
  inline def apply(entryTypes: js.Array[EntryType]): Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffered] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setEntryTypes(value: js.Array[EntryType]): Self = StObject.set(x, "entryTypes", value.asInstanceOf[js.Any])
    
    inline def setEntryTypesVarargs(value: EntryType*): Self = StObject.set(x, "entryTypes", js.Array(value*))
  }
}

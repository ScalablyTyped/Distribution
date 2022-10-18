package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  /**
    * This parameter refers to the type of messages being shown.
    */
  var messageTypeFilter: js.UndefOr[
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
  ] = js.undefined
}
object `16` {
  
  inline def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setMessageTypeFilter(
      value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
    ): Self = StObject.set(x, "messageTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeFilterUndefined: Self = StObject.set(x, "messageTypeFilter", js.undefined)
  }
}

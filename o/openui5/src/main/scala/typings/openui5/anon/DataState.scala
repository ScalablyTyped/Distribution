package typings.openui5.anon

import typings.openui5.sapUiModelDataStateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  /**
    * The data state object.
    */
  var dataState: js.UndefOr[default] = js.undefined
  
  /**
    * The messages (@see sap.ui.core.message.Message) from the current `dataState` object filtered by the given
    * `filter` function.
    */
  var filteredMessages: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object DataState {
  
  inline def apply(): DataState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataState]
  }
  
  extension [Self <: DataState](x: Self) {
    
    inline def setDataState(value: default): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    inline def setDataStateUndefined: Self = StObject.set(x, "dataState", js.undefined)
    
    inline def setFilteredMessages(value: js.Array[js.Object]): Self = StObject.set(x, "filteredMessages", value.asInstanceOf[js.Any])
    
    inline def setFilteredMessagesUndefined: Self = StObject.set(x, "filteredMessages", js.undefined)
    
    inline def setFilteredMessagesVarargs(value: js.Object*): Self = StObject.set(x, "filteredMessages", js.Array(value*))
  }
}

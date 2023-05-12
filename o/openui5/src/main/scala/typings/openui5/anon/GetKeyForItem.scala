package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyForItem extends StObject {
  
  /**
    * The control instance that is personalized by this controller
    */
  var control: default
  
  /**
    * By default the SelectionController tries to identify the existing item through the key by checking if
    * there is an existing item with this id. This behaviour can be overruled by implementing this method which
    * will provide the according item of the `targetAggregation` to return the according key associated to
    * this item.
    */
  var getKeyForItem: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The name of the aggregation that is now managed by this controller
    */
  var targetAggregation: String
}
object GetKeyForItem {
  
  inline def apply(control: default, targetAggregation: String): GetKeyForItem = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], targetAggregation = targetAggregation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyForItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyForItem] (val x: Self) extends AnyVal {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setGetKeyForItem(value: js.Function): Self = StObject.set(x, "getKeyForItem", value.asInstanceOf[js.Any])
    
    inline def setGetKeyForItemUndefined: Self = StObject.set(x, "getKeyForItem", js.undefined)
    
    inline def setTargetAggregation(value: String): Self = StObject.set(x, "targetAggregation", value.asInstanceOf[js.Any])
  }
}

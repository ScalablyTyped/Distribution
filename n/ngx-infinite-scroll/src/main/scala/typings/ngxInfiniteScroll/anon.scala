package typings.ngxInfiniteScroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientHeightKey extends StObject {
    
    var clientHeightKey: js.Any
    
    var offsetHeightKey: js.Any
  }
  object ClientHeightKey {
    
    inline def apply(clientHeightKey: js.Any, offsetHeightKey: js.Any): ClientHeightKey = {
      val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientHeightKey]
    }
    
    extension [Self <: ClientHeightKey](x: Self) {
      
      inline def setClientHeightKey(value: js.Any): Self = StObject.set(x, "clientHeightKey", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeightKey(value: js.Any): Self = StObject.set(x, "offsetHeightKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fire extends StObject {
    
    var fire: Boolean
    
    var scrollDown: Boolean
  }
  object Fire {
    
    inline def apply(fire: Boolean, scrollDown: Boolean): Fire = {
      val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fire]
    }
    
    extension [Self <: Fire](x: Self) {
      
      inline def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      inline def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
    }
  }
  
  trait TotalToScroll extends StObject {
    
    var totalToScroll: js.Any
  }
  object TotalToScroll {
    
    inline def apply(totalToScroll: js.Any): TotalToScroll = {
      val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalToScroll]
    }
    
    extension [Self <: TotalToScroll](x: Self) {
      
      inline def setTotalToScroll(value: js.Any): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
}

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
    
    @scala.inline
    def apply(clientHeightKey: js.Any, offsetHeightKey: js.Any): ClientHeightKey = {
      val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientHeightKey]
    }
    
    @scala.inline
    implicit class ClientHeightKeyMutableBuilder[Self <: ClientHeightKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeightKey(value: js.Any): Self = StObject.set(x, "clientHeightKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetHeightKey(value: js.Any): Self = StObject.set(x, "offsetHeightKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fire extends StObject {
    
    var fire: Boolean
    
    var scrollDown: Boolean
  }
  object Fire {
    
    @scala.inline
    def apply(fire: Boolean, scrollDown: Boolean): Fire = {
      val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fire]
    }
    
    @scala.inline
    implicit class FireMutableBuilder[Self <: Fire] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
    }
  }
  
  trait TotalToScroll extends StObject {
    
    var totalToScroll: js.Any
  }
  object TotalToScroll {
    
    @scala.inline
    def apply(totalToScroll: js.Any): TotalToScroll = {
      val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalToScroll]
    }
    
    @scala.inline
    implicit class TotalToScrollMutableBuilder[Self <: TotalToScroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotalToScroll(value: js.Any): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
}

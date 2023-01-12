package typings.ngxInfiniteScroll

import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.ngxInfiniteScroll.libNgxInfiniteScrollDotdirectiveMod.InfiniteScrollDirective
import typings.ngxInfiniteScroll.ngxInfiniteScrollBooleans.`false`
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.`[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.alwaysCallback
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.fromRoot
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.horizontal
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.immediateCheck
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollContainer
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDisabled
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDistance
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollThrottle
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollUpDistance
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrollWindow
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolled
import typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolledUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysCallback extends StObject {
    
    var alwaysCallback: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.alwaysCallback
    
    var fromRoot: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.fromRoot
    
    var horizontal: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.horizontal
    
    var immediateCheck: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.immediateCheck
    
    var infiniteScrollContainer: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollContainer
    
    var infiniteScrollDisabled: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDisabled
    
    var infiniteScrollDistance: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDistance
    
    var infiniteScrollThrottle: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollThrottle
    
    var infiniteScrollUpDistance: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollUpDistance
    
    var scrollWindow: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrollWindow
  }
  object AlwaysCallback {
    
    inline def apply(): AlwaysCallback = {
      val __obj = js.Dynamic.literal(alwaysCallback = "alwaysCallback", fromRoot = "fromRoot", horizontal = "horizontal", immediateCheck = "immediateCheck", infiniteScrollContainer = "infiniteScrollContainer", infiniteScrollDisabled = "infiniteScrollDisabled", infiniteScrollDistance = "infiniteScrollDistance", infiniteScrollThrottle = "infiniteScrollThrottle", infiniteScrollUpDistance = "infiniteScrollUpDistance", scrollWindow = "scrollWindow")
      __obj.asInstanceOf[AlwaysCallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlwaysCallback] (val x: Self) extends AnyVal {
      
      inline def setAlwaysCallback(value: alwaysCallback): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      inline def setFromRoot(value: fromRoot): Self = StObject.set(x, "fromRoot", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setImmediateCheck(value: immediateCheck): Self = StObject.set(x, "immediateCheck", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollContainer(value: infiniteScrollContainer): Self = StObject.set(x, "infiniteScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollDisabled(value: infiniteScrollDisabled): Self = StObject.set(x, "infiniteScrollDisabled", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollDistance(value: infiniteScrollDistance): Self = StObject.set(x, "infiniteScrollDistance", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollThrottle(value: infiniteScrollThrottle): Self = StObject.set(x, "infiniteScrollThrottle", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollUpDistance(value: infiniteScrollUpDistance): Self = StObject.set(x, "infiniteScrollUpDistance", value.asInstanceOf[js.Any])
      
      inline def setScrollWindow(value: scrollWindow): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientHeightKey extends StObject {
    
    var clientHeightKey: Any
    
    var offsetHeightKey: Any
  }
  object ClientHeightKey {
    
    inline def apply(clientHeightKey: Any, offsetHeightKey: Any): ClientHeightKey = {
      val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientHeightKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientHeightKey] (val x: Self) extends AnyVal {
      
      inline def setClientHeightKey(value: Any): Self = StObject.set(x, "clientHeightKey", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeightKey(value: Any): Self = StObject.set(x, "offsetHeightKey", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fire] (val x: Self) extends AnyVal {
      
      inline def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      inline def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scrolled extends StObject {
    
    var scrolled: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolled
    
    var scrolledUp: typings.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolledUp
  }
  object Scrolled {
    
    inline def apply(): Scrolled = {
      val __obj = js.Dynamic.literal(scrolled = "scrolled", scrolledUp = "scrolledUp")
      __obj.asInstanceOf[Scrolled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scrolled] (val x: Self) extends AnyVal {
      
      inline def setScrolled(value: scrolled): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      inline def setScrolledUp(value: scrolledUp): Self = StObject.set(x, "scrolledUp", value.asInstanceOf[js.Any])
    }
  }
  
  trait TotalToScroll extends StObject {
    
    var totalToScroll: Any
  }
  object TotalToScroll {
    
    inline def apply(totalToScroll: Any): TotalToScroll = {
      val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalToScroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TotalToScroll] (val x: Self) extends AnyVal {
      
      inline def setTotalToScroll(value: Any): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofInfiniteScrollDirec
    extends StObject
       with Instantiable2[/* element */ ElementRef[Any], /* zone */ NgZone, InfiniteScrollDirective] {
    
    var ɵdir: ɵɵDirectiveDeclaration[
        InfiniteScrollDirective, 
        `[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`, 
        scala.Nothing, 
        AlwaysCallback, 
        Scrolled, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[InfiniteScrollDirective, scala.Nothing] = js.native
  }
}

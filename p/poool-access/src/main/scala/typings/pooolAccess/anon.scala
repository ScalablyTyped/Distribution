package typings.pooolAccess

import org.scalablytyped.runtime.StringDictionary
import typings.pooolAccess.pooolAccessStrings.custom
import typings.pooolAccess.pooolAccessStrings.excerpt
import typings.pooolAccess.pooolAccessStrings.free
import typings.pooolAccess.pooolAccessStrings.hide
import typings.pooolAccess.pooolAccessStrings.page
import typings.pooolAccess.pooolAccessStrings.premium
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Beacons
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var beacons: js.UndefOr[Boolean] = js.undefined
  }
  object Beacons {
    
    inline def apply(): Beacons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Beacons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Beacons] (val x: Self) extends AnyVal {
      
      inline def setBeacons(value: Boolean): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
      
      inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    }
  }
  
  trait Content extends StObject {
    
    var content: js.UndefOr[String | HTMLElement] = js.undefined
    
    var mode: js.UndefOr[hide | excerpt | custom] = js.undefined
    
    var pageType: js.UndefOr[premium | free] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMode(value: hide | excerpt | custom): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPageType(value: premium | free): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      inline def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `type`: js.UndefOr[premium | free | page] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setType(value: premium | free | page): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

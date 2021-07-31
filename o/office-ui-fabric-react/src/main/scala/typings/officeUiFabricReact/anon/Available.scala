package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  var available: String
  
  var away: String
  
  var background: String
  
  var busy: String
  
  var dnd: String
  
  var offline: String
  
  var oof: String
}
object Available {
  
  @scala.inline
  def apply(
    available: String,
    away: String,
    background: String,
    busy: String,
    dnd: String,
    offline: String,
    oof: String
  ): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], away = away.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], oof = oof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit class AvailableMutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAway(value: String): Self = StObject.set(x, "away", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusy(value: String): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd(value: String): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: String): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOof(value: String): Self = StObject.set(x, "oof", value.asInstanceOf[js.Any])
  }
}

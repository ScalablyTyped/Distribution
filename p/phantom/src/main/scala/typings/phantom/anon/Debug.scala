package typings.phantom.anon

import typings.phantom.mod.winstonLeveledLogMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends StObject {
  
  var debug: js.UndefOr[winstonLeveledLogMethod] = js.native
  
  var error: js.UndefOr[winstonLeveledLogMethod] = js.native
  
  var info: js.UndefOr[winstonLeveledLogMethod] = js.native
  
  var warn: js.UndefOr[winstonLeveledLogMethod] = js.native
}
object Debug {
  
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: winstonLeveledLogMethod): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: winstonLeveledLogMethod): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: winstonLeveledLogMethod): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setWarn(value: winstonLeveledLogMethod): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}

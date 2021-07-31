package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWatchFileOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object IWatchFileOptions {
  
  @scala.inline
  def apply(): IWatchFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWatchFileOptions]
  }
  
  @scala.inline
  implicit class IWatchFileOptionsMutableBuilder[Self <: IWatchFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}

package typings.onfidoSdkUi.anon

import typings.onfidoSdkUi.mod.LogLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var levels: js.UndefOr[js.Array[LogLevels]] = js.undefined
}
object Levels {
  
  inline def apply(): Levels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Levels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLevels(value: js.Array[LogLevels]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: LogLevels*): Self = StObject.set(x, "levels", js.Array(value*))
  }
}

package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptTypeDescriptor extends StObject {
  
  val source: js.UndefOr[Boolean] = js.undefined
}
object ScriptTypeDescriptor {
  
  inline def apply(): ScriptTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

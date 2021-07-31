package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fatal extends StObject {
  
  var fatal: js.UndefOr[Boolean] = js.undefined
  
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}
object Fatal {
  
  @scala.inline
  def apply(): Fatal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fatal]
  }
  
  @scala.inline
  implicit class FatalMutableBuilder[Self <: Fatal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    @scala.inline
    def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
  }
}

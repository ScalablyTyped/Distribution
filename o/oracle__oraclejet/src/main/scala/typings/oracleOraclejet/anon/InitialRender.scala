package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialRender extends StObject {
  
  var initialRender: Boolean = js.native
}
object InitialRender {
  
  @scala.inline
  def apply(initialRender: Boolean): InitialRender = {
    val __obj = js.Dynamic.literal(initialRender = initialRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRender]
  }
  
  @scala.inline
  implicit class InitialRenderMutableBuilder[Self <: InitialRender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRender(value: Boolean): Self = StObject.set(x, "initialRender", value.asInstanceOf[js.Any])
  }
}

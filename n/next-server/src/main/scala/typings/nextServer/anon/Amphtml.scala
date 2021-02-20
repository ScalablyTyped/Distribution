package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amphtml extends StObject {
  
  var amphtml: js.UndefOr[Boolean] = js.native
  
  var dataOnly: js.UndefOr[Boolean] = js.native
  
  var hasAmp: js.UndefOr[Boolean] = js.native
}
object Amphtml {
  
  @scala.inline
  def apply(): Amphtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amphtml]
  }
  
  @scala.inline
  implicit class AmphtmlMutableBuilder[Self <: Amphtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmphtml(value: Boolean): Self = StObject.set(x, "amphtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmphtmlUndefined: Self = StObject.set(x, "amphtml", js.undefined)
    
    @scala.inline
    def setDataOnly(value: Boolean): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
    
    @scala.inline
    def setHasAmp(value: Boolean): Self = StObject.set(x, "hasAmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAmpUndefined: Self = StObject.set(x, "hasAmp", js.undefined)
  }
}

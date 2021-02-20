package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpFirst extends StObject {
  
  var ampFirst: js.UndefOr[Boolean] = js.native
  
  var hasQuery: js.UndefOr[Boolean] = js.native
  
  var hybrid: js.UndefOr[Boolean] = js.native
}
object AmpFirst {
  
  @scala.inline
  def apply(): AmpFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpFirst]
  }
  
  @scala.inline
  implicit class AmpFirstMutableBuilder[Self <: AmpFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmpFirst(value: Boolean): Self = StObject.set(x, "ampFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpFirstUndefined: Self = StObject.set(x, "ampFirst", js.undefined)
    
    @scala.inline
    def setHasQuery(value: Boolean): Self = StObject.set(x, "hasQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasQueryUndefined: Self = StObject.set(x, "hasQuery", js.undefined)
    
    @scala.inline
    def setHybrid(value: Boolean): Self = StObject.set(x, "hybrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHybridUndefined: Self = StObject.set(x, "hybrid", js.undefined)
  }
}

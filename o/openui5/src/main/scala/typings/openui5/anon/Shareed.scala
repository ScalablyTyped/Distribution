package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shareed extends StObject {
  
  /**
    * Current shared state
    */
  var shareed: js.UndefOr[Boolean] = js.undefined
}
object Shareed {
  
  inline def apply(): Shareed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shareed]
  }
  
  extension [Self <: Shareed](x: Self) {
    
    inline def setShareed(value: Boolean): Self = StObject.set(x, "shareed", value.asInstanceOf[js.Any])
    
    inline def setShareedUndefined: Self = StObject.set(x, "shareed", js.undefined)
  }
}

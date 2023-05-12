package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tier extends StObject {
  
  var tier: FromIscustomammount
}
object Tier {
  
  inline def apply(tier: FromIscustomammount): Tier = {
    val __obj = js.Dynamic.literal(tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tier] (val x: Self) extends AnyVal {
    
    inline def setTier(value: FromIscustomammount): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
  }
}

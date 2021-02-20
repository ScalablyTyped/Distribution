package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Referrer extends StObject {
  
  var count: Double = js.native
  
  var referrer: String = js.native
  
  var uniques: Double = js.native
}
object Referrer {
  
  @scala.inline
  def apply(count: Double, referrer: String, uniques: Double): Referrer = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Referrer]
  }
  
  @scala.inline
  implicit class ReferrerMutableBuilder[Self <: Referrer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}

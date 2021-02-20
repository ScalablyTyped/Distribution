package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.wyandotte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var previews: Array[wyandotte | String] = js.native
}
object `6` {
  
  @scala.inline
  def apply(previews: Array[wyandotte | String]): `6` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[wyandotte | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

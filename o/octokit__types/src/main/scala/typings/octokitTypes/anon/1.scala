package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.corsair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var previews: Array[corsair | String] = js.native
}
object `1` {
  
  @scala.inline
  def apply(previews: Array[corsair | String]): `1` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[corsair | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

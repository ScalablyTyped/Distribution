package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.lydian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var previews: Array[lydian | String] = js.native
}
object `8` {
  
  @scala.inline
  def apply(previews: Array[lydian | String]): `8` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[lydian | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

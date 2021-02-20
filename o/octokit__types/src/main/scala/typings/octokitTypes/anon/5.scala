package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.mockingbird
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var previews: Array[mockingbird | String] = js.native
}
object `5` {
  
  @scala.inline
  def apply(previews: Array[mockingbird | String]): `5` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[mockingbird | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

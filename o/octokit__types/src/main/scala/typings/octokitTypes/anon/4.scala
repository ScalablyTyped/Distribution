package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.sombra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var previews: Array[sombra | String] = js.native
}
object `4` {
  
  @scala.inline
  def apply(previews: Array[sombra | String]): `4` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[sombra | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

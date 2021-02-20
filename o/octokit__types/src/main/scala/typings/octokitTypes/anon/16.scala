package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`black-panther`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  var previews: Array[`black-panther` | String] = js.native
}
object `16` {
  
  @scala.inline
  def apply(previews: Array[`black-panther` | String]): `16` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[`black-panther` | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

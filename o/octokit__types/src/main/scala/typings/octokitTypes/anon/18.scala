package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.cloak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends StObject {
  
  var previews: Array[cloak | String] = js.native
}
object `18` {
  
  @scala.inline
  def apply(previews: Array[cloak | String]): `18` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[cloak | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

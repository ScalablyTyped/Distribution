package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.zzzax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  var previews: Array[zzzax | String] = js.native
}
object `11` {
  
  @scala.inline
  def apply(previews: Array[zzzax | String]): `11` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[zzzax | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

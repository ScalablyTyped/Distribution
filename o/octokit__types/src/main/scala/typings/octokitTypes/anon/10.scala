package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.dorian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var previews: Array[dorian | String] = js.native
}
object `10` {
  
  @scala.inline
  def apply(previews: Array[dorian | String]): `10` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[dorian | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

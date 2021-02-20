package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.antiope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var previews: Array[antiope | String] = js.native
}
object `2` {
  
  @scala.inline
  def apply(previews: Array[antiope | String]): `2` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[antiope | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

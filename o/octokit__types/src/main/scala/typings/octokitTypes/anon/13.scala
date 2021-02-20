package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.baptiste
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends StObject {
  
  var previews: Array[baptiste | String] = js.native
}
object `13` {
  
  @scala.inline
  def apply(previews: Array[baptiste | String]): `13` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[baptiste | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

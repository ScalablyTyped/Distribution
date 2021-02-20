package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[T] extends StObject {
  
  var previews: Array[T | String] = js.native
}
object `0` {
  
  @scala.inline
  def apply[T](previews: Array[T | String]): `0`[T] = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_], T] (val x: Self with `0`[T]) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[T | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}

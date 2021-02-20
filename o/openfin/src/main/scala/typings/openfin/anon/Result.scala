package typings.openfin.anon

import typings.openfin.openfinStrings.clean
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.terminated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var result: clean | terminated | failed = js.native
}
object Result {
  
  @scala.inline
  def apply(result: clean | terminated | failed): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: clean | terminated | failed): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

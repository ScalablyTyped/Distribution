package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalWorkerOptions extends StObject {
  
  var workerSrc: String = js.native
}
object GlobalWorkerOptions {
  
  @scala.inline
  def apply(workerSrc: String): GlobalWorkerOptions = {
    val __obj = js.Dynamic.literal(workerSrc = workerSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkerOptions]
  }
  
  @scala.inline
  implicit class GlobalWorkerOptionsMutableBuilder[Self <: GlobalWorkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerSrc(value: String): Self = StObject.set(x, "workerSrc", value.asInstanceOf[js.Any])
  }
}

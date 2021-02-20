package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Src extends StObject {
  
  var src: js.UndefOr[String] = js.native
}
object Src {
  
  @scala.inline
  def apply(): Src = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Src]
  }
  
  @scala.inline
  implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}

package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefix extends StObject {
  
  var prefix: js.UndefOr[String] = js.native
}
object Prefix {
  
  @scala.inline
  def apply(): Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}

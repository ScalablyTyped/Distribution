package typings.mongodb.anon

import typings.mongodb.mod.MetaSortOperators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  @JSName("$meta")
  var $meta: js.UndefOr[MetaSortOperators] = js.native
}
object Meta {
  
  @scala.inline
  def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$meta(value: MetaSortOperators): Self = StObject.set(x, "$meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$metaUndefined: Self = StObject.set(x, "$meta", js.undefined)
  }
}

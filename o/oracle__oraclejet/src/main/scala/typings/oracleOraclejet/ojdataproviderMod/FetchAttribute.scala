package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchAttribute extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  
  var name: String = js.native
}
object FetchAttribute {
  
  @scala.inline
  def apply(name: String): FetchAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchAttribute]
  }
  
  @scala.inline
  implicit class FetchAttributeMutableBuilder[Self <: FetchAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

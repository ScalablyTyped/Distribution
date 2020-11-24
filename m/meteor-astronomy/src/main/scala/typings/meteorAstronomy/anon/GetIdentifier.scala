package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentifier extends js.Object {
  
  def getIdentifier(identifier: js.Any): String = js.native
  
  def getValues(): js.Array[_] = js.native
}
object GetIdentifier {
  
  @scala.inline
  def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): GetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
    __obj.asInstanceOf[GetIdentifier]
  }
  
  @scala.inline
  implicit class GetIdentifierOps[Self <: GetIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetIdentifier(value: js.Any => String): Self = this.set("getIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValues(value: () => js.Array[_]): Self = this.set("getValues", js.Any.fromFunction0(value))
  }
}

package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of SODA operation.replaceOne();
  */
@js.native
trait SodaReplaceOneResult extends js.Object {
  
  /** This attribute will be true if the document was successfully replaced, false otherwise. */
  var replaced: Boolean = js.native
}
object SodaReplaceOneResult {
  
  @scala.inline
  def apply(replaced: Boolean): SodaReplaceOneResult = {
    val __obj = js.Dynamic.literal(replaced = replaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaReplaceOneResult]
  }
  
  @scala.inline
  implicit class SodaReplaceOneResultOps[Self <: SodaReplaceOneResult] (val x: Self) extends AnyVal {
    
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
    def setReplaced(value: Boolean): Self = this.set("replaced", value.asInstanceOf[js.Any])
  }
}

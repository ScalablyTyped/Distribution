package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchResult extends js.Object {
  
  /**
    * A normalized form of the spec passed in as an argument.
    */
  var from: String = js.native
  
  /**
    * The integrity value for the package artifact.
    */
  var integrity: String = js.native
  
  /**
    * The tarball url or file path where the package artifact can be found.
    */
  var resolved: String = js.native
}
object FetchResult {
  
  @scala.inline
  def apply(from: String, integrity: String, resolved: String): FetchResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResult]
  }
  
  @scala.inline
  implicit class FetchResultOps[Self <: FetchResult] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolved(value: String): Self = this.set("resolved", value.asInstanceOf[js.Any])
  }
}

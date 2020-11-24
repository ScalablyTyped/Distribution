package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedRanges extends js.Object {
  
  /** The name that all the named ranges share. */
  var name: js.UndefOr[String] = js.native
  
  /** The NamedRanges that share the same name. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.native
}
object NamedRanges {
  
  @scala.inline
  def apply(): NamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedRanges]
  }
  
  @scala.inline
  implicit class NamedRangesOps[Self <: NamedRanges] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamedRangesVarargs(value: NamedRange*): Self = this.set("namedRanges", js.Array(value :_*))
    
    @scala.inline
    def setNamedRanges(value: js.Array[NamedRange]): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
  }
}

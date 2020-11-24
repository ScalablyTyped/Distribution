package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealmSelector extends js.Object {
  
  /** List of realms to match. */
  var realms: js.UndefOr[js.Array[String]] = js.native
}
object RealmSelector {
  
  @scala.inline
  def apply(): RealmSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealmSelector]
  }
  
  @scala.inline
  implicit class RealmSelectorOps[Self <: RealmSelector] (val x: Self) extends AnyVal {
    
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
    def setRealmsVarargs(value: String*): Self = this.set("realms", js.Array(value :_*))
    
    @scala.inline
    def setRealms(value: js.Array[String]): Self = this.set("realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealms: Self = this.set("realms", js.undefined)
  }
}

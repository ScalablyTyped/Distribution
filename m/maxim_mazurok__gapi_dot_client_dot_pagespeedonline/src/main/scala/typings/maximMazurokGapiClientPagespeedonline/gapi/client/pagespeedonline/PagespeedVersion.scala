package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagespeedVersion extends js.Object {
  
  /** The major version number of PageSpeed used to generate these results. */
  var major: js.UndefOr[String] = js.native
  
  /** The minor version number of PageSpeed used to generate these results. */
  var minor: js.UndefOr[String] = js.native
}
object PagespeedVersion {
  
  @scala.inline
  def apply(): PagespeedVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedVersion]
  }
  
  @scala.inline
  implicit class PagespeedVersionOps[Self <: PagespeedVersion] (val x: Self) extends AnyVal {
    
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
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
  }
}

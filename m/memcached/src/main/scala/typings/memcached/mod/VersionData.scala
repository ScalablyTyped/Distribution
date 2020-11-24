package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionData extends StatusData {
  
  var bugfix: String = js.native
  
  var major: String = js.native
  
  var minor: String = js.native
  
  var version: String = js.native
}
object VersionData {
  
  @scala.inline
  def apply(bugfix: String, major: String, minor: String, version: String): VersionData = {
    val __obj = js.Dynamic.literal(bugfix = bugfix.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionData]
  }
  
  @scala.inline
  implicit class VersionDataOps[Self <: VersionData] (val x: Self) extends AnyVal {
    
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
    def setBugfix(value: String): Self = this.set("bugfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

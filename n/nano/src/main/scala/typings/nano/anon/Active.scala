package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends js.Object {
  
  // The size of live data inside the database, in bytes.
  var active: Double = js.native
  
  // The uncompressed size of database contents in bytes.
  var external: Double = js.native
  
  // The size of the database file on disk in bytes. Views indexes
  var file: Double = js.native
}
object Active {
  
  @scala.inline
  def apply(active: Double, external: Double, file: Double): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: Double): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: Double): Self = this.set("file", value.asInstanceOf[js.Any])
  }
}

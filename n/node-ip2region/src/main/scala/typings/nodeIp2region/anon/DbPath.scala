package typings.nodeIp2region.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbPath extends js.Object {
  
  var dbPath: String = js.native
}
object DbPath {
  
  @scala.inline
  def apply(dbPath: String): DbPath = {
    val __obj = js.Dynamic.literal(dbPath = dbPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbPath]
  }
  
  @scala.inline
  implicit class DbPathOps[Self <: DbPath] (val x: Self) extends AnyVal {
    
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
    def setDbPath(value: String): Self = this.set("dbPath", value.asInstanceOf[js.Any])
  }
}

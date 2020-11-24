package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionError
  extends typings.mongoose.mod.Error {
  
  var modifiedPaths: js.Array[_] = js.native
  
  @JSName("name")
  var name_VersionError: typings.mongoose.mongooseStrings.VersionError = js.native
  
  var version: js.Any = js.native
}
object VersionError {
  
  @scala.inline
  def apply(modifiedPaths: js.Array[_], name: typings.mongoose.mongooseStrings.VersionError, version: js.Any): VersionError = {
    val __obj = js.Dynamic.literal(modifiedPaths = modifiedPaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionError]
  }
  
  @scala.inline
  implicit class VersionErrorOps[Self <: VersionError] (val x: Self) extends AnyVal {
    
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
    def setModifiedPathsVarargs(value: js.Any*): Self = this.set("modifiedPaths", js.Array(value :_*))
    
    @scala.inline
    def setModifiedPaths(value: js.Array[_]): Self = this.set("modifiedPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.mongoose.mongooseStrings.VersionError): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

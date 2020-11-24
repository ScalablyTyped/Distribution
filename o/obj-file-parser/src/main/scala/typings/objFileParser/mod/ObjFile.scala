package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjFile extends js.Object {
  
  var materialLibraries: js.Array[_] = js.native
  
  var models: js.Array[ObjModel] = js.native
}
object ObjFile {
  
  @scala.inline
  def apply(materialLibraries: js.Array[_], models: js.Array[ObjModel]): ObjFile = {
    val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjFile]
  }
  
  @scala.inline
  implicit class ObjFileOps[Self <: ObjFile] (val x: Self) extends AnyVal {
    
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
    def setMaterialLibrariesVarargs(value: js.Any*): Self = this.set("materialLibraries", js.Array(value :_*))
    
    @scala.inline
    def setMaterialLibraries(value: js.Array[_]): Self = this.set("materialLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsVarargs(value: ObjModel*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[ObjModel]): Self = this.set("models", value.asInstanceOf[js.Any])
  }
}

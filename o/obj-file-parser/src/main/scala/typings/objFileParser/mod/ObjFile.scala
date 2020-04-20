package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjFile extends js.Object {
  var materialLibraries: js.Array[_]
  var models: js.Array[ObjModel]
}

object ObjFile {
  @scala.inline
  def apply(materialLibraries: js.Array[_], models: js.Array[ObjModel]): ObjFile = {
    val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjFile]
  }
}


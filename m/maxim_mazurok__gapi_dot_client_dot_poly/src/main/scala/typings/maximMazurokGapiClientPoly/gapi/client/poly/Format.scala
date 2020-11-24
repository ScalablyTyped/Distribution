package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  /** Complexity stats about this representation of the asset. */
  var formatComplexity: js.UndefOr[FormatComplexity] = js.native
  
  /** A short string that identifies the format type of this representation. Possible values are: `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`. */
  var formatType: js.UndefOr[String] = js.native
  
  /** A list of dependencies of the root element. May include, but is not limited to, materials, textures, and shader programs. */
  var resources: js.UndefOr[js.Array[File]] = js.native
  
  /**
    * The root of the file hierarchy. This will always be populated. For some format_types - such as `TILT`, which are self-contained - this is all of the data. Other types - such as
    * `OBJ` - often reference other data elements. These are contained in the resources field.
    */
  var root: js.UndefOr[File] = js.native
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setFormatComplexity(value: FormatComplexity): Self = this.set("formatComplexity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatComplexity: Self = this.set("formatComplexity", js.undefined)
    
    @scala.inline
    def setFormatType(value: String): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: File*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[File]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setRoot(value: File): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}

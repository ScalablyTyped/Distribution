package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends StObject {
  
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
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatComplexity(value: FormatComplexity): Self = StObject.set(x, "formatComplexity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatComplexityUndefined: Self = StObject.set(x, "formatComplexity", js.undefined)
    
    @scala.inline
    def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[File]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: File*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: File): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

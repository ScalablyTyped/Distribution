package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurationfilepath extends StObject {
  
  /** @description Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not present, the default configuration will be used. */
  var configuration_file_path: js.UndefOr[String] = js.undefined
  
  /** @description The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release. */
  var previous_tag_name: js.UndefOr[String] = js.undefined
  
  /** @description The tag name for the release. This can be an existing tag or a new one. */
  var tag_name: String
  
  /** @description Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists. */
  var target_commitish: js.UndefOr[String] = js.undefined
}
object Configurationfilepath {
  
  inline def apply(tag_name: String): Configurationfilepath = {
    val __obj = js.Dynamic.literal(tag_name = tag_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurationfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configurationfilepath] (val x: Self) extends AnyVal {
    
    inline def setConfiguration_file_path(value: String): Self = StObject.set(x, "configuration_file_path", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_file_pathUndefined: Self = StObject.set(x, "configuration_file_path", js.undefined)
    
    inline def setPrevious_tag_name(value: String): Self = StObject.set(x, "previous_tag_name", value.asInstanceOf[js.Any])
    
    inline def setPrevious_tag_nameUndefined: Self = StObject.set(x, "previous_tag_name", js.undefined)
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Homepage extends StObject {
  
  var commit_oid: js.UndefOr[String] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[StringDictionary[js.UndefOr[String]]]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var readme: js.UndefOr[String] = js.undefined
  
  var repo: js.UndefOr[String] = js.undefined
  
  var version_info: js.UndefOr[`531`] = js.undefined
}
object Homepage {
  
  inline def apply(): Homepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homepage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Homepage] (val x: Self) extends AnyVal {
    
    inline def setCommit_oid(value: String): Self = StObject.set(x, "commit_oid", value.asInstanceOf[js.Any])
    
    inline def setCommit_oidUndefined: Self = StObject.set(x, "commit_oid", js.undefined)
    
    inline def setDependencies(value: js.Array[StringDictionary[js.UndefOr[String]]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: StringDictionary[js.UndefOr[String]]*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setMetadata(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setVersion_info(value: `531`): Self = StObject.set(x, "version_info", value.asInstanceOf[js.Any])
    
    inline def setVersion_infoUndefined: Self = StObject.set(x, "version_info", js.undefined)
  }
}

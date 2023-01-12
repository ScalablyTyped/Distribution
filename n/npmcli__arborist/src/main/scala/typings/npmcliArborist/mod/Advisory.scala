package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristStrings.advisory
import typings.npmcliArborist.npmcliArboristStrings.metavuln
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advisory extends StObject {
  
  var dependency: String
  
  var id: String
  
  var name: String
  
  var range: String
  
  var severity: String
  
  var source: String | Double
  
  var title: String
  
  var `type`: advisory | metavuln
  
  var url: String
  
  var versions: js.Array[String]
  
  var vulnerableVersions: js.Array[String]
}
object Advisory {
  
  inline def apply(
    dependency: String,
    id: String,
    name: String,
    range: String,
    severity: String,
    source: String | Double,
    title: String,
    `type`: advisory | metavuln,
    url: String,
    versions: js.Array[String],
    vulnerableVersions: js.Array[String]
  ): Advisory = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], vulnerableVersions = vulnerableVersions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Advisory] (val x: Self) extends AnyVal {
    
    inline def setDependency(value: String): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: advisory | metavuln): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def setVulnerableVersions(value: js.Array[String]): Self = StObject.set(x, "vulnerableVersions", value.asInstanceOf[js.Any])
    
    inline def setVulnerableVersionsVarargs(value: String*): Self = StObject.set(x, "vulnerableVersions", js.Array(value*))
  }
}

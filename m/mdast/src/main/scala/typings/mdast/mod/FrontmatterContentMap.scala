package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrontmatterContentMap extends StObject {
  
  var yaml: YAML
}
object FrontmatterContentMap {
  
  inline def apply(yaml: YAML): FrontmatterContentMap = {
    val __obj = js.Dynamic.literal(yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrontmatterContentMap]
  }
  
  extension [Self <: FrontmatterContentMap](x: Self) {
    
    inline def setYaml(value: YAML): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
  }
}

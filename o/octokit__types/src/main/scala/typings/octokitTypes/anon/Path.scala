package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var count: Double
  
  var path: String
  
  var title: String
  
  var uniques: Double
}
object Path {
  
  @scala.inline
  def apply(count: Double, path: String, title: String, uniques: Double): Path = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}

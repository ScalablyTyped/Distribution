package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paths extends StObject {
  
  var paths: js.UndefOr[js.Array[String]] = js.native
}
object Paths {
  
  @scala.inline
  def apply(): Paths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paths]
  }
  
  @scala.inline
  implicit class PathsMutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}

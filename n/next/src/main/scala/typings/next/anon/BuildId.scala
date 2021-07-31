package typings.next.anon

import typings.next.loadCustomRoutesMod.Rewrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildId extends StObject {
  
  var buildId: String
  
  var modern: Boolean
  
  var rewrites: js.Array[Rewrite]
}
object BuildId {
  
  @scala.inline
  def apply(buildId: String, modern: Boolean, rewrites: js.Array[Rewrite]): BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], modern = modern.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  @scala.inline
  implicit class BuildIdMutableBuilder[Self <: BuildId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
  }
}

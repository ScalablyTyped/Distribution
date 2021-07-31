package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsolutePath extends StObject {
  
  var absolutePath: String
  
  var cacheable: Boolean
  
  var content: js.UndefOr[String] = js.undefined
  
  var hash: String
  
  var sourceMapUrl: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object AbsolutePath {
  
  @scala.inline
  def apply(absolutePath: String, cacheable: Boolean, hash: String, `type`: String): AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
  
  @scala.inline
  implicit class AbsolutePathMutableBuilder[Self <: AbsolutePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

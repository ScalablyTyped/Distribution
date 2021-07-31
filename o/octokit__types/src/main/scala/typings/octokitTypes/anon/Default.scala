package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: Boolean
  
  var id: Double
  
  var inherited: Boolean
  
  var name: String
  
  var runners_url: String
  
  var selected_repositories_url: String
  
  var visibility: String
}
object Default {
  
  @scala.inline
  def apply(
    default: Boolean,
    id: Double,
    inherited: Boolean,
    name: String,
    runners_url: String,
    selected_repositories_url: String,
    visibility: String
  ): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runners_url = runners_url.asInstanceOf[js.Any], selected_repositories_url = selected_repositories_url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners_url(value: String): Self = StObject.set(x, "runners_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}

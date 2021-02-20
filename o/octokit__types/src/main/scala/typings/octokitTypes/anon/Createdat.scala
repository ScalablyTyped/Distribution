package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Createdat extends StObject {
  
  var created_at: String = js.native
  
  var name: String = js.native
  
  var selected_repositories_url: String = js.native
  
  var updated_at: String = js.native
  
  var visibility: String = js.native
}
object Createdat {
  
  @scala.inline
  def apply(
    created_at: String,
    name: String,
    selected_repositories_url: String,
    updated_at: String,
    visibility: String
  ): Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected_repositories_url = selected_repositories_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
  
  @scala.inline
  implicit class CreatedatMutableBuilder[Self <: Createdat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}

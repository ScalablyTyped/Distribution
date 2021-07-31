package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createdby extends StObject {
  
  var created_at: String
  
  var created_by: String
  
  var curated: Boolean
  
  var description: String
  
  var display_name: String
  
  var featured: Boolean
  
  var name: String
  
  var released: String
  
  var score: Double
  
  var short_description: String
  
  var updated_at: String
}
object Createdby {
  
  @scala.inline
  def apply(
    created_at: String,
    created_by: String,
    curated: Boolean,
    description: String,
    display_name: String,
    featured: Boolean,
    name: String,
    released: String,
    score: Double,
    short_description: String,
    updated_at: String
  ): Createdby = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], curated = curated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdby]
  }
  
  @scala.inline
  implicit class CreatedbyMutableBuilder[Self <: Createdby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurated(value: Boolean): Self = StObject.set(x, "curated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_description(value: String): Self = StObject.set(x, "short_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Createdby extends js.Object {
  
  var created_at: String = js.native
  
  var created_by: String = js.native
  
  var curated: Boolean = js.native
  
  var description: String = js.native
  
  var display_name: String = js.native
  
  var featured: Boolean = js.native
  
  var name: String = js.native
  
  var released: String = js.native
  
  var score: Double = js.native
  
  var short_description: String = js.native
  
  var updated_at: String = js.native
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
  implicit class CreatedbyOps[Self <: Createdby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_by(value: String): Self = this.set("created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurated(value: Boolean): Self = this.set("curated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleased(value: String): Self = this.set("released", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_description(value: String): Self = this.set("short_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
}

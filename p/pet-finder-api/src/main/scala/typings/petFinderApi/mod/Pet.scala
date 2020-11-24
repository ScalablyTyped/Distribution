package typings.petFinderApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pet extends js.Object {
  
  var age: String = js.native
  
  var animal: String = js.native
  
  var breeds: js.Array[String] = js.native
  
  var contact: Contact = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var media: js.Any = js.native
  
  var mix: String = js.native
  
  var name: String = js.native
  
  var options: js.Array[String] = js.native
  
  var sex: String = js.native
  
  var shelterId: String = js.native
  
  var shelterPetId: String = js.native
  
  var size: String = js.native
  
  var status: String = js.native
}
object Pet {
  
  @scala.inline
  def apply(
    age: String,
    animal: String,
    breeds: js.Array[String],
    contact: Contact,
    description: String,
    id: Double,
    media: js.Any,
    mix: String,
    name: String,
    options: js.Array[String],
    sex: String,
    shelterId: String,
    shelterPetId: String,
    size: String,
    status: String
  ): Pet = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], animal = animal.asInstanceOf[js.Any], breeds = breeds.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sex = sex.asInstanceOf[js.Any], shelterId = shelterId.asInstanceOf[js.Any], shelterPetId = shelterPetId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pet]
  }
  
  @scala.inline
  implicit class PetOps[Self <: Pet] (val x: Self) extends AnyVal {
    
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
    def setAge(value: String): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimal(value: String): Self = this.set("animal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreedsVarargs(value: String*): Self = this.set("breeds", js.Array(value :_*))
    
    @scala.inline
    def setBreeds(value: js.Array[String]): Self = this.set("breeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: js.Any): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMix(value: String): Self = this.set("mix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSex(value: String): Self = this.set("sex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShelterId(value: String): Self = this.set("shelterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShelterPetId(value: String): Self = this.set("shelterPetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}

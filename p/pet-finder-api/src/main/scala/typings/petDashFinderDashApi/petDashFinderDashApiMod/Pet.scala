package typings.petDashFinderDashApi.petDashFinderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pet extends js.Object {
  var age: String
  var animal: String
  var breeds: js.Array[String]
  var contact: Contact
  var description: String
  var id: Double
  var media: js.Any
  var mix: String
  var name: String
  var options: js.Array[String]
  var sex: String
  var shelterId: String
  var shelterPetId: String
  var size: String
  var status: String
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
}


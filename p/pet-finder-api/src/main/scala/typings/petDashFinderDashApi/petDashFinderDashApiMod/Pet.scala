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
    val __obj = js.Dynamic.literal(age = age, animal = animal, breeds = breeds, contact = contact, description = description, id = id, media = media, mix = mix, name = name, options = options, sex = sex, shelterId = shelterId, shelterPetId = shelterPetId, size = size, status = status)
  
    __obj.asInstanceOf[Pet]
  }
}


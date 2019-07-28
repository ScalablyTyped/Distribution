package typings.passportDashNaver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Age extends js.Object {
  var age: Double
  var birthday: js.Any
  var email: String
  var id: String
  var nickname: String
  var profile_image: String
}

object Anon_Age {
  @scala.inline
  def apply(age: Double, birthday: js.Any, email: String, id: String, nickname: String, profile_image: String): Anon_Age = {
    val __obj = js.Dynamic.literal(age = age, birthday = birthday, email = email, id = id, nickname = nickname, profile_image = profile_image)
  
    __obj.asInstanceOf[Anon_Age]
  }
}


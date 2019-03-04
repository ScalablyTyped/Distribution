package typings
package passportDashNaverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Age extends js.Object {
  var age: scala.Double
  var birthday: js.Any
  var email: java.lang.String
  var id: java.lang.String
  var nickname: java.lang.String
  var profile_image: java.lang.String
}

object Anon_Age {
  @scala.inline
  def apply(
    age: scala.Double,
    birthday: js.Any,
    email: java.lang.String,
    id: java.lang.String,
    nickname: java.lang.String,
    profile_image: java.lang.String
  ): Anon_Age = {
    val __obj = js.Dynamic.literal(age = age, birthday = birthday, email = email, id = id, nickname = nickname, profile_image = profile_image)
  
    __obj.asInstanceOf[Anon_Age]
  }
}


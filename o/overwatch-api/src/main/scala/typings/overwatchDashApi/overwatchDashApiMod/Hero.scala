package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hero extends js.Object {
  var hero: String
  var img: String
}

object Hero {
  @scala.inline
  def apply(hero: String, img: String): Hero = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Hero]
  }
}


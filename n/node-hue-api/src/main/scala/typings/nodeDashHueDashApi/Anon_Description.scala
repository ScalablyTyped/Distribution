package typings.nodeDashHueDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: String
  var name: String
  var number: String
  var serial: String
  var udn: String
}

object Anon_Description {
  @scala.inline
  def apply(description: String, name: String, number: String, serial: String, udn: String): Anon_Description = {
    val __obj = js.Dynamic.literal(description = description, name = name, number = number, serial = serial, udn = udn)
  
    __obj.asInstanceOf[Anon_Description]
  }
}


package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraditionalFolder extends js.Object {
  val ID: Double
  val Name: String
}

object ITraditionalFolder {
  @scala.inline
  def apply(ID: Double, Name: String): ITraditionalFolder = {
    val __obj = js.Dynamic.literal(ID = ID, Name = Name)
  
    __obj.asInstanceOf[ITraditionalFolder]
  }
}


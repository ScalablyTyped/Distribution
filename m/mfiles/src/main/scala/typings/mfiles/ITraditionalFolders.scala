package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraditionalFolders extends js.Object {
  val Count: Double
  def Item(Index: Double): ITraditionalFolder
}

object ITraditionalFolders {
  @scala.inline
  def apply(Count: Double, Item: Double => ITraditionalFolder): ITraditionalFolders = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[ITraditionalFolders]
  }
}


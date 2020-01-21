package typings.nodeMemwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeMemwatchStrings {
  @js.native
  sealed trait leak extends js.Object
  
  @js.native
  sealed trait stats extends js.Object
  
  @scala.inline
  def leak: leak = "leak".asInstanceOf[leak]
  @scala.inline
  def stats: stats = "stats".asInstanceOf[stats]
}


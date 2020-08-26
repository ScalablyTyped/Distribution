package typings.meteor.global

import org.scalablytyped.runtime.TopLevel
import typings.meteor.EJSONable
import typings.meteor.ReactiveDictStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReactiveDict")
@js.native
class ReactiveDict ()
  extends typings.meteor.ReactiveDict {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], initialValue: EJSONable) = this()
  def this(name: String, initialValue: EJSONable) = this()
}

@JSGlobal("ReactiveDict")
@js.native
object ReactiveDict extends TopLevel[ReactiveDictStatic]


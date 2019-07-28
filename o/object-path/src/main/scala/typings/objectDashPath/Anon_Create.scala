package typings.objectDashPath

import typings.objectDashPath.objectDashPathMod.ObjectPathBound
import typings.objectDashPath.objectDashPathMod.ObjectPathStatic
import typings.objectDashPath.objectDashPathMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  @JSName("withInheritedProps")
  var withInheritedProps_Original: ObjectPathStatic = js.native
  def create(): ObjectPathStatic = js.native
  def create(options: Options): ObjectPathStatic = js.native
  /**
    * Binds an object
    */
  def withInheritedProps[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
}


package typings.objectPath

import typings.objectPath.mod.ObjectPathBound
import typings.objectPath.mod.ObjectPathStatic
import typings.objectPath.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  @JSName("withInheritedProps")
  var withInheritedProps_Original: ObjectPathStatic = js.native
  def create(): ObjectPathStatic = js.native
  def create(options: Options): ObjectPathStatic = js.native
  /**
    * Binds an object
    */
  def withInheritedProps[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
}


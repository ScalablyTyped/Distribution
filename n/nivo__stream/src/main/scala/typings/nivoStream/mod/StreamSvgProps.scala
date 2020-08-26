package typings.nivoStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nivoCore.mod.MotionProps because var conflicts: animate, motionDamping, motionStiffness. Inlined  */ @js.native
trait StreamSvgProps[T] extends StreamProps[T]

object StreamSvgProps {
  @scala.inline
  def apply[T](data: js.Array[T], keys: js.Array[String]): StreamSvgProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSvgProps[T]]
  }
}


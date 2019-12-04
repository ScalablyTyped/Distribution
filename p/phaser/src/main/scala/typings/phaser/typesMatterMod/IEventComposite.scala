package typings.phaser.typesMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventComposite[T] extends IEvent[T] {
  /**
    * EventObjects (may be a single body, constraint, composite or a mixed array of these)
    */
  var `object`: js.Any
}

object IEventComposite {
  @scala.inline
  def apply[T](name: String, `object`: js.Any, source: T): IEventComposite[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventComposite[T]]
  }
}


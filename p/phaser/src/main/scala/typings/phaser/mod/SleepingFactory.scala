package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter", "SleepingFactory")
@js.native
class SleepingFactory ()
  extends typings.phaser.MatterJS.SleepingFactory {
  /* CompleteClass */
  override def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}


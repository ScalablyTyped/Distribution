package typings.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BitmapText {
  import typings.phaser.Anon_Align
  import typings.phaser.Anon_False
  import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
  import typings.phaser.Phaser.Types.GameObjects.JSONGameObject

  type BitmapTextConfig = GameObjectConfig with Anon_False
  type DisplayCallback = js.Function1[/* display */ DisplayCallbackConfig, Unit]
  type JSONBitmapText = JSONGameObject with Anon_Align
}

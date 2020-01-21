package typings.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BitmapText {
  type BitmapTextConfig = typings.phaser.Phaser.Types.GameObjects.GameObjectConfig with typings.phaser.AnonFalse
  type DisplayCallback = js.Function1[
    /* display */ typings.phaser.Phaser.Types.GameObjects.BitmapText.DisplayCallbackConfig, 
    scala.Unit
  ]
  type JSONBitmapText = typings.phaser.Phaser.Types.GameObjects.JSONGameObject with typings.phaser.AnonAlign
}

package typings.phaser.PhaserNs.TypesNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BitmapTextNs {
  import typings.phaser.Anon_Align
  import typings.phaser.Anon_False
  import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GameObjectConfig
  import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.JSONGameObject

  type BitmapTextConfig = GameObjectConfig with Anon_False
  type DisplayCallback = js.Function1[/* display */ DisplayCallbackConfig, Unit]
  type JSONBitmapText = JSONGameObject with Anon_Align
}

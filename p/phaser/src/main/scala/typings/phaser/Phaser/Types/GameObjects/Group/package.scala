package typings.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Group {
  
  type GroupCallback = js.Function1[/* item */ typings.phaser.Phaser.GameObjects.GameObject, scala.Unit]
  
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[typings.phaser.Phaser.GameObjects.GameObject], scala.Unit]
}

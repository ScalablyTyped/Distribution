package typings
package phaserLib.PhaserNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Core")
@js.native
object ^ extends js.Object {
  /**
    * Called automatically by Phaser.Game and responsible for creating the renderer it will use.
    * 
    * Relies upon two webpack global flags to be defined: `WEBGL_RENDERER` and `CANVAS_RENDERER` during build time, but not at run-time.
    * @param game The Phaser.Game instance on which the renderer will be set.
    */
  def CreateRenderer(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
  /**
    * Called automatically by Phaser.Game and responsible for creating the console.log debug header.
    * 
    * You can customize or disable the header via the Game Config object.
    * @param game The Phaser.Game instance which will output this debug header.
    */
  def DebugHeader(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
  /**
    * The Visibility Handler is responsible for listening out for document level visibility change events.
    * This includes `visibilitychange` if the browser supports it, and blur and focus events. It then uses
    * the provided Event Emitter and fires the related events.
    * @param game The Game instance this Visibility Handler is working on.
    */
  def VisibilityHandler(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
}


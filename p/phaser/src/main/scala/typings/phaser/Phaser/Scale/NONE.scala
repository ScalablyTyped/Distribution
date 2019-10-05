package typings.phaser.Phaser.Scale

import org.scalablytyped.runtime.TopLevel
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
  * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
  * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
  */
@JSGlobal("Phaser.Scale.NONE")
@js.native
object NONE extends TopLevel[integer]


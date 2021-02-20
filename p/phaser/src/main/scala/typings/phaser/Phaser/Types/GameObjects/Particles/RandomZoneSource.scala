package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Math.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomZoneSource extends StObject {
  
  /**
    * A function modifying its point argument.
    */
  def getRandomPoint(point: Vector2): Unit = js.native
  /**
    * A function modifying its point argument.
    */
  @JSName("getRandomPoint")
  var getRandomPoint_Original: RandomZoneSourceCallback = js.native
}

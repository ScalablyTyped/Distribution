package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeZoneSource extends StObject {
  
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: integer): Unit = js.native
  def getPoints(quantity: integer, stepRate: Double): Unit = js.native
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback = js.native
}

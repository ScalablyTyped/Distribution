package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EmitterOpOnUpdateType extends StObject
object _EmitterOpOnUpdateType {
  
  @scala.inline
  def EmitterOpCustomUpdateConfig(onUpdate: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig = {
    val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction4(onUpdate))
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig]
  }
  
  @scala.inline
  def EmitterOpEaseConfig(end: Double, start: Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig]
  }
}

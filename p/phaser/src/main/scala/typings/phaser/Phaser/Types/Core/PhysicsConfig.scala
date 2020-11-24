package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsConfig extends js.Object {
  
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[ArcadeWorldConfig] = js.native
  
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[MatterWorldConfig] = js.native
}
object PhysicsConfig {
  
  @scala.inline
  def apply(): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsConfig]
  }
  
  @scala.inline
  implicit class PhysicsConfigOps[Self <: PhysicsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArcade(value: ArcadeWorldConfig): Self = this.set("arcade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArcade: Self = this.set("arcade", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setMatter(value: MatterWorldConfig): Self = this.set("matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatter: Self = this.set("matter", js.undefined)
  }
}

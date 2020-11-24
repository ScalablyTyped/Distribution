package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerConfig extends js.Object {
  
  /**
    * The background colors of the banner.
    */
  var background: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Omit Phaser's name and version from the banner.
    */
  var hidePhaser: js.UndefOr[Boolean] = js.native
  
  /**
    * The color of the banner text.
    */
  var text: js.UndefOr[String] = js.native
}
object BannerConfig {
  
  @scala.inline
  def apply(): BannerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerConfig]
  }
  
  @scala.inline
  implicit class BannerConfigOps[Self <: BannerConfig] (val x: Self) extends AnyVal {
    
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
    def setBackgroundVarargs(value: String*): Self = this.set("background", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: js.Array[String]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setHidePhaser(value: Boolean): Self = this.set("hidePhaser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePhaser: Self = this.set("hidePhaser", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

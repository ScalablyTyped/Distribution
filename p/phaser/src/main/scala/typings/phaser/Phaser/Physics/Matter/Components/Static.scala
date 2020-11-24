package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for getting and setting the static state of a physics body.
  */
@js.native
trait Static extends js.Object {
  
  /**
    * Returns `true` if the body is static, otherwise `false` for a dynamic body.
    */
  def isStatic(): Boolean = js.native
  
  /**
    * Changes the physics body to be either static `true` or dynamic `false`.
    * @param value `true` to set the body as being static, or `false` to make it dynamic.
    */
  def setStatic(value: Boolean): GameObject = js.native
}
object Static {
  
  @scala.inline
  def apply(isStatic: () => Boolean, setStatic: Boolean => GameObject): Static = {
    val __obj = js.Dynamic.literal(isStatic = js.Any.fromFunction0(isStatic), setStatic = js.Any.fromFunction1(setStatic))
    __obj.asInstanceOf[Static]
  }
  
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    
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
    def setIsStatic(value: () => Boolean): Self = this.set("isStatic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStatic(value: Boolean => GameObject): Self = this.set("setStatic", js.Any.fromFunction1(value))
  }
}

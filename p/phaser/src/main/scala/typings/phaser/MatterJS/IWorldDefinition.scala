package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorldDefinition extends ICompositeDefinition {
  
  var bounds: js.UndefOr[IBound] = js.native
  
  var gravity: js.UndefOr[Gravity] = js.native
}
object IWorldDefinition {
  
  @scala.inline
  def apply(): IWorldDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWorldDefinition]
  }
  
  @scala.inline
  implicit class IWorldDefinitionMutableBuilder[Self <: IWorldDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: IBound): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setGravity(value: Gravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
  }
}

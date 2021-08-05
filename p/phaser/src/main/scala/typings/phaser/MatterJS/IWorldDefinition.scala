package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorldDefinition
  extends StObject
     with ICompositeDefinition {
  
  var bounds: js.UndefOr[IBound] = js.undefined
  
  var gravity: js.UndefOr[Gravity] = js.undefined
}
object IWorldDefinition {
  
  inline def apply(): IWorldDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWorldDefinition]
  }
  
  extension [Self <: IWorldDefinition](x: Self) {
    
    inline def setBounds(value: IBound): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setGravity(value: Gravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
  }
}

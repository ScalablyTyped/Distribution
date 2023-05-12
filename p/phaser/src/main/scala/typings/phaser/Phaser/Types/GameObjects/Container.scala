package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  trait ContainerConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * An optional array of Game Objects to add to the Container.
      */
    var children: js.UndefOr[js.Array[GameObject]] = js.undefined
  }
  object ContainerConfig {
    
    inline def apply(): ContainerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerConfig] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[GameObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: GameObject*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
}

package typings.pixiSpritesheet

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiSpritesheet.mod.Spritesheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait LoaderResource extends StObject {
    
    /** Reference to Spritesheet object created. */
    var spritesheet: js.UndefOr[Spritesheet] = js.undefined
    
    /** Dictionary of textures from Spritesheet. */
    var textures: js.UndefOr[StringDictionary[Texture[Resource]]] = js.undefined
  }
  object LoaderResource {
    
    inline def apply(): LoaderResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderResource]
    }
    
    extension [Self <: LoaderResource](x: Self) {
      
      inline def setSpritesheet(value: Spritesheet): Self = StObject.set(x, "spritesheet", value.asInstanceOf[js.Any])
      
      inline def setSpritesheetUndefined: Self = StObject.set(x, "spritesheet", js.undefined)
      
      inline def setTextures(value: StringDictionary[Texture[Resource]]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
      
      inline def setTexturesUndefined: Self = StObject.set(x, "textures", js.undefined)
    }
  }
}

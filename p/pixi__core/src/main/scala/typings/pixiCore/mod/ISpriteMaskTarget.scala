package typings.pixiCore.mod

import typings.pixiMath.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteMaskTarget
  extends StObject
     with IMaskTarget {
  
  var _texture: Texture[Resource] = js.native
  
  var anchor: Point = js.native
  
  var worldAlpha: Double = js.native
}

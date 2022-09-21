package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerElement
  extends StObject
     with BaseTileElement {
  
  var bannerIndex: Double
  
  var direction: Direction
}
object BannerElement {
  
  inline def apply(
    bannerIndex: Double,
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    direction: Direction,
    isGhost: Boolean,
    isHidden: Boolean,
    occupiedQuadrants: Double,
    `type`: TileElementType
  ): BannerElement = {
    val __obj = js.Dynamic.literal(bannerIndex = bannerIndex.asInstanceOf[js.Any], baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerElement]
  }
  
  extension [Self <: BannerElement](x: Self) {
    
    inline def setBannerIndex(value: Double): Self = StObject.set(x, "bannerIndex", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}

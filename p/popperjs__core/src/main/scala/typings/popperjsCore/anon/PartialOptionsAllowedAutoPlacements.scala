package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/flip.Options> */
trait PartialOptionsAllowedAutoPlacements extends StObject {
  
  var allowedAutoPlacements: js.UndefOr[js.Array[typings.popperjsCore.enumsMod.Placement]] = js.undefined
  
  var altAxis: js.UndefOr[Boolean] = js.undefined
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[Boundary] = js.undefined
  
  var fallbackPlacements: js.UndefOr[js.Array[typings.popperjsCore.enumsMod.Placement]] = js.undefined
  
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object PartialOptionsAllowedAutoPlacements {
  
  inline def apply(): PartialOptionsAllowedAutoPlacements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAllowedAutoPlacements]
  }
  
  extension [Self <: PartialOptionsAllowedAutoPlacements](x: Self) {
    
    inline def setAllowedAutoPlacements(value: js.Array[typings.popperjsCore.enumsMod.Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
    
    inline def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
    
    inline def setAllowedAutoPlacementsVarargs(value: typings.popperjsCore.enumsMod.Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value :_*))
    
    inline def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    inline def setAltAxisUndefined: Self = StObject.set(x, "altAxis", js.undefined)
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
    
    inline def setFallbackPlacements(value: js.Array[typings.popperjsCore.enumsMod.Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
    
    inline def setFallbackPlacementsUndefined: Self = StObject.set(x, "fallbackPlacements", js.undefined)
    
    inline def setFallbackPlacementsVarargs(value: typings.popperjsCore.enumsMod.Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value :_*))
    
    inline def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
    
    inline def setFlipVariationsUndefined: Self = StObject.set(x, "flipVariations", js.undefined)
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}

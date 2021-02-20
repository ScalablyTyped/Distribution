package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.Context
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/utils/detectOverflow.Options> */
@js.native
trait PartialOptions extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[Boundary] = js.native
  
  var elementContext: js.UndefOr[Context] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.native
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    @scala.inline
    def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
    
    @scala.inline
    def setElementContext(value: Context): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}

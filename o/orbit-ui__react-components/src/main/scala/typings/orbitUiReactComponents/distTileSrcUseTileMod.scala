package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Markup
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.checkable
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.link
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileSrcUseTileMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/useTile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTile(hasVariantOrientationActiveFocusHoverChildren: UseTileProps): Markup = ^.asInstanceOf[js.Dynamic].applyDynamic("useTile")(hasVariantOrientationActiveFocusHoverChildren.asInstanceOf[js.Any]).asInstanceOf[Markup]
  
  trait UseTileProps
    extends StObject
       with InteractionStatesProps {
    
    var children: ReactNode
    
    var orientation: horizontal | vertical
    
    var variant: checkable | link
  }
  object UseTileProps {
    
    inline def apply(orientation: horizontal | vertical, variant: checkable | link): UseTileProps = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTileProps]
    }
    
    extension [Self <: UseTileProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: checkable | link): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}

package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcTileMod.InnerTileProps
import typings.orbitUiReactComponents.tileGroupMod.InnerTileGroupProps
import typings.orbitUiReactComponents.tileLinkMod.InnerTileLinkProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTile(props: InnerTileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTile")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileGroup(
    hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest: InnerTileGroupProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileGroup")(hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileLink(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest: InnerTileLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileLink")(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tile", "Tile")
  @js.native
  val Tile: OrbitComponent[HTMLElement, InnerTileProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tile", "TileGroup")
  @js.native
  val TileGroup: OrbitComponent[HTMLElement, InnerTileGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tile", "TileLink")
  @js.native
  val TileLink: OrbitComponent[HTMLElement, InnerTileLinkProps] = js.native
}

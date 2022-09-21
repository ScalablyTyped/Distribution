package typings.nivoTreemap

import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoColors.ordinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoTreemap.anon.ComputedNodeWithoutStyles
import typings.nivoTreemap.anon.OmitComputedNodeWithoutSt
import typings.nivoTreemap.anon.OmitComputedNodeWithoutStData
import typings.nivoTreemap.anon.PartialAnimationConfig
import typings.nivoTreemap.nivoTreemapStrings.binary
import typings.nivoTreemap.nivoTreemapStrings.bottom
import typings.nivoTreemap.nivoTreemapStrings.dice
import typings.nivoTreemap.nivoTreemapStrings.left
import typings.nivoTreemap.nivoTreemapStrings.right
import typings.nivoTreemap.nivoTreemapStrings.slice
import typings.nivoTreemap.nivoTreemapStrings.sliceDice
import typings.nivoTreemap.nivoTreemapStrings.squarify
import typings.nivoTreemap.nivoTreemapStrings.top
import typings.nivoTreemap.tilingMod.TileType
import typings.nivoTreemap.typesMod.DefaultTreeMapDatum
import typings.nivoTreemap.typesMod.LayerId
import typings.nivoTreemap.typesMod.NodeProps
import typings.nivoTreemap.typesMod.TooltipComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.colorBy")
    @js.native
    def colorBy: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colorBy_=(
      x: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "canvasDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.TreeMapCommonProps<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum>, 'valueFormat' | 'margin' | 'theme' | 'labelFormat' | 'onMouseEnter' | 'onMouseMove' | 'onMouseLeave' | 'onClick' | 'renderWrapper' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  layers :std.Array<@nivo/treemap.@nivo/treemap/dist/types/types.LayerId>} */
  object commonDefaultProps {
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.colorBy")
    @js.native
    def colorBy: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colorBy_=(
      x: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.native
    inline def motionConfig_=(
      x: js.UndefOr[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.tile")
    @js.native
    def tile: TileType = js.native
    inline def tile_=(x: TileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "commonDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object htmlDefaultProps {
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.colorBy")
    @js.native
    def colorBy: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colorBy_=(
      x: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[Datum /* <: js.Object */](hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize: NodeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "htmlDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.colorBy")
    @js.native
    def colorBy: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colorBy_=(
      x: String | DatumIdentityAccessor[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[typings.nivoTreemap.typesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[Datum /* <: js.Object */](hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize: NodeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap/dist/types/defaults", "svgDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
}

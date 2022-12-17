package typings.nivoTreemap

import typings.d3Hierarchy.mod.HierarchyRectangularNode
import typings.d3Hierarchy.mod.RatioSquarifyTilingFactory
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoTreemap.anon.ComputedNodeWithoutStyles
import typings.nivoTreemap.anon.OmitComputedNodeWithoutSt
import typings.nivoTreemap.anon.OmitComputedNodeWithoutStData
import typings.nivoTreemap.anon.PartialAnimationConfig
import typings.nivoTreemap.distTypesTilingMod.TileType
import typings.nivoTreemap.distTypesTypesMod.DefaultTreeMapDatum
import typings.nivoTreemap.distTypesTypesMod.LayerId
import typings.nivoTreemap.distTypesTypesMod.NodeProps
import typings.nivoTreemap.distTypesTypesMod.TooltipComponent
import typings.nivoTreemap.distTypesTypesMod.TreeMapCanvasProps
import typings.nivoTreemap.distTypesTypesMod.TreeMapHtmlProps
import typings.nivoTreemap.distTypesTypesMod.TreeMapSvgProps
import typings.nivoTreemap.nivoTreemapStrings.binary
import typings.nivoTreemap.nivoTreemapStrings.bottom
import typings.nivoTreemap.nivoTreemapStrings.dice
import typings.nivoTreemap.nivoTreemapStrings.height
import typings.nivoTreemap.nivoTreemapStrings.left
import typings.nivoTreemap.nivoTreemapStrings.right
import typings.nivoTreemap.nivoTreemapStrings.slice
import typings.nivoTreemap.nivoTreemapStrings.sliceDice
import typings.nivoTreemap.nivoTreemapStrings.squarify
import typings.nivoTreemap.nivoTreemapStrings.top
import typings.nivoTreemap.nivoTreemapStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/treemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMap[Datum /* <: js.Object */](props: Omit[TreeMapSvgProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMap")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveTreeMapCanvas[Datum /* <: js.Object */](props: Omit[TreeMapCanvasProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMapCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveTreeMapHtml[Datum /* <: js.Object */](props: Omit[TreeMapHtmlProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMapHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeMap[Datum /* <: js.Object */](param0: TreeMapSvgProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMap")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeMapCanvas[Datum /* <: js.Object */](param0: TreeMapCanvasProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapCanvas")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeMapHtml[Datum /* <: js.Object */](param0: TreeMapHtmlProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapHtml")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/treemap", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.colorBy")
    @js.native
    def colorBy: String | (DatumIdentityAccessor[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ]) = js.native
    inline def colorBy_=(
      x: String | (DatumIdentityAccessor[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "canvasDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@nivo/treemap.@nivo/treemap/dist/types/types.TreeMapCommonProps<@nivo/treemap.@nivo/treemap/dist/types/types.DefaultTreeMapDatum>, 'valueFormat' | 'margin' | 'theme' | 'labelFormat' | 'onMouseEnter' | 'onMouseMove' | 'onMouseLeave' | 'onClick' | 'renderWrapper' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  layers :std.Array<@nivo/treemap.@nivo/treemap/dist/types/types.LayerId>} */
  object commonDefaultProps {
    
    @JSImport("@nivo/treemap", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap", "commonDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.colorBy")
    @js.native
    def colorBy: String | (DatumIdentityAccessor[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ]) = js.native
    inline def colorBy_=(
      x: String | (DatumIdentityAccessor[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap", "commonDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.native
    inline def motionConfig_=(
      x: js.UndefOr[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap", "commonDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.tile")
    @js.native
    def tile: TileType = js.native
    inline def tile_=(x: TileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "commonDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object htmlDefaultProps {
    
    @JSImport("@nivo/treemap", "htmlDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.colorBy")
    @js.native
    def colorBy: String | (DatumIdentityAccessor[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ]) = js.native
    inline def colorBy_=(
      x: String | (DatumIdentityAccessor[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[Datum /* <: js.Object */](param0: NodeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "htmlDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def htmlLabelTransform(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    rotation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def htmlNodeTransform(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlNodeTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def htmlParentLabelTransform(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    rotation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlParentLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object svgDefaultProps {
    
    @JSImport("@nivo/treemap", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/treemap", "svgDefaultProps.animate")
    @js.native
    def animate: js.UndefOr[Boolean] = js.native
    inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def borderColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.colorBy")
    @js.native
    def colorBy: String | (DatumIdentityAccessor[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ]) = js.native
    inline def colorBy_=(
      x: String | (DatumIdentityAccessor[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[
        typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
      ] = js.native
    inline def colors_=(
      x: OrdinalColorScaleConfig[
          typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles[DefaultTreeMapDatum]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.enableParentLabel")
    @js.native
    def enableParentLabel: Boolean = js.native
    inline def enableParentLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableParentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.identity")
    @js.native
    def identity: PropertyAccessor[DefaultTreeMapDatum, String] = js.native
    inline def identity_=(x: PropertyAccessor[DefaultTreeMapDatum, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.innerPadding")
    @js.native
    def innerPadding: Double = js.native
    inline def innerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedNodeWithoutStData, String] = js.native
    
    @JSImport("@nivo/treemap", "svgDefaultProps.labelSkipSize")
    @js.native
    def labelSkipSize: Double = js.native
    inline def labelSkipSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSkipSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedNodeWithoutStData, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.leavesOnly")
    @js.native
    def leavesOnly: Boolean = js.native
    inline def leavesOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: js.UndefOr[String | PartialAnimationConfig] = js.native
    inline def motionConfig_=(x: js.UndefOr[String | PartialAnimationConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[Datum /* <: js.Object */](param0: NodeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/treemap", "svgDefaultProps.nodeOpacity")
    @js.native
    def nodeOpacity: Double = js.native
    inline def nodeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.orientLabel")
    @js.native
    def orientLabel: Boolean = js.native
    inline def orientLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.outerPadding")
    @js.native
    def outerPadding: Double = js.native
    inline def outerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.parentLabel")
    @js.native
    def parentLabel: PropertyAccessor[OmitComputedNodeWithoutSt, String] = js.native
    
    @JSImport("@nivo/treemap", "svgDefaultProps.parentLabelPadding")
    @js.native
    def parentLabelPadding: Double = js.native
    inline def parentLabelPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.parentLabelPosition")
    @js.native
    def parentLabelPosition: top | right | bottom | left = js.native
    inline def parentLabelPosition_=(x: top | right | bottom | left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.parentLabelSize")
    @js.native
    def parentLabelSize: Double = js.native
    inline def parentLabelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.parentLabelTextColor")
    @js.native
    def parentLabelTextColor: InheritedColorConfig[ComputedNodeWithoutStyles] = js.native
    inline def parentLabelTextColor_=(x: InheritedColorConfig[ComputedNodeWithoutStyles]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabelTextColor")(x.asInstanceOf[js.Any])
    
    inline def parentLabel_=(x: PropertyAccessor[OmitComputedNodeWithoutSt, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.tile")
    @js.native
    def tile: binary | dice | slice | sliceDice | squarify = js.native
    inline def tile_=(x: binary | dice | slice | sliceDice | squarify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultTreeMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultTreeMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/treemap", "svgDefaultProps.value")
    @js.native
    def value: PropertyAccessor[DefaultTreeMapDatum, Double] = js.native
    inline def value_=(x: PropertyAccessor[DefaultTreeMapDatum, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def svgLabelTransform(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    rotation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("svgLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def svgNodeTransform(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("svgNodeTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object tileByType {
    
    @JSImport("@nivo/treemap", "tileByType.binary")
    @js.native
    val binary: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap", "tileByType.dice")
    @js.native
    val dice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap", "tileByType.slice")
    @js.native
    val slice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap", "tileByType.sliceDice")
    @js.native
    val sliceDice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap", "tileByType.squarify")
    @js.native
    val squarify: RatioSquarifyTilingFactory = js.native
  }
}

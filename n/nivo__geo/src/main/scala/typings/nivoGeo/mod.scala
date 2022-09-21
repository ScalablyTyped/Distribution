package typings.nivoGeo

import typings.nivoCore.mod.Dimensions
import typings.nivoCore.mod.Theme
import typings.nivoGeo.anon.Feature
import typings.nivoGeo.anon.FeatureChoroplethBoundFeature
import typings.nivoGeo.anon.PartialBox
import typings.nivoGeo.nivoGeoStrings.`string VerticallineNobreakspacenumber`
import typings.nivoLegends.typesTypesMod.LegendProps
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/geo", "Choropleth")
  @js.native
  open class Choropleth protected ()
    extends Component[ChoroplethProps & Dimensions, js.Object, Any] {
    def this(props: ChoroplethProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChoroplethProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "ChoroplethCanvas")
  @js.native
  open class ChoroplethCanvas protected ()
    extends Component[ChoroplethCanvasProps & Dimensions, js.Object, Any] {
    def this(props: ChoroplethCanvasProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChoroplethCanvasProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "GeoMap")
  @js.native
  open class GeoMap protected ()
    extends Component[GeoMapProps & Dimensions, js.Object, Any] {
    def this(props: GeoMapProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GeoMapProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "GeoMapCanvas")
  @js.native
  open class GeoMapCanvas protected ()
    extends Component[GeoMapCanvasProps & Dimensions, js.Object, Any] {
    def this(props: GeoMapCanvasProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GeoMapCanvasProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "ResponsiveChoropleth")
  @js.native
  open class ResponsiveChoropleth protected ()
    extends Component[ChoroplethProps, js.Object, Any] {
    def this(props: ChoroplethProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChoroplethProps, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "ResponsiveChoroplethCanvas")
  @js.native
  open class ResponsiveChoroplethCanvas protected ()
    extends Component[ChoroplethCanvasProps, js.Object, Any] {
    def this(props: ChoroplethCanvasProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChoroplethCanvasProps, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "ResponsiveGeoMap")
  @js.native
  open class ResponsiveGeoMap protected ()
    extends Component[GeoMapProps, js.Object, Any] {
    def this(props: GeoMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GeoMapProps, context: Any) = this()
  }
  
  @JSImport("@nivo/geo", "ResponsiveGeoMapCanvas")
  @js.native
  open class ResponsiveGeoMapCanvas protected ()
    extends Component[GeoMapCanvasProps, js.Object, Any] {
    def this(props: GeoMapCanvasProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GeoMapCanvasProps, context: Any) = this()
  }
  
  trait ChoroplethBoundFeature extends StObject {
    
    var color: String
    
    var data: Any
    
    var formattedValue: `string VerticallineNobreakspacenumber`
    
    var label: String
    
    var value: Double
  }
  object ChoroplethBoundFeature {
    
    inline def apply(color: String, data: Any, label: String, value: Double): ChoroplethBoundFeature = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = "string |\u00A0number", label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoroplethBoundFeature]
    }
    
    extension [Self <: ChoroplethBoundFeature](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: `string VerticallineNobreakspacenumber`): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChoroplethCanvasProps
    extends StObject
       with ChoroplethCommonProps {
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
  }
  object ChoroplethCanvasProps {
    
    inline def apply(data: js.Array[Any], domain: js.Array[Double], features: js.Array[Any]): ChoroplethCanvasProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoroplethCanvasProps]
    }
    
    extension [Self <: ChoroplethCanvasProps](x: Self) {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    }
  }
  
  trait ChoroplethCommonProps
    extends StObject
       with CommonProps {
    
    var borderColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.undefined
    
    var borderWidth: js.UndefOr[Double | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.undefined
    
    var colors: js.UndefOr[String | js.Array[String] | (FeatureAccessor[Any, String])] = js.undefined
    
    var data: js.Array[Any]
    
    var domain: js.Array[Double]
    
    var fillColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, String])] = js.undefined
    
    var label: js.UndefOr[String | (FeatureAccessor[Any, String])] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var `match`: js.UndefOr[String | DatumMatcher] = js.undefined
    
    var onClick: js.UndefOr[ChoroplethEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[ChoroplethEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[ChoroplethEventHandler] = js.undefined
    
    var onMouseMove: js.UndefOr[ChoroplethEventHandler] = js.undefined
    
    var tooltip: js.UndefOr[ChoroplethTooltip] = js.undefined
    
    var unknownColor: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | (FeatureAccessor[Any, Double])] = js.undefined
    
    var valueFormat: js.UndefOr[String | (FeatureAccessor[Any, String | Double])] = js.undefined
  }
  object ChoroplethCommonProps {
    
    inline def apply(data: js.Array[Any], domain: js.Array[Double], features: js.Array[Any]): ChoroplethCommonProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoroplethCommonProps]
    }
    
    extension [Self <: ChoroplethCommonProps](x: Self) {
      
      inline def setBorderColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorFunction1(value: ChoroplethBoundFeature => Double): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthFunction1(value: ChoroplethBoundFeature => Double): Self = StObject.set(x, "borderWidth", js.Any.fromFunction1(value))
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColors(value: String | js.Array[String] | (FeatureAccessor[Any, String])): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Any => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setFillColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, String])): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorFunction1(value: ChoroplethBoundFeature => String): Self = StObject.set(x, "fillColor", js.Any.fromFunction1(value))
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setLabel(value: String | (FeatureAccessor[Any, String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Any => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMatch(value: String | DatumMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOnClick(
        value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: ChoroplethTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUnknownColor(value: String): Self = StObject.set(x, "unknownColor", value.asInstanceOf[js.Any])
      
      inline def setUnknownColorUndefined: Self = StObject.set(x, "unknownColor", js.undefined)
      
      inline def setValue(value: String | (FeatureAccessor[Any, Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: String | (FeatureAccessor[Any, String | Double])): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Any => String | Double): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: Any => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ChoroplethEventHandler = js.Function2[
    /* feature */ ChoroplethBoundFeature, 
    /* event */ MouseEvent[Any, NativeMouseEvent], 
    Unit
  ]
  
  trait ChoroplethProps
    extends StObject
       with ChoroplethCommonProps {
    
    var role: js.UndefOr[String] = js.undefined
  }
  object ChoroplethProps {
    
    inline def apply(data: js.Array[Any], domain: js.Array[Double], features: js.Array[Any]): ChoroplethProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoroplethProps]
    }
    
    extension [Self <: ChoroplethProps](x: Self) {
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type ChoroplethTooltip = FunctionComponent[FeatureChoroplethBoundFeature]
  
  trait CommonProps extends StObject {
    
    var enableGraticule: js.UndefOr[Boolean] = js.undefined
    
    var features: js.Array[Any]
    
    var graticuleLineColor: js.UndefOr[String] = js.undefined
    
    var graticuleLineWidth: js.UndefOr[Double] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[PartialBox] = js.undefined
    
    var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    var projectionScale: js.UndefOr[Double] = js.undefined
    
    var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var projectionType: js.UndefOr[GeoProjectionType] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object CommonProps {
    
    inline def apply(features: js.Array[Any]): CommonProps = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setEnableGraticule(value: Boolean): Self = StObject.set(x, "enableGraticule", value.asInstanceOf[js.Any])
      
      inline def setEnableGraticuleUndefined: Self = StObject.set(x, "enableGraticule", js.undefined)
      
      inline def setFeatures(value: js.Array[Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: Any*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setGraticuleLineColor(value: String): Self = StObject.set(x, "graticuleLineColor", value.asInstanceOf[js.Any])
      
      inline def setGraticuleLineColorUndefined: Self = StObject.set(x, "graticuleLineColor", js.undefined)
      
      inline def setGraticuleLineWidth(value: Double): Self = StObject.set(x, "graticuleLineWidth", value.asInstanceOf[js.Any])
      
      inline def setGraticuleLineWidthUndefined: Self = StObject.set(x, "graticuleLineWidth", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setMargin(value: PartialBox): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setProjectionRotation(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "projectionRotation", value.asInstanceOf[js.Any])
      
      inline def setProjectionRotationUndefined: Self = StObject.set(x, "projectionRotation", js.undefined)
      
      inline def setProjectionScale(value: Double): Self = StObject.set(x, "projectionScale", value.asInstanceOf[js.Any])
      
      inline def setProjectionScaleUndefined: Self = StObject.set(x, "projectionScale", js.undefined)
      
      inline def setProjectionTranslation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "projectionTranslation", value.asInstanceOf[js.Any])
      
      inline def setProjectionTranslationUndefined: Self = StObject.set(x, "projectionTranslation", js.undefined)
      
      inline def setProjectionType(value: GeoProjectionType): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
      
      inline def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait DatumMatcher extends StObject {
    
    def apply(args: Any*): Boolean = js.native
  }
  
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  
  trait GeoMapCanvasProps
    extends StObject
       with GeoMapCommonProps {
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
  }
  object GeoMapCanvasProps {
    
    inline def apply(features: js.Array[Any]): GeoMapCanvasProps = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoMapCanvasProps]
    }
    
    extension [Self <: GeoMapCanvasProps](x: Self) {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    }
  }
  
  trait GeoMapCommonProps
    extends StObject
       with CommonProps {
    
    var borderColor: js.UndefOr[String | (FeatureAccessor[Any, Double])] = js.undefined
    
    var borderWidth: js.UndefOr[Double | (FeatureAccessor[Any, Double])] = js.undefined
    
    var fillColor: js.UndefOr[String | (FeatureAccessor[Any, String])] = js.undefined
    
    var onClick: js.UndefOr[GeoMapEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[GeoMapEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[GeoMapEventHandler] = js.undefined
    
    var onMouseMove: js.UndefOr[GeoMapEventHandler] = js.undefined
    
    var tooltip: js.UndefOr[GeoMapTooltip] = js.undefined
  }
  object GeoMapCommonProps {
    
    inline def apply(features: js.Array[Any]): GeoMapCommonProps = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoMapCommonProps]
    }
    
    extension [Self <: GeoMapCommonProps](x: Self) {
      
      inline def setBorderColor(value: String | (FeatureAccessor[Any, Double])): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorFunction1(value: Any => Double): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double | (FeatureAccessor[Any, Double])): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthFunction1(value: Any => Double): Self = StObject.set(x, "borderWidth", js.Any.fromFunction1(value))
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setFillColor(value: String | (FeatureAccessor[Any, String])): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorFunction1(value: Any => String): Self = StObject.set(x, "fillColor", js.Any.fromFunction1(value))
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setOnClick(value: (/* feature */ Any, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (/* feature */ Any, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* feature */ Any, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (/* feature */ Any, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: GeoMapTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type GeoMapEventHandler = js.Function2[/* feature */ Any, /* event */ MouseEvent[Any, NativeMouseEvent], Unit]
  
  trait GeoMapProps
    extends StObject
       with GeoMapCommonProps {
    
    var role: js.UndefOr[String] = js.undefined
  }
  object GeoMapProps {
    
    inline def apply(features: js.Array[Any]): GeoMapProps = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoMapProps]
    }
    
    extension [Self <: GeoMapProps](x: Self) {
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type GeoMapTooltip = FunctionComponent[Feature]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoGeo.nivoGeoStrings.azimuthalEqualArea
    - typings.nivoGeo.nivoGeoStrings.azimuthalEquidistant
    - typings.nivoGeo.nivoGeoStrings.gnomonic
    - typings.nivoGeo.nivoGeoStrings.orthographic
    - typings.nivoGeo.nivoGeoStrings.stereographic
    - typings.nivoGeo.nivoGeoStrings.equalEarth
    - typings.nivoGeo.nivoGeoStrings.equirectangular
    - typings.nivoGeo.nivoGeoStrings.mercator
    - typings.nivoGeo.nivoGeoStrings.transverseMercator
    - typings.nivoGeo.nivoGeoStrings.naturalEarth1
  */
  trait GeoProjectionType extends StObject
  object GeoProjectionType {
    
    inline def azimuthalEqualArea: typings.nivoGeo.nivoGeoStrings.azimuthalEqualArea = "azimuthalEqualArea".asInstanceOf[typings.nivoGeo.nivoGeoStrings.azimuthalEqualArea]
    
    inline def azimuthalEquidistant: typings.nivoGeo.nivoGeoStrings.azimuthalEquidistant = "azimuthalEquidistant".asInstanceOf[typings.nivoGeo.nivoGeoStrings.azimuthalEquidistant]
    
    inline def equalEarth: typings.nivoGeo.nivoGeoStrings.equalEarth = "equalEarth".asInstanceOf[typings.nivoGeo.nivoGeoStrings.equalEarth]
    
    inline def equirectangular: typings.nivoGeo.nivoGeoStrings.equirectangular = "equirectangular".asInstanceOf[typings.nivoGeo.nivoGeoStrings.equirectangular]
    
    inline def gnomonic: typings.nivoGeo.nivoGeoStrings.gnomonic = "gnomonic".asInstanceOf[typings.nivoGeo.nivoGeoStrings.gnomonic]
    
    inline def mercator: typings.nivoGeo.nivoGeoStrings.mercator = "mercator".asInstanceOf[typings.nivoGeo.nivoGeoStrings.mercator]
    
    inline def naturalEarth1: typings.nivoGeo.nivoGeoStrings.naturalEarth1 = "naturalEarth1".asInstanceOf[typings.nivoGeo.nivoGeoStrings.naturalEarth1]
    
    inline def orthographic: typings.nivoGeo.nivoGeoStrings.orthographic = "orthographic".asInstanceOf[typings.nivoGeo.nivoGeoStrings.orthographic]
    
    inline def stereographic: typings.nivoGeo.nivoGeoStrings.stereographic = "stereographic".asInstanceOf[typings.nivoGeo.nivoGeoStrings.stereographic]
    
    inline def transverseMercator: typings.nivoGeo.nivoGeoStrings.transverseMercator = "transverseMercator".asInstanceOf[typings.nivoGeo.nivoGeoStrings.transverseMercator]
  }
}

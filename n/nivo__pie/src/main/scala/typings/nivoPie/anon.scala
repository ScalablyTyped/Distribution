package typings.nivoPie

import typings.nivoPie.distTypesTypesMod.ComputedDatum
import typings.nivoPie.distTypesTypesMod.DatumId
import typings.nivoPie.distTypesTypesMod.MayHaveLabel
import typings.nivoPie.nivoPieStrings.arc
import typings.nivoPie.nivoPieStrings.fill
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveId[RawDatum] extends StObject {
    
    var activeId: Null | DatumId
    
    var activeInnerRadiusOffset: Double
    
    var activeOuterRadiusOffset: Double
    
    var data: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]
    
    var endAngle: Double
    
    var hiddenIds: js.Array[DatumId]
    
    var innerRadius: Double
    
    var outerRadius: Double
    
    var padAngle: Double
    
    var sortByValue: Boolean
    
    var startAngle: Double
  }
  object ActiveId {
    
    inline def apply[RawDatum](
      activeInnerRadiusOffset: Double,
      activeOuterRadiusOffset: Double,
      data: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]],
      endAngle: Double,
      hiddenIds: js.Array[DatumId],
      innerRadius: Double,
      outerRadius: Double,
      padAngle: Double,
      sortByValue: Boolean,
      startAngle: Double
    ): ActiveId[RawDatum] = {
      val __obj = js.Dynamic.literal(activeInnerRadiusOffset = activeInnerRadiusOffset.asInstanceOf[js.Any], activeOuterRadiusOffset = activeOuterRadiusOffset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], hiddenIds = hiddenIds.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], sortByValue = sortByValue.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], activeId = null)
      __obj.asInstanceOf[ActiveId[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveId[?], RawDatum] (val x: Self & ActiveId[RawDatum]) extends AnyVal {
      
      inline def setActiveId(value: DatumId): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdNull: Self = StObject.set(x, "activeId", null)
      
      inline def setActiveInnerRadiusOffset(value: Double): Self = StObject.set(x, "activeInnerRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setActiveOuterRadiusOffset(value: Double): Self = StObject.set(x, "activeOuterRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Omit[ComputedDatum[RawDatum], fill | arc])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setHiddenIds(value: js.Array[DatumId]): Self = StObject.set(x, "hiddenIds", value.asInstanceOf[js.Any])
      
      inline def setHiddenIdsVarargs(value: DatumId*): Self = StObject.set(x, "hiddenIds", js.Array(value*))
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setSortByValue(value: Boolean): Self = StObject.set(x, "sortByValue", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcGenerator[RawDatum] extends StObject {
    
    var arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator
    
    var dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]]
    
    var legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]
    
    var setActiveId: Dispatch[SetStateAction[DatumId | Null]]
    
    def toggleSerie(id: DatumId): Unit
  }
  object ArcGenerator {
    
    inline def apply[RawDatum](
      arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator,
      dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]],
      legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]],
      setActiveId: SetStateAction[DatumId | Null] => Unit,
      toggleSerie: DatumId => Unit
    ): ArcGenerator[RawDatum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], dataWithArc = dataWithArc.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId), toggleSerie = js.Any.fromFunction1(toggleSerie))
      __obj.asInstanceOf[ArcGenerator[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcGenerator[?], RawDatum] (val x: Self & ArcGenerator[RawDatum]) extends AnyVal {
      
      inline def setArcGenerator(value: typings.nivoArcs.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setDataWithArc(value: js.Array[Omit[ComputedDatum[RawDatum], fill]]): Self = StObject.set(x, "dataWithArc", value.asInstanceOf[js.Any])
      
      inline def setDataWithArcVarargs(value: (Omit[ComputedDatum[RawDatum], fill])*): Self = StObject.set(x, "dataWithArc", js.Array(value*))
      
      inline def setLegendData(value: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: (Omit[ComputedDatum[RawDatum], fill | arc])*): Self = StObject.set(x, "legendData", js.Array(value*))
      
      inline def setSetActiveId(value: SetStateAction[DatumId | Null] => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
      
      inline def setToggleSerie(value: DatumId => Unit): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1(value))
    }
  }
  
  trait Box extends StObject {
    
    var box: Height
    
    var points: js.Array[js.Tuple2[Double, Double]]
    
    var ratio: Double
  }
  object Box {
    
    inline def apply(box: Height, points: js.Array[js.Tuple2[Double, Double]], ratio: Double): Box = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      inline def setBox(value: Height): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
  
  trait CenterX[RawDatum] extends StObject {
    
    var arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator
    
    var centerX: Double
    
    var centerY: Double
    
    var dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]]
    
    var debug: js.UndefOr[Box] = js.undefined
    
    var innerRadius: Double
    
    var legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]
    
    var radius: Double
    
    var setActiveId: Dispatch[SetStateAction[String | Double | Null]]
    
    def toggleSerie(id: DatumId): Unit
  }
  object CenterX {
    
    inline def apply[RawDatum](
      arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator,
      centerX: Double,
      centerY: Double,
      dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]],
      innerRadius: Double,
      legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]],
      radius: Double,
      setActiveId: SetStateAction[String | Double | Null] => Unit,
      toggleSerie: DatumId => Unit
    ): CenterX[RawDatum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], dataWithArc = dataWithArc.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId), toggleSerie = js.Any.fromFunction1(toggleSerie))
      __obj.asInstanceOf[CenterX[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CenterX[?], RawDatum] (val x: Self & CenterX[RawDatum]) extends AnyVal {
      
      inline def setArcGenerator(value: typings.nivoArcs.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setDataWithArc(value: js.Array[Omit[ComputedDatum[RawDatum], fill]]): Self = StObject.set(x, "dataWithArc", value.asInstanceOf[js.Any])
      
      inline def setDataWithArcVarargs(value: (Omit[ComputedDatum[RawDatum], fill])*): Self = StObject.set(x, "dataWithArc", js.Array(value*))
      
      inline def setDebug(value: Box): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setLegendData(value: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: (Omit[ComputedDatum[RawDatum], fill | arc])*): Self = StObject.set(x, "legendData", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSetActiveId(value: SetStateAction[String | Double | Null] => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
      
      inline def setToggleSerie(value: DatumId => Unit): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1(value))
    }
  }
  
  trait Data[RawDatum /* <: MayHaveLabel */] extends StObject {
    
    var data: js.Array[RawDatum]
  }
  object Data {
    
    inline def apply[RawDatum /* <: MayHaveLabel */](data: js.Array[RawDatum]): Data[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], RawDatum /* <: MayHaveLabel */] (val x: Self & Data[RawDatum]) extends AnyVal {
      
      inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait DataArray[RawDatum] extends StObject {
    
    var data: js.Array[Omit[ComputedDatum[RawDatum], arc]]
  }
  object DataArray {
    
    inline def apply[RawDatum](data: js.Array[Omit[ComputedDatum[RawDatum], arc]]): DataArray[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataArray[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataArray[?], RawDatum] (val x: Self & DataArray[RawDatum]) extends AnyVal {
      
      inline def setData(value: js.Array[Omit[ComputedDatum[RawDatum], arc]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Omit[ComputedDatum[RawDatum], arc])*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait DataWithArc[RawDatum] extends StObject {
    
    var dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]]
    
    var legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]
  }
  object DataWithArc {
    
    inline def apply[RawDatum](
      dataWithArc: js.Array[Omit[ComputedDatum[RawDatum], fill]],
      legendData: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]
    ): DataWithArc[RawDatum] = {
      val __obj = js.Dynamic.literal(dataWithArc = dataWithArc.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataWithArc[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataWithArc[?], RawDatum] (val x: Self & DataWithArc[RawDatum]) extends AnyVal {
      
      inline def setDataWithArc(value: js.Array[Omit[ComputedDatum[RawDatum], fill]]): Self = StObject.set(x, "dataWithArc", value.asInstanceOf[js.Any])
      
      inline def setDataWithArcVarargs(value: (Omit[ComputedDatum[RawDatum], fill])*): Self = StObject.set(x, "dataWithArc", js.Array(value*))
      
      inline def setLegendData(value: js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: (Omit[ComputedDatum[RawDatum], fill | arc])*): Self = StObject.set(x, "legendData", js.Array(value*))
    }
  }
  
  trait Datum[RawDatum] extends StObject {
    
    var datum: ComputedDatum[RawDatum]
  }
  object Datum {
    
    inline def apply[RawDatum](datum: ComputedDatum[RawDatum]): Datum[RawDatum] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datum[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datum[?], RawDatum] (val x: Self & Datum[RawDatum]) extends AnyVal {
      
      inline def setDatum(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var modifiers: js.Array[js.Array[String | Double]]
  }
  object From {
    
    inline def apply(from: String, modifiers: js.Array[js.Array[String | Double]]): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait InnerRadius[RawDatum] extends StObject {
    
    var data: js.Array[Omit[ComputedDatum[RawDatum], arc]]
    
    var innerRadius: Double
    
    var radius: Double
  }
  object InnerRadius {
    
    inline def apply[RawDatum](data: js.Array[Omit[ComputedDatum[RawDatum], arc]], innerRadius: Double, radius: Double): InnerRadius[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerRadius[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerRadius[?], RawDatum] (val x: Self & InnerRadius[RawDatum]) extends AnyVal {
      
      inline def setData(value: js.Array[Omit[ComputedDatum[RawDatum], arc]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Omit[ComputedDatum[RawDatum], arc])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var theme: String
  }
  object Theme {
    
    inline def apply(theme: String): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}

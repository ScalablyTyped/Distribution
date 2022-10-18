package typings.nivoHeatmap.anon

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveCell[Datum /* <: HeatMapDatum */] extends StObject {
  
  var activeCell: ComputedCell[Datum] | Null
  
  var cells: js.Array[ComputedCell[Datum]]
  
  var colorScale: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) | Null
  
  var height: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var setActiveCell: Dispatch[SetStateAction[ComputedCell[Datum] | Null]]
  
  var width: Double
  
  var xScale: ScaleBand[
    /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
  ]
  
  var yScale: ScaleBand[String]
}
object ActiveCell {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    cells: js.Array[ComputedCell[Datum]],
    height: Double,
    offsetX: Double,
    offsetY: Double,
    setActiveCell: SetStateAction[ComputedCell[Datum] | Null] => Unit,
    width: Double,
    xScale: ScaleBand[
      /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
    ],
    yScale: ScaleBand[String]
  ): ActiveCell[Datum] = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], setActiveCell = js.Any.fromFunction1(setActiveCell), width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any], activeCell = null, colorScale = null)
    __obj.asInstanceOf[ActiveCell[Datum]]
  }
  
  extension [Self <: ActiveCell[?], Datum /* <: HeatMapDatum */](x: Self & ActiveCell[Datum]) {
    
    inline def setActiveCell(value: ComputedCell[Datum]): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    inline def setActiveCellNull: Self = StObject.set(x, "activeCell", null)
    
    inline def setCells(value: js.Array[ComputedCell[Datum]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: ComputedCell[Datum]*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setColorScale(
      value: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])
    ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleNull: Self = StObject.set(x, "colorScale", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setSetActiveCell(value: SetStateAction[ComputedCell[Datum] | Null] => Unit): Self = StObject.set(x, "setActiveCell", js.Any.fromFunction1(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(
      value: ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: ScaleBand[String]): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}

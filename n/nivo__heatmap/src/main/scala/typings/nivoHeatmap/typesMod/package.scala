package typings.nivoHeatmap.typesMod

import typings.nivoHeatmap.anon.Id
import typings.react.mod.FunctionComponent
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellCanvasRenderer[Datum /* <: HeatMapDatum */] = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CellCanvasRendererProps[Datum], Unit]

type CellComponent[Datum /* <: HeatMapDatum */] = FunctionComponent[CellComponentProps[Datum]]

type CustomCanvasLayer[Datum /* <: HeatMapDatum */] = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CustomLayerProps[Datum], Unit]

type CustomLayer[Datum /* <: HeatMapDatum */] = FunctionComponent[CustomLayerProps[Datum]]

type HeatMapSerie[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] = Id[Datum] & ExtraProps

type TooltipComponent[Datum /* <: HeatMapDatum */] = FunctionComponent[TooltipProps[Datum]]

package typings.nivoLine.mod

import typings.nivoLine.anon.XFormatted
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessorFunc = js.Function1[/* datum */ XFormatted, String]

type CanvasLayer = LineLayerType | CustomCanvasLayer

type CustomCanvasLayer = js.Function1[/* props */ CustomCanvasLayerProps, Unit]

type CustomLayer = js.Function1[/* props */ CustomLayerProps, ReactNode]

type DatumValue = typings.nivoCore.mod.DatumValue

type Layer = LineLayerType | CustomLayer

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type PointMouseHandler = js.Function2[/* point */ Point, /* event */ MouseEvent[Element, NativeMouseEvent], Unit]

type PointTooltip = FunctionComponent[PointTooltipProps]

type SliceTooltip = FunctionComponent[SliceTooltipProps]

package typings.nivoBar.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.nivoBar.anon.Data
import typings.nivoBar.anon.Partialkeystringxnumberyn
import typings.nivoBar.nivoBarStrings.markers
import typings.react.mod.FC
import typings.std.CanvasRenderingContext2D
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BarCanvasCustomLayer[RawDatum] = js.Function2[
/* context */ CanvasRenderingContext2D, 
/* props */ BarCanvasCustomLayerProps[RawDatum], 
Unit]

type BarCanvasLayer[RawDatum] = (Exclude[BarLayerId, markers]) | BarCanvasCustomLayer[RawDatum]

type BarCustomLayer[RawDatum] = FC[BarCustomLayerProps[RawDatum]]

type BarDatum = StringDictionary[String | Double]

type BarLayer[RawDatum] = BarLayerId | BarCustomLayer[RawDatum]

type BarsWithHidden[RawDatum] = js.Array[Partialkeystringxnumberyn & Data[RawDatum]]

type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]

type ValueFormatter = js.Function1[/* value */ Double, String | Double]

package typings.nivoPie.distTypesTypesMod

import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatumId = String | Double

type MouseEventHandler[RawDatum, ElementType] = js.Function2[
/* datum */ ComputedDatum[RawDatum], 
/* event */ MouseEvent[ElementType, NativeMouseEvent], 
Unit]

type PieCustomLayer[RawDatum] = FC[PieCustomLayerProps[RawDatum]]

type PieLayer[RawDatum] = PieLayerId | PieCustomLayer[RawDatum]

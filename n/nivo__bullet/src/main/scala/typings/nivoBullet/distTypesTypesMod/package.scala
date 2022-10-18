package typings.nivoBullet.distTypesTypesMod

import typings.nivoBullet.anon.IdDatumId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatumId = String | Double

type DatumValue = Double

type MouseEventHandler[D, T] = js.Function2[/* datum */ D, /* event */ MouseEvent[T, NativeMouseEvent], Unit]

type MouseEventWithDatum[D, Element] = js.Function2[/* datum */ D, /* event */ MouseEvent[Element, typings.std.MouseEvent], Unit]

type WithDatumId[R] = R & IdDatumId

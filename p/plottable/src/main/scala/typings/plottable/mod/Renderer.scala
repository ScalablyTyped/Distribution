package typings.plottable.mod

import typings.plottable.plottableStrings.canvas
import typings.plottable.plottableStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  @JSImport("plottable", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "Renderer.canvas")
  @js.native
  def canvas: typings.plottable.plottableStrings.canvas = js.native
  @scala.inline
  def canvas_=(x: canvas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvas")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable", "Renderer.svg")
  @js.native
  def svg: typings.plottable.plottableStrings.svg = js.native
  @scala.inline
  def svg_=(x: svg): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svg")(x.asInstanceOf[js.Any])
}

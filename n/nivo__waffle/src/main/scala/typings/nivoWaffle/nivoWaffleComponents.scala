package typings.nivoWaffle

import typings.nivoCore.mod.Dimensions
import typings.nivoWaffle.mod.WaffleCanvasProps
import typings.nivoWaffle.mod.WaffleHtmlProps
import typings.nivoWaffle.mod.WaffleSvgProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoWaffleComponents extends nivoWaffleProps {
  @scala.inline
  def ResponsiveWaffle: ComponentType[ResponsiveWaffleProps] = js.constructorOf[typings.nivoWaffle.mod.ResponsiveWaffle].asInstanceOf[ComponentType[ResponsiveWaffleProps]]
  @scala.inline
  def ResponsiveWaffleCanvas: ComponentType[ResponsiveWaffleCanvasProps] = js.constructorOf[typings.nivoWaffle.mod.ResponsiveWaffleCanvas].asInstanceOf[ComponentType[ResponsiveWaffleCanvasProps]]
  @scala.inline
  def ResponsiveWaffleHtml: ComponentType[ResponsiveWaffleHtmlProps] = js.constructorOf[typings.nivoWaffle.mod.ResponsiveWaffleHtml].asInstanceOf[ComponentType[ResponsiveWaffleHtmlProps]]
  @scala.inline
  def Waffle: ComponentType[WaffleSvgProps with Dimensions] = js.constructorOf[typings.nivoWaffle.mod.Waffle].asInstanceOf[ComponentType[WaffleSvgProps with Dimensions]]
  @scala.inline
  def WaffleCanvas: ComponentType[WaffleCanvasProps with Dimensions] = js.constructorOf[typings.nivoWaffle.mod.WaffleCanvas].asInstanceOf[ComponentType[WaffleCanvasProps with Dimensions]]
  @scala.inline
  def WaffleHtml: ComponentType[WaffleHtmlProps with Dimensions] = js.constructorOf[typings.nivoWaffle.mod.WaffleHtml].asInstanceOf[ComponentType[WaffleHtmlProps with Dimensions]]
}


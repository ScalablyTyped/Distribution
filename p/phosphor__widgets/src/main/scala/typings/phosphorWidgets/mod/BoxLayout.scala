package typings.phosphorWidgets.mod

import typings.phosphorWidgets.boxlayoutMod.BoxLayout.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "BoxLayout")
@js.native
/**
  * Construct a new box layout.
  *
  * @param options - The options for initializing the layout.
  */
class BoxLayout ()
  extends typings.phosphorWidgets.boxlayoutMod.BoxLayout {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "BoxLayout")
@js.native
object BoxLayout extends js.Object {
  /**
    * Get the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout size basis for the widget.
    */
  def getSizeBasis(widget: typings.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Get the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout stretch factor for the widget.
    */
  def getStretch(widget: typings.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Set the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: typings.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
  /**
    * Set the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typings.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
}


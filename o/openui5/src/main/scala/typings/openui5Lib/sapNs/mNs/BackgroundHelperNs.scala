package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.BackgroundHelper")
@js.native
object BackgroundHelperNs extends js.Object {
  /**
    * Adds CSS classes and styles to the given RenderManager, depending on the given configuration for
    * background color and background image.To be called by control renderers supporting the global
    * themable background image within their root tag, before they call writeClasses() and writeStyles().
    * @param rm the RenderManager
    * @param sBgColor a configured custom background color for the control, if any
    * @param sBgImgUrl the configured custom background image for the control, if any
    */
  def addBackgroundColorStyles(rm: openui5Lib.sapNs.uiNs.coreNs.RenderManager): scala.Unit = js.native
  def addBackgroundColorStyles(rm: openui5Lib.sapNs.uiNs.coreNs.RenderManager, sBgColor: java.lang.String): scala.Unit = js.native
  def addBackgroundColorStyles(rm: openui5Lib.sapNs.uiNs.coreNs.RenderManager, sBgColor: java.lang.String, sBgImgUrl: js.Any): scala.Unit = js.native
  /**
    * Renders an HTML tag into the given RenderManager which carries the background image which is either
    * configured and given or coming from the current theme.Should be called right after the opening root
    * tag has been completed, so this is the first child element inside the control.
    * @param rm the RenderManager
    * @param oControl the control within which the tag will be rendered; its ID will be used to generate
    * the element ID
    * @param vCssClass a css class or an array of css classes to add to the element
    * @param sBgImgUrl the image of a configured background image; if this is not given, the theme
    * background will be used and also the other settings are ignored.
    * @param bRepeat whether the background image should be repeated/tiled (or stretched)
    * @param fOpacity the background image opacity, if any
    */
  def renderBackgroundImageTag(rm: js.Any, oControl: openui5Lib.sapNs.uiNs.coreNs.Control, vCssClass: java.lang.String): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: java.lang.String,
    sBgImgUrl: js.Any
  ): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: java.lang.String,
    sBgImgUrl: js.Any,
    bRepeat: scala.Boolean
  ): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: java.lang.String,
    sBgImgUrl: js.Any,
    bRepeat: scala.Boolean,
    fOpacity: scala.Double
  ): scala.Unit = js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: openui5Lib.sapNs.uiNs.coreNs.Control, vCssClass: js.Array[java.lang.String]): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: js.Array[java.lang.String],
    sBgImgUrl: js.Any
  ): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: js.Array[java.lang.String],
    sBgImgUrl: js.Any,
    bRepeat: scala.Boolean
  ): scala.Unit = js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    vCssClass: js.Array[java.lang.String],
    sBgImgUrl: js.Any,
    bRepeat: scala.Boolean,
    fOpacity: scala.Double
  ): scala.Unit = js.native
}


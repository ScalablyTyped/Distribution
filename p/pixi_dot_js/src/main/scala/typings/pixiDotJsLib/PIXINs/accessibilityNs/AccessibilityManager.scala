package typings
package pixiDotJsLib.PIXINs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// accessibility
@JSGlobal("PIXI.accessibility.AccessibilityManager")
@js.native
class AccessibilityManager protected () extends js.Object {
  def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  var children: js.Array[AccessibleTarget] = js.native
  var debug: scala.Boolean = js.native
  var div: stdLib.HTMLElement = js.native
  var isActive: scala.Boolean = js.native
  var pool: js.Array[stdLib.HTMLElement] = js.native
  var renderId: scala.Double = js.native
  var renderer: pixiDotJsLib.PIXINs.SystemRenderer = js.native
  /* protected */ def _onClick(e: pixiDotJsLib.PIXINs.interactionNs.InteractionEvent): scala.Unit = js.native
  /* protected */ def _onFocus(e: pixiDotJsLib.PIXINs.interactionNs.InteractionEvent): scala.Unit = js.native
  /* protected */ def _onFocusOut(e: pixiDotJsLib.PIXINs.interactionNs.InteractionEvent): scala.Unit = js.native
  /* protected */ def _onKeyDown(e: pixiDotJsLib.PIXINs.interactionNs.InteractionEvent): scala.Unit = js.native
  /* protected */ def _onMouseMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def activate(): scala.Unit = js.native
  /* protected */ def addChild(displayObject: pixiDotJsLib.PIXINs.DisplayObject): scala.Unit = js.native
  /* protected */ def capHitArea(hitArea: pixiDotJsLib.PIXINs.HitArea): scala.Unit = js.native
  def deactivate(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  /* protected */ def update(): scala.Unit = js.native
  /* protected */ def updateAccessibleObjects(displayObject: pixiDotJsLib.PIXINs.DisplayObject): scala.Unit = js.native
}


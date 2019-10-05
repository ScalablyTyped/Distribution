package typings.pixiDotJs.PIXI.accessibility

import typings.pixiDotJs.PIXI.CanvasRenderer
import typings.pixiDotJs.PIXI.DisplayObject
import typings.pixiDotJs.PIXI.HitArea
import typings.pixiDotJs.PIXI.SystemRenderer
import typings.pixiDotJs.PIXI.WebGLRenderer
import typings.pixiDotJs.PIXI.interaction.InteractionEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// accessibility
@JSGlobal("PIXI.accessibility.AccessibilityManager")
@js.native
class AccessibilityManager protected () extends js.Object {
  def this(renderer: CanvasRenderer) = this()
  def this(renderer: WebGLRenderer) = this()
  var children: js.Array[AccessibleTarget] = js.native
  var debug: Boolean = js.native
  var div: HTMLElement = js.native
  var isActive: Boolean = js.native
  var pool: js.Array[HTMLElement] = js.native
  var renderId: Double = js.native
  var renderer: SystemRenderer = js.native
  /* protected */ def _onClick(e: InteractionEvent): Unit = js.native
  /* protected */ def _onFocus(e: InteractionEvent): Unit = js.native
  /* protected */ def _onFocusOut(e: InteractionEvent): Unit = js.native
  /* protected */ def _onKeyDown(e: InteractionEvent): Unit = js.native
  /* protected */ def _onMouseMove(e: MouseEvent): Unit = js.native
  def activate(): Unit = js.native
  /* protected */ def addChild(displayObject: DisplayObject): Unit = js.native
  /* protected */ def capHitArea(hitArea: HitArea): Unit = js.native
  def deactivate(): Unit = js.native
  def destroy(): Unit = js.native
  /* protected */ def update(): Unit = js.native
  /* protected */ def updateAccessibleObjects(displayObject: DisplayObject): Unit = js.native
}


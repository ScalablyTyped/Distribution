package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.NotificationType
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(msg: String): HTMLDivElement = js.native
  def apply(msg: String, options: Buttons): HTMLDivElement = js.native
  def apply(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def apply(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def apply(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def apply(msg: String, `type`: NotificationType): HTMLDivElement = js.native
  def apply(msg: String, `type`: NotificationType, fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def apply(msg: String, `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def apply(msg: String, `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement]): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], options: Buttons): HTMLDivElement = js.native
  def apply(
    msg: JQuery[HTMLElement],
    `type`: js.UndefOr[scala.Nothing],
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], `type`: NotificationType): HTMLDivElement = js.native
  def apply(
    msg: JQuery[HTMLElement],
    `type`: NotificationType,
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def apply(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
}

package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Buttons
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notifications extends StObject {
  
  def init(): Unit = js.native
  
  def notify(msg: String): HTMLDivElement = js.native
  def notify(msg: String, options: Buttons): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: js.UndefOr[scala.Nothing], timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement]): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], options: Buttons): HTMLDivElement = js.native
  def notify(
    msg: JQuery[HTMLElement],
    `type`: js.UndefOr[scala.Nothing],
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: js.UndefOr[scala.Nothing], fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType): HTMLDivElement = js.native
  def notify(
    msg: JQuery[HTMLElement],
    `type`: NotificationType,
    fixed: js.UndefOr[scala.Nothing],
    timeout: Double
  ): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
}

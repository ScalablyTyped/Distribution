package typings.ngDashCordova.ngCordova

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogsService extends js.Object {
  def alert(message: String): IPromise[Unit] = js.native
  def alert(message: String, title: String): IPromise[Unit] = js.native
  def alert(message: String, title: String, buttonName: String): IPromise[Unit] = js.native
  def beep(repetitions: Double): Unit = js.native
  def confirm(message: String): IPromise[Double] = js.native
  def confirm(message: String, title: String): IPromise[Double] = js.native
  def confirm(message: String, title: String, buttonArray: js.Array[String]): IPromise[Double] = js.native
  def prompt(message: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String]): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String], defaultText: String): IPromise[IDialogsPromptResult] = js.native
}


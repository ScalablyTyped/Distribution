package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogsService extends js.Object {
  
  def alert(message: String): IPromise[Unit] = js.native
  def alert(message: String, title: js.UndefOr[scala.Nothing], buttonName: String): IPromise[Unit] = js.native
  def alert(message: String, title: String): IPromise[Unit] = js.native
  def alert(message: String, title: String, buttonName: String): IPromise[Unit] = js.native
  
  def beep(repetitions: Double): Unit = js.native
  
  def confirm(message: String): IPromise[Double] = js.native
  def confirm(message: String, title: js.UndefOr[scala.Nothing], buttonArray: js.Array[String]): IPromise[Double] = js.native
  def confirm(message: String, title: String): IPromise[Double] = js.native
  def confirm(message: String, title: String, buttonArray: js.Array[String]): IPromise[Double] = js.native
  
  def prompt(message: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(
    message: String,
    title: js.UndefOr[scala.Nothing],
    buttonArray: js.UndefOr[scala.Nothing],
    defaultText: String
  ): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: js.UndefOr[scala.Nothing], buttonArray: js.Array[String]): IPromise[IDialogsPromptResult] = js.native
  def prompt(
    message: String,
    title: js.UndefOr[scala.Nothing],
    buttonArray: js.Array[String],
    defaultText: String
  ): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.UndefOr[scala.Nothing], defaultText: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String]): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String], defaultText: String): IPromise[IDialogsPromptResult] = js.native
}

package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogsService extends StObject {
  
  def alert(message: String): IPromise[Unit] = js.native
  def alert(message: String, title: String): IPromise[Unit] = js.native
  def alert(message: String, title: String, buttonName: String): IPromise[Unit] = js.native
  def alert(message: String, title: Unit, buttonName: String): IPromise[Unit] = js.native
  
  def beep(repetitions: Double): Unit = js.native
  
  def confirm(message: String): IPromise[Double] = js.native
  def confirm(message: String, title: String): IPromise[Double] = js.native
  def confirm(message: String, title: String, buttonArray: js.Array[String]): IPromise[Double] = js.native
  def confirm(message: String, title: Unit, buttonArray: js.Array[String]): IPromise[Double] = js.native
  
  def prompt(message: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String]): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: js.Array[String], defaultText: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: String, buttonArray: Unit, defaultText: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: Unit, buttonArray: js.Array[String]): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: Unit, buttonArray: js.Array[String], defaultText: String): IPromise[IDialogsPromptResult] = js.native
  def prompt(message: String, title: Unit, buttonArray: Unit, defaultText: String): IPromise[IDialogsPromptResult] = js.native
}

package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablearray", JSImport.Namespace)
@js.native
object libTypesObservablearrayModMembers extends js.Object {
  def createObservableArray[T](initialValues: js.Array[_], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): IObservableArray[T] = js.native
  def isObservableArray(thing: js.Any): /* is IObservableArray */scala.Boolean = js.native
}


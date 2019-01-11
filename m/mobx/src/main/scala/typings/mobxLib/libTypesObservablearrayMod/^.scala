package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablearray", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createObservableArray[T](initialValues: js.Array[_], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ scala.Boolean = js.native
}


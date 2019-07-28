package typings.mobx.libTypesObservablearrayMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablearray", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
}


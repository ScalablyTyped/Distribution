package typings.mobx

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.observablearrayMod.IArrayChange
import typings.mobx.observablearrayMod.IArraySplice
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueDidChange
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/api/observe", JSImport.Namespace)
@js.native
object observeMod extends js.Object {
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange, Unit]): Lambda = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange, Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = js.native
  def observe[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
}


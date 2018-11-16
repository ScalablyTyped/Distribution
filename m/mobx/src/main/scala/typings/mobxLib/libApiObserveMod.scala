package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/observe", JSImport.Namespace)
@js.native
object libApiObserveMod extends js.Object {
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ mobxLib.libTypesObservableobjectMod.IObjectDidChange, scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ mobxLib.libTypesObservableobjectMod.IObjectDidChange, scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablearrayMod.IArrayChange[T] | mobxLib.libTypesObservablearrayMod.IArraySplice[T], 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablearrayMod.IArrayChange[T] | mobxLib.libTypesObservablearrayMod.IArraySplice[T], 
      scala.Unit
    ],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
      ], 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
      ], 
      scala.Unit
    ],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablemapMod.IMapDidChange[K, V], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablemapMod.IMapDidChange[K, V], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[V], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[V], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
}


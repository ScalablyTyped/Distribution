package typings
package mobxLib.mobxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  var action: mobxLib.libApiActionMod.IActionFactory = js.native
  val comparer: mobxLib.Anon_A = js.native
  var computed: mobxLib.libApiComputedMod.IComputed = js.native
  var isBoxedObservable: js.Function1[
    /* x */ js.Any, 
    /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ scala.Boolean
  ] = js.native
  var isObservableMap: js.Function1[
    /* thing */ js.Any, 
    /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ scala.Boolean
  ] = js.native
  val observable: mobxLib.libApiObservableMod.IObservableFactory with mobxLib.libApiObservableMod.IObservableFactories with mobxLib.Anon_Enhancer = js.native
  def _allowStateChanges[T](allowStateChanges: scala.Boolean, func: js.Function0[T]): T = js.native
  def _allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def _getAdministration(thing: js.Any): js.Any = js.native
  def _getAdministration(thing: js.Any, property: java.lang.String): js.Any = js.native
  def _getGlobalState(): js.Any = js.native
  def _interceptReads(
    `object`: js.Object,
    property: java.lang.String,
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[_]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def _interceptReads[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def _interceptReads[V](
    observableSet: mobxLib.libInternalMod.ObservableSet[V],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[V]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def _interceptReads[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def _interceptReads[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[V]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def _isComputingDerivation(): scala.Boolean = js.native
  def _resetGlobalState(): scala.Unit = js.native
  def autorun(view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _]): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def autorun(
    view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _],
    opts: mobxLib.libApiAutorunMod.IAutorunOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def configure(options: mobxLib.Anon_Always): scala.Unit = js.native
  def createAtom(name: java.lang.String): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(name: java.lang.String, onBecomeObservedHandler: js.Function0[scala.Unit]): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(
    name: java.lang.String,
    onBecomeObservedHandler: js.Function0[scala.Unit],
    onBecomeUnobservedHandler: js.Function0[scala.Unit]
  ): mobxLib.libCoreAtomMod.IAtom = js.native
  def decorate[T](
    clazz: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ mobxLib.mobxLibStrings.decorate with js.Any
  ): scala.Unit = js.native
  def decorate[T](
    `object`: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ mobxLib.mobxLibStrings.decorate with js.Any
  ): T = js.native
  def entries[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[js.Tuple2[scala.Double, T]] = js.native
  def entries[T](obj: T): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entries[T](set: mobxLib.libInternalMod.ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  def entries[K, T](map: mobxLib.libInternalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ mobxLib.mobxLibStrings.extendObservable with js.Any
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ mobxLib.mobxLibStrings.extendObservable with js.Any,
    options: mobxLib.libApiObservableMod.CreateObservableOptions
  ): A with B = js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, stdLib.IterableIterator[R]]): js.Function1[
    /* args */ Args, 
    mobxLib.libApiFlowMod.CancellablePromise[mobxLib.libApiFlowMod.FlowReturnType[R]]
  ] = js.native
  def get[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def get[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.UndefOr[T] = js.native
  def get[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def getAtom(thing: js.Any): mobxLib.libCoreObservableMod.IDepTreeNode = js.native
  def getAtom(thing: js.Any, property: java.lang.String): mobxLib.libCoreObservableMod.IDepTreeNode = js.native
  def getDebugName(thing: js.Any): java.lang.String = js.native
  def getDebugName(thing: js.Any, property: java.lang.String): java.lang.String = js.native
  def getDependencyTree(thing: js.Any): mobxLib.libApiExtrasMod.IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: java.lang.String): mobxLib.libApiExtrasMod.IDependencyTree = js.native
  def getObserverTree(thing: js.Any): mobxLib.libApiExtrasMod.IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: java.lang.String): mobxLib.libApiExtrasMod.IObserverTree = js.native
  def has[T /* <: js.Object */](obj: T, key: java.lang.String): scala.Boolean = js.native
  def has[K](obj: mobxLib.libInternalMod.ObservableMap[K, _], key: K): scala.Boolean = js.native
  def has[T](obj: mobxLib.libInternalMod.ObservableSet[T], key: T): scala.Boolean = js.native
  def has[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): scala.Boolean = js.native
  def intercept(
    `object`: js.Object,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservableobjectMod.IObjectWillChange]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[
      mobxLib.libTypesObservablearrayMod.IArrayWillChange[T] | mobxLib.libTypesObservablearrayMod.IArrayWillSplice[T]
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[V](
    observableMap: mobxLib.libInternalMod.ObservableSet[V],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablesetMod.ISetWillChange[V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[T]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[_]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablemapMod.IMapWillChange[K, V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def isAction(thing: js.Any): scala.Boolean = js.native
  def isArrayLike(x: js.Any): scala.Boolean = js.native
  def isComputed(value: js.Any): scala.Boolean = js.native
  def isComputedProp(value: js.Any, propName: java.lang.String): scala.Boolean = js.native
  def isObservable(value: js.Any): scala.Boolean = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ scala.Boolean = js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ scala.Boolean = js.native
  def isObservableProp(value: js.Any, propName: java.lang.String): scala.Boolean = js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ scala.Boolean = js.native
  def keys[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[scala.Double] = js.native
  def keys[K](map: mobxLib.libInternalMod.ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[java.lang.String] = js.native
  def keys[T](set: mobxLib.libInternalMod.ObservableSet[T]): js.Array[T] = js.native
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
  def observe[V](
    observableMap: mobxLib.libInternalMod.ObservableSet[V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablesetMod.ISetDidChange[V], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[V](
    observableMap: mobxLib.libInternalMod.ObservableSet[V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablesetMod.ISetDidChange[V], scala.Unit],
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
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
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
  def onBecomeObserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libInternalMod.ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libInternalMod.ObservableSet[_], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](
    value: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libInternalMod.ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libInternalMod.ObservableSet[_], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](
    value: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onReactionError(
    handler: js.Function2[
      /* error */ js.Any, 
      /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit]
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit],
    opts: mobxLib.libApiAutorunMod.IReactionOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def remove[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def remove[T](obj: mobxLib.libInternalMod.ObservableSet[T], key: T): js.Any = js.native
  def remove[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.Any = js.native
  def remove[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K): js.Any = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: java.lang.String, block: js.Function0[T]): T = js.native
  def set[T /* <: js.Object */](obj: T, key: java.lang.String, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def set[V](
    obj: mobxLib.libInternalMod.ObservableMap[java.lang.String, V],
    values: org.scalablytyped.runtime.StringDictionary[V]
  ): js.Any = js.native
  def set[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double, value: T): js.Any = js.native
  def set[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def spy(listener: js.Function1[/* change */ js.Any, scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def toJS(source: js.Any): js.Any = js.native
  def toJS(source: js.Any, options: mobxLib.libApiTojsMod.ToJSOptions): js.Any = js.native
  def toJS[T](source: T): T = js.native
  def toJS[T](source: T, options: mobxLib.libApiTojsMod.ToJSOptions): T = js.native
  def trace(): scala.Unit = js.native
  def trace(enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def trace(thing: js.Any): scala.Unit = js.native
  def trace(thing: js.Any, enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def trace(thing: js.Any, prop: java.lang.String): scala.Unit = js.native
  def trace(thing: js.Any, prop: java.lang.String, enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def values[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[_] = js.native
  def values[T](set: mobxLib.libInternalMod.ObservableSet[T]): js.Array[T] = js.native
  def values[K, T](map: mobxLib.libInternalMod.ObservableMap[K, T]): js.Array[T] = js.native
  def when(predicate: js.Function0[scala.Boolean]): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
  def when(predicate: js.Function0[scala.Boolean], effect: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(
    predicate: js.Function0[scala.Boolean],
    effect: mobxLib.libUtilsUtilsMod.Lambda,
    opts: mobxLib.libApiWhenMod.IWhenOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(predicate: js.Function0[scala.Boolean], opts: mobxLib.libApiWhenMod.IWhenOptions): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
}


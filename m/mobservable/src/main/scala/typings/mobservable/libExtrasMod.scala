package typings.mobservable

import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libInterfacesMod.IDependencyTree
import typings.mobservable.libInterfacesMod.IObserverTree
import typings.mobservable.libInterfacesMod.ITransitionEvent
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libSimpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtrasMod {
  
  @JSImport("mobservable/lib/extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDNode(thing: Any): DataNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getDNode")(thing.asInstanceOf[js.Any]).asInstanceOf[DataNode]
  inline def getDNode(thing: Any, property: String): DataNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDNode")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[DataNode]
  
  inline def getDependencyTree(thing: Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
  inline def getDependencyTree(thing: Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
  
  inline def getObserverTree(thing: Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
  inline def getObserverTree(thing: Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
  
  inline def reportTransition(node: DataNode, state: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportTransition")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportTransition(node: DataNode, state: String, changed: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportTransition")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any], changed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportTransition(node: DataNode, state: String, changed: Boolean, newValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportTransition")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportTransition(node: DataNode, state: String, changed: Unit, newValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportTransition")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackTransitions(): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")().asInstanceOf[Lambda]
  inline def trackTransitions(extensive: Boolean): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  inline def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def trackTransitions(extensive: Unit, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @JSImport("mobservable/lib/extras", "transitionTracker")
  @js.native
  def transitionTracker: default = js.native
  inline def transitionTracker_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionTracker")(x.asInstanceOf[js.Any])
}

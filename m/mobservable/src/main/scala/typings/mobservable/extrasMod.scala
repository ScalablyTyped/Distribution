package typings.mobservable

import typings.mobservable.dnodeMod.DataNode
import typings.mobservable.interfacesMod.IDependencyTree
import typings.mobservable.interfacesMod.IObserverTree
import typings.mobservable.interfacesMod.ITransitionEvent
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.simpleeventemitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrasMod {
  
  @JSImport("mobservable/lib/extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/extras", "getDNode")
  @js.native
  def getDNode(thing: js.Any): DataNode = js.native
  @JSImport("mobservable/lib/extras", "getDNode")
  @js.native
  def getDNode(thing: js.Any, property: String): DataNode = js.native
  
  @JSImport("mobservable/lib/extras", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  @JSImport("mobservable/lib/extras", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  
  @JSImport("mobservable/lib/extras", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  @JSImport("mobservable/lib/extras", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  
  @JSImport("mobservable/lib/extras", "reportTransition")
  @js.native
  def reportTransition(node: DataNode, state: String): Unit = js.native
  @JSImport("mobservable/lib/extras", "reportTransition")
  @js.native
  def reportTransition(node: DataNode, state: String, changed: js.UndefOr[scala.Nothing], newValue: js.Any): Unit = js.native
  @JSImport("mobservable/lib/extras", "reportTransition")
  @js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean): Unit = js.native
  @JSImport("mobservable/lib/extras", "reportTransition")
  @js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean, newValue: js.Any): Unit = js.native
  
  @JSImport("mobservable/lib/extras", "trackTransitions")
  @js.native
  def trackTransitions(): Lambda = js.native
  @JSImport("mobservable/lib/extras", "trackTransitions")
  @js.native
  def trackTransitions(extensive: js.UndefOr[scala.Nothing], onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  @JSImport("mobservable/lib/extras", "trackTransitions")
  @js.native
  def trackTransitions(extensive: Boolean): Lambda = js.native
  @JSImport("mobservable/lib/extras", "trackTransitions")
  @js.native
  def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  
  @JSImport("mobservable/lib/extras", "transitionTracker")
  @js.native
  def transitionTracker: default = js.native
  @scala.inline
  def transitionTracker_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionTracker")(x.asInstanceOf[js.Any])
}

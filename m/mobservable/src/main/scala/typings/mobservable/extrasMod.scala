package typings.mobservable

import typings.mobservable.dnodeMod.DataNode
import typings.mobservable.interfacesMod.IDependencyTree
import typings.mobservable.interfacesMod.IObserverTree
import typings.mobservable.interfacesMod.ITransitionEvent
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.simpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/extras", JSImport.Namespace)
@js.native
object extrasMod extends js.Object {
  var transitionTracker: default = js.native
  def getDNode(thing: js.Any): DataNode = js.native
  def getDNode(thing: js.Any, property: String): DataNode = js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  def reportTransition(node: DataNode, state: String): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: js.UndefOr[scala.Nothing], newValue: js.Any): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean): Unit = js.native
  def reportTransition(node: DataNode, state: String, changed: Boolean, newValue: js.Any): Unit = js.native
  def trackTransitions(): Lambda = js.native
  def trackTransitions(extensive: js.UndefOr[scala.Nothing], onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  def trackTransitions(extensive: Boolean): Lambda = js.native
  def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
}


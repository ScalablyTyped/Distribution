package typings
package mobservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Extensive extends js.Object {
  var SimpleEventEmitter: org.scalablytyped.runtime.Instantiable0[mobservableLib.libSimpleeventemitterMod.default] = js.native
  def getDNode(thing: js.Any): js.Any = js.native
  def getDependencyTree(thing: js.Any): mobservableLib.libInterfacesMod.IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: java.lang.String): mobservableLib.libInterfacesMod.IDependencyTree = js.native
  def getObserverTree(thing: js.Any): mobservableLib.libInterfacesMod.IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: java.lang.String): mobservableLib.libInterfacesMod.IObserverTree = js.native
  def trackTransitions(): mobservableLib.libInterfacesMod.Lambda = js.native
  def trackTransitions(extensive: scala.Boolean): mobservableLib.libInterfacesMod.Lambda = js.native
  def trackTransitions(
    extensive: scala.Boolean,
    onReport: js.Function1[/* lines */ mobservableLib.libInterfacesMod.ITransitionEvent, scala.Unit]
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def withStrict(newStrict: scala.Boolean, func: mobservableLib.libInterfacesMod.Lambda): scala.Unit = js.native
}


package typings
package mobservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SimpleEventEmitter extends js.Object {
  var SimpleEventEmitter: org.scalablytyped.runtime.Instantiable0[mobservableLib.libSimpleeventemitterMod.default]
  var getDNode: js.Function1[/* thing */ js.Any, _]
  var getDependencyTree: js.Function2[
    /* thing */ js.Any, 
    /* property */ js.UndefOr[java.lang.String], 
    mobservableLib.libInterfacesMod.IDependencyTree
  ]
  var getObserverTree: js.Function2[
    /* thing */ js.Any, 
    /* property */ js.UndefOr[java.lang.String], 
    mobservableLib.libInterfacesMod.IObserverTree
  ]
  var trackTransitions: js.Function2[
    /* extensive */ js.UndefOr[scala.Boolean], 
    /* onReport */ js.UndefOr[
      js.Function1[/* lines */ mobservableLib.libInterfacesMod.ITransitionEvent, scala.Unit]
    ], 
    mobservableLib.libInterfacesMod.Lambda
  ]
  var withStrict: js.Function2[
    /* newStrict */ scala.Boolean, 
    /* func */ mobservableLib.libInterfacesMod.Lambda, 
    scala.Unit
  ]
}


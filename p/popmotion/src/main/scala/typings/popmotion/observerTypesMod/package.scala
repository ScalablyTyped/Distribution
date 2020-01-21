package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerTypesMod {
  type Complete = js.Function0[js.Any]
  type Error = js.Function1[/* err */ js.UndefOr[js.Any], js.Any]
  type Middleware = js.Function2[
    /* update */ typings.popmotion.observerTypesMod.Update, 
    /* complete */ js.UndefOr[typings.popmotion.observerTypesMod.Complete], 
    js.Function1[/* v */ js.Any, js.Any]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.popmotion.observerTypesMod.Update
    - typings.popmotion.observerTypesMod.IObserver
    - typings.popmotion.observerTypesMod.PartialObserver
  */
  type ObserverCandidate = typings.popmotion.observerTypesMod._ObserverCandidate | typings.popmotion.observerTypesMod.Update
  type ObserverEvent = js.Function2[/* type */ js.UndefOr[java.lang.String], /* v */ js.UndefOr[js.Any], js.Any]
  type ObserverFactory = js.Function2[
    /* observerCandidate */ typings.popmotion.observerTypesMod.ObserverCandidate, 
    /* props */ typings.popmotion.observerTypesMod.ObserverProps, 
    typings.popmotion.observerTypesMod.IObserver
  ]
  type ObserverProps = typings.popmotion.observerTypesMod.PartialObserver with typings.popmotion.AnonMiddleware
  type Update = js.Function
}

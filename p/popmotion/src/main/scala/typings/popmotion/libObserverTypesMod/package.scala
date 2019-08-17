package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObserverTypesMod {
  import typings.popmotion.Anon_Middleware

  type Complete = js.Function0[js.Any]
  type Error = js.Function1[/* err */ js.UndefOr[js.Any], js.Any]
  type Middleware = js.Function2[
    /* update */ Update, 
    /* complete */ js.UndefOr[Complete], 
    js.Function1[/* v */ js.Any, js.Any]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.popmotion.libObserverTypesMod.Update
    - typings.popmotion.libObserverTypesMod.IObserver
    - typings.popmotion.libObserverTypesMod.PartialObserver
  */
  type ObserverCandidate = _ObserverCandidate | Update
  type ObserverEvent = js.Function2[/* type */ js.UndefOr[String], /* v */ js.UndefOr[js.Any], js.Any]
  type ObserverFactory = js.Function2[/* observerCandidate */ ObserverCandidate, /* props */ ObserverProps, IObserver]
  type ObserverProps = PartialObserver with Anon_Middleware
  type Update = js.Function
}

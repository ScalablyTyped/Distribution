package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pouchdbDashCoreLib {
  type Fetch = js.Function2[
    /* url */ java.lang.String | stdLib.Request, 
    /* opts */ js.UndefOr[stdLib.RequestInit], 
    js.Promise[stdLib.Response]
  ]
}

package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This represents a key-value mapping linking routes to components. */
trait RouteDefs
  extends /** The key represents the route. The value represents the corresponding component. */
/* url */ org.scalablytyped.runtime.StringDictionary[(ComponentTypes[_, _]) | (RouteResolver[_, _])]

object RouteDefs {
  @scala.inline
  def apply(
    StringDictionary: /** The key represents the route. The value represents the corresponding component. */
  /* url */ org.scalablytyped.runtime.StringDictionary[(ComponentTypes[_, _]) | (RouteResolver[_, _])] = null
  ): RouteDefs = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteDefs]
  }
}


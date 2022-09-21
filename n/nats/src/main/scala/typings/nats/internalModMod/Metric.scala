package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "Metric")
@js.native
open class Metric protected ()
  extends typings.nats.benchMod.Metric {
  def this(name: String, duration: Double) = this()
}
/* static members */
object Metric {
  
  @JSImport("nats/lib/nats-base-client/internal_mod", "Metric")
  @js.native
  val ^ : js.Any = js.native
  
  inline def header(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[String]
}

package typings.p2.global.p2

import typings.p2.mod.WorldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.World")
@js.native
//static integrateBody(body: Body, dy: number): void;
class World ()
  extends typings.p2.mod.World {
  def this(options: WorldOptions) = this()
}
/* static members */
object World {
  
  @JSGlobal("p2.World")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.World.BODY_SLEEPING")
  @js.native
  def BODY_SLEEPING: Double = js.native
  inline def BODY_SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BODY_SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.World.ISLAND_SLEEPING")
  @js.native
  def ISLAND_SLEEPING: Double = js.native
  inline def ISLAND_SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISLAND_SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.World.NO_SLEEPING")
  @js.native
  def NO_SLEEPING: Double = js.native
  inline def NO_SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SLEEPING")(x.asInstanceOf[js.Any])
}

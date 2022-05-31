package typings.p2.global.p2

import typings.p2.mod.BodyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Body")
@js.native
class Body ()
  extends typings.p2.mod.Body {
  def this(options: BodyOptions) = this()
}
/* static members */
object Body {
  
  @JSGlobal("p2.Body")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Body.AWAKE")
  @js.native
  def AWAKE: Double = js.native
  inline def AWAKE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAKE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.DYNAMIC")
  @js.native
  def DYNAMIC: Double = js.native
  inline def DYNAMIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.KINEMATIC")
  @js.native
  def KINEMATIC: Double = js.native
  inline def KINEMATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KINEMATIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.SLEEPING")
  @js.native
  def SLEEPING: Double = js.native
  inline def SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.SLEEPY")
  @js.native
  def SLEEPY: Double = js.native
  inline def SLEEPY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.STATIC")
  @js.native
  def STATIC: Double = js.native
  inline def STATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC")(x.asInstanceOf[js.Any])
}

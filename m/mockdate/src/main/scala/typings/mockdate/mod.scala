package typings.mockdate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("mockdate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    @JSImport("mockdate", "default.reset")
    @js.native
    def reset_Fdefault: js.Function0[Unit] = js.native
    
    inline def reset_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("mockdate", "default.set")
    @js.native
    def set: js.Function1[/* date */ String | Double | js.Date, Unit] = js.native
    inline def set(date: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set(date: js.Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set(date: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set_=(x: js.Function1[/* date */ String | Double | js.Date, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  }
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def set(date: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(date: js.Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(date: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

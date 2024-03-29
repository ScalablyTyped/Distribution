package typings.pacResolver

import typings.pacResolver.mod.GMT
import typings.pacResolver.mod.Weekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekdayRangeMod {
  
  @JSImport("pac-resolver/dist/weekdayRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(wd1: Weekday): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(wd1: Weekday, wd2: Unit, gmt: GMT): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any], wd2.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(wd1: Weekday, wd2: GMT): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any], wd2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(wd1: Weekday, wd2: GMT, gmt: GMT): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any], wd2.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(wd1: Weekday, wd2: Weekday): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any], wd2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(wd1: Weekday, wd2: Weekday, gmt: GMT): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wd1.asInstanceOf[js.Any], wd2.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

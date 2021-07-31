package typings.ol

import typings.ol.gmlbaseMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmlMod {
  
  @JSImport("ol/format/GML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  @scala.inline
  def default(opt_options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

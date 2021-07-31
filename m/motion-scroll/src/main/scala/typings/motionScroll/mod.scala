package typings.motionScroll

import typings.motionScroll.anon.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("motion-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def scroll(config: Axis): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

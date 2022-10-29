package typings.pixiJs.mod

import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("pixi.js", "DisplayObject")
@js.native
open class DisplayObject ()
  extends typings.pixiDisplay.mod.DisplayObject
/* static members */
object DisplayObject {
  
  @JSImport("pixi.js", "DisplayObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mixes all enumerable properties and methods from a source object to DisplayObject.
    * @param source - The source of properties and methods to mix in.
    */
  inline def mixin(source: Dict[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

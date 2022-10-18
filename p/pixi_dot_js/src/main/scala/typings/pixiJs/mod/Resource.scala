package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("pixi.js", "Resource")
@js.native
/**
  * @param width - Width of the resource
  * @param height - Height of the resource
  */
open class Resource ()
  extends typings.pixiCore.mod.Resource {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Unit, height: Double) = this()
}
/* static members */
object Resource {
  
  @JSImport("pixi.js", "Resource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Abstract, used to auto-detect resource type.
    * @param {*} _source - The source object
    * @param {string} _extension - The extension of source, if set
    */
  inline def test(_source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test(_source: Any, _extension: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any], _extension.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

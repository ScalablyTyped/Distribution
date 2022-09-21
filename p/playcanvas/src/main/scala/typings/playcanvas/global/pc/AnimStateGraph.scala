package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An asset resource which represents an anim state graph. It can be loaded into an anim component using the {@link AnimComponent#loadStateGraph} method.
  *
  * ## Usage
  * Scripts can retrieve an AnimStateGraph instance from assets of type 'animstategraph'. An AnimStateGraph can then be loaded into an anim component as follows:
  * ```javascript
  * const animStateGraph = app.assets.get(ASSET_ID).resource;
  * const entity = new pc.Entity();
  * entity.addComponent('anim');
  * entity.anim.loadStateGraph(animStateGraph);
  * ```
  */
@JSGlobal("pc.AnimStateGraph")
@js.native
open class AnimStateGraph protected ()
  extends typings.playcanvas.mod.AnimStateGraph {
  /**
    * Create an AnimStateGraph instance from JSON data.
    *
    * @param {object} data - The JSON data to create the AnimStateGraph from.
    * @hideconstructor
    */
  def this(data: js.Object) = this()
}

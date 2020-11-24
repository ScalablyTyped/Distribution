package typings.openlayers.mod.proj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "proj.setProj4")
@js.native
object setProj4 extends js.Object {
  
  /**
    * Register proj4. If not explicitly registered, it will be assumed that
    * proj4js will be loaded in the global namespace. For example in a
    * browserify ES6 environment you could use:
    *
    *     import ol from 'openlayers';
    *     import proj4 from 'proj4';
    *     ol.proj.setProj4(proj4);
    *
    * @param proj4 Proj4.
    * @api
    */
  def apply(proj4: js.Any): Unit = js.native
}

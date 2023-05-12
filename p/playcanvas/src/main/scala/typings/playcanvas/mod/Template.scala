package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a Template resource from raw database data.
  */
@JSImport("playcanvas", "Template")
@js.native
open class Template protected () extends StObject {
  /**
    * Create a new Template instance.
    *
    * @param {import('./app-base.js').AppBase} app - The application.
    * @param {object} data - Asset data from the database.
    */
  def this(app: AppBase, data: js.Object) = this()
  
  var _app: AppBase = js.native
  
  var _data: Any = js.native
  
  def _parseTemplate(): Unit = js.native
  
  var _templateRoot: Entity = js.native
  
  /**
    * Create an instance of this template.
    *
    * @returns {import('./entity.js').Entity} The root entity of the created instance.
    */
  def instantiate(): Entity = js.native
}

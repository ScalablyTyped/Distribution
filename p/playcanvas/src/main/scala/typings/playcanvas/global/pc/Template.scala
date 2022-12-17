package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./app-base.js').AppBase} AppBase */
/** @typedef {import('./entity.js').Entity} Entity */
/**
  * Create a Template resource from raw database data.
  */
@JSGlobal("pc.Template")
@js.native
open class Template protected ()
  extends typings.playcanvas.mod.Template {
  /**
    * Create a new Template instance.
    *
    * @param {AppBase} app - The application.
    * @param {object} data - Asset data from the database.
    */
  def this(app: typings.playcanvas.mod.AppBase, data: js.Object) = this()
}

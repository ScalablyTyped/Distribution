package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('../framework/entity.js').Entity} Entity */
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
  def this(app: AppBase, data: js.Object) = this()
}

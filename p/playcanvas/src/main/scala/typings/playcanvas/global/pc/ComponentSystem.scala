package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../app-base.js').AppBase} AppBase */
/** @typedef {import('./component.js').Component} Component */
/** @typedef {import('../entity.js').Entity} Entity */
/**
  * Component Systems contain the logic and functionality to update all Components of a particular
  * type.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.ComponentSystem")
@js.native
open class ComponentSystem protected ()
  extends typings.playcanvas.mod.ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}

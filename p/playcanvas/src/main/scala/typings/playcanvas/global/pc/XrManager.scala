package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../components/camera/component.js').CameraComponent} CameraComponent */
/** @typedef {import('../app-base.js').AppBase} AppBase */
/** @typedef {import('../entity.js').Entity} Entity */
/**
  * Callback used by {@link XrManager#endXr} and {@link XrManager#startXr}.
  *
  * @callback XrErrorCallback
  * @param {Error|null} err - The Error object or null if operation was successful.
  */
/**
  * Manage and update XR session and its states.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrManager")
@js.native
open class XrManager protected ()
  extends typings.playcanvas.mod.XrManager {
  /**
    * Create a new XrManager instance.
    *
    * @param {AppBase} app - The main application.
    * @hideconstructor
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}

package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer Composition is a collection of {@link Layer} that is fed to {@link Scene#layers} to define
  * rendering order.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.LayerComposition")
@js.native
/**
  * Create a new layer composition.
  *
  * @param {string} [name] - Optional non-unique name of the layer composition. Defaults to
  * "Untitled" if not specified.
  */
open class LayerComposition ()
  extends typings.playcanvas.mod.LayerComposition {
  def this(name: String) = this()
}

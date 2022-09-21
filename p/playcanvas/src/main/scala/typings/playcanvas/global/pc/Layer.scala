package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Layer represents a renderable subset of the scene. It can contain a list of mesh instances,
  * lights and cameras, their render settings and also defines custom callbacks before, after or
  * during rendering. Layers are organized inside {@link LayerComposition} in a desired order.
  */
@JSGlobal("pc.Layer")
@js.native
/**
  * Create a new Layer instance.
  *
  * @param {object} options - Object for passing optional arguments. These arguments are the
  * same as properties of the Layer.
  */
open class Layer ()
  extends typings.playcanvas.mod.Layer {
  def this(options: js.Object) = this()
}

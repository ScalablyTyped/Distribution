package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new layer composition.
  * @property layerList - A read-only array of {@link pc.Layer} sorted in the order they will be rendered.
  * @property subLayerList - A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means only semi-transparent objects are rendered, and false means opaque.
  * @property subLayerEnabled - A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means the layer is rendered, false means it's skipped.
  * @property cameras - A read-only array of {@link pc.CameraComponent} that can be used during rendering, e.g. Inside
  * {@link pc.Layer#onPreCull}, {@link pc.Layer#onPostCull}, {@link pc.Layer#onPreRender}, {@link pc.Layer#onPostRender}.
  */
@JSImport("playcanvas", "LayerComposition")
@js.native
class LayerComposition ()
  extends StObject
     with typings.playcanvas.pc.LayerComposition

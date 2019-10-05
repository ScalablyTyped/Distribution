package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.LayerComposition
  * @extends pc.EventHandler
  * @classdesc Layer Composition is a collection of {@link pc.Layer} that is fed to {@link pc.Scene#layers} to define rendering order.
  * @description Create a new layer composition.
  * @property {pc.Layer[]} layerList A read-only array of {@link pc.Layer} sorted in the order they will be rendered.
  * @property {Boolean[]} subLayerList A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means only semi-transparent objects are rendered, and false means opaque.
  * @property {Boolean[]} subLayerEnabled A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means the layer is rendered, false means it's skipped.
  * @property {pc.CameraComponent[]} cameras A read-only array of {@link pc.CameraComponent} that can be used during rendering, e.g. inside
  * {@link pc.Layer#onPreCull}, {@link pc.Layer#onPostCull}, {@link pc.Layer#onPreRender}, {@link pc.Layer#onPostRender}.
  */
@JSImport("playcanvas", "LayerComposition")
@js.native
class LayerComposition ()
  extends typings.playcanvas.pc.LayerComposition


package typings.playcanvas.global.pc

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Loads files that contain multiple resources. For example glTF files can contain
  textures, models and animations.
  The asset options object can be used for passing in load time callbacks to handle the various resources
  at different stages of loading as follows:
  ```
  |---------------------------------------------------------------------|
  |  resource   |  preprocess |   process   |processAsync | postprocess |
  |-------------+-------------+-------------+-------------+-------------|
  | global      |      x      |             |             |      x      |
  | node        |      x      |      x      |             |      x      |
  | animation   |      x      |             |             |      x      |
  | material    |      x      |      x      |             |      x      |
  | texture     |      x      |             |      x      |      x      |
  | buffer      |      x      |             |      x      |      x      |
  |---------------------------------------------------------------------|
  ```
  For example, to receive a texture preprocess callback:
  ```javascript
  var containerAsset = new pc.Asset(filename, 'container', { url: url, filename: filename }, null, {
  texture: {
  preprocess: function (gltfTexture) { console.log("texture preprocess"); }
  },
  });
  ```
  * @param device - The graphics device that will be rendering.
  * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@JSGlobal("pc.ContainerHandler")
@js.native
class ContainerHandler protected () extends ResourceHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    defaultMaterial: typings.playcanvas.pc.StandardMaterial
  ) = this()
}


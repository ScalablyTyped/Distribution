package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Extern Game Object is a special type of Game Object that allows you to pass
  * rendering off to a 3rd party.
  * 
  * When you create an Extern and place it in the display list of a Scene, the renderer will
  * process the list as usual. When it finds an Extern it will flush the current batch,
  * clear down the pipeline and prepare a transform matrix which your render function can
  * take advantage of, if required.
  * 
  * The WebGL context is then left is a 'clean' state, ready for you to bind your own shaders,
  * or draw to it, whatever you wish to do. Once you've finished, you should free-up any
  * of your resources. The Extern will then rebind the Phaser pipeline and carry on 
  * rendering the display list.
  * 
  * Although this object has lots of properties such as Alpha, Blend Mode and Tint, none of
  * them are used during rendering unless you take advantage of them in your own render code.
  */
@js.native
trait Extern
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with Origin
     with ScrollFactor
     with Size
     with Texture
     with Tint
     with Transform
     with Visible
